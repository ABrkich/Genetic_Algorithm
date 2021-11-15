package utils;/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */

import org.jgap.*;

import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

import org.json.JSONObject;


public class ServiceDecider {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.27 $";

  /**
   * The total number of times we'll let the population evolve.
   */
  private static final int MAX_ALLOWED_EVOLUTIONS = 50;

  public static JSONObject serviceGenes() throws InvalidConfigurationException {
    Configuration.reset();
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
    double v1 = 0.0;
    int[] servicesList = new int[3];
    //100 iteration life cycle
    for (int i = 0; i < 100; i++)
    {
      //for each chromosome
      //calculate fitness (this is built it see bestSolutionSoFar)
      IChromosome bestSolutionSoFar = population.getFittestChromosome();
      v1 = bestSolutionSoFar.getFitnessValue();
      bestSolutionSoFar.setFitnessValueDirectly(-1);

      //compare to bestValue
      if (v1 < bestValue) { bestValue = v1; }
      servicesList = ServiceFitnessFunction.listOfServices(bestSolutionSoFar);

      //breed
      //mutate
      population.evolve();
    }

    JSONObject outjson = new JSONObject();

    IChromosome bestSolutionSoFar = population.getFittestChromosome();


    System.out.println("Fittest services");
    System.out.println("Fitness is " + v1);
    System.out.println("Service 1 is S1" + servicesList[0]);
    System.out.println("Service 2 is S2" + servicesList[1]);
    System.out.println("Service 3 is S3" + servicesList[2]);

    outjson.put("Fitness", v1);
    outjson.put("Services", servicesList);

    return outjson;


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
