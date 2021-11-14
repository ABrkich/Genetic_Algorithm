/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */

import org.jgap.*;
import org.jgap.audit.EvolutionMonitor;
import org.jgap.data.DataTreeBuilder;
import org.jgap.data.IDataCreators;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;
import org.jgap.xml.XMLDocumentBuilder;
import org.jgap.xml.XMLManager;
import org.json.JSONObject;
import org.w3c.dom.Document;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class provides an implementation of the classic "Make change" problem
 * using a genetic algorithm. The goal of the problem is to provide a
 * specified amount of change (from a cash purchase) in the fewest coins
 * possible. This example implementation uses American currency (quarters,
 * dimes, nickels, and pennies).
 * <p>
 * This example may be seen as somewhat significant because it demonstrates
 * the use of a genetic algorithm in a less-than-optimal problem space.
 * The genetic algorithm does best when there is a smooth slope of fitness
 * over the problem space towards the optimum solution. This problem exhibits
 * a more choppy space with more local optima. However, as can be seen from
 * running this example, the genetic algorithm still will get the correct
 * (or a very close) answer virtually everytime.
 *
 * @author Neil Rotstan
 * @author Klaus Meffert
 * @since 1.0
 */
public class ServiceDecider {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.27 $";

  /**
   * The total number of times we'll let the population evolve.
   */
  private static final int MAX_ALLOWED_EVOLUTIONS = 50;

  public static void serviceGenes() throws InvalidConfigurationException {

    Configuration conf = new DefaultConfiguration();
    conf.setPreservFittestIndividual(true);
    conf.setKeepPopulationSizeConstant(false);

    //create gene structure
    Gene[] sampleGenes = new Gene[3];
    sampleGenes[0] = new IntegerGene(conf, 1, 5); // S1
    sampleGenes[1] = new IntegerGene(conf, 1, 6); // S2 //if 0-3, do s1->s2->s3, else skip
    sampleGenes[2] = new IntegerGene(conf, 1, 7); // S3
    IChromosome sampleChromosome = new Chromosome(conf, sampleGenes);

    conf.setSampleChromosome(sampleChromosome);
    //set population size
    conf.setPopulationSize(10);

    //set fitness function
    FitnessFunction myFunc =
            new ServiceFitnessFunction();
    conf.setFitnessFunction(myFunc);

    //randomize population based on gene structure
    Genotype population;
    population = Genotype.randomInitialGenotype(conf);

    Services services = new Services();
    JSONObject servicesObj = services.initializeServices();

    //begin iteration life cycle
    double bestValue = 100000;
    //100 iteration life cycle
    for (int i = 0; i < 100; i++)
    {
      //for each chromosome
      //calculate fitness (this is built it see bestSolutionSoFar)
      IChromosome bestSolutionSoFar = population.getFittestChromosome();
      double v1 = bestSolutionSoFar.getFitnessValue();
      System.out.println("The best solution has a fitness value of " +
              bestSolutionSoFar.getFitnessValue());
      bestSolutionSoFar.setFitnessValueDirectly(-1);
      int[] servicesList = new int[3];
      servicesList = ServiceFitnessFunction.listOfServices(bestSolutionSoFar);

      System.out.println("Service 1 is S1" + servicesList[0]);
      System.out.println("Service 2 is S2" + servicesList[1]);
      System.out.println("Service 3 is S3" + servicesList[2]);

      //compare to bestValue
      if (v1 < bestValue) { bestValue = v1; }

      //breed
      //mutate
      population.evolve();
    }
  }


  /**
   * Main method. A single command-line argument is expected, which is the
   * amount of change to create (in other words, 75 would be equal to 75
   * cents).
   *
   * @param args amount of change in cents to create
   * @throws Exception
   *
   * @author Neil Rotstan
   * @author Klaus Meffert
   * @since 1.0
   */
  public static void main(String[] args)
      throws Exception {

    serviceGenes();

  }

  /**
   * @param a_pop the population to verify
   * @return true if all chromosomes in the populationa are unique
   *
   * @author Klaus Meffert
   * @since 3.3.1
   */
  public static boolean uniqueChromosomes(Population a_pop) {
    // Check that all chromosomes are unique
    for(int i=0;i<a_pop.size()-1;i++) {
      IChromosome c = a_pop.getChromosome(i);
      for(int j=i+1;j<a_pop.size();j++) {
        IChromosome c2 =a_pop.getChromosome(j);
        if (c == c2) {
          return false;
        }
      }
    }
    return true;
  }
}
