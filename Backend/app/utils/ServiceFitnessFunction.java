package utils;/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;
import org.json.JSONObject;

/**
 * Sample fitness function for the MakeChange example.
 *
 * @author Neil Rotstan
 * @author Klaus Meffert
 * @since 1.0
 */
class ServiceFitnessFunction
    extends FitnessFunction {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.18 $";


  public static final int MAX_BOUND = 4000;

  public ServiceFitnessFunction() {
  }

  /**
   * Determine the fitness of the given Chromosome instance. The higher the
   * return value, the more fit the instance. This method should always
   * return the same fitness value for two equivalent Chromosome instances.
   *
   * @param a_subject the Chromosome instance to evaluate
   *
   * @return positive double reflecting the fitness rating of the given
   * Chromosome
   * @since 2.0 (until 1.1: return type int)
   * @author Neil Rotstan, Klaus Meffert, John Serri
   */
  public double evaluate(IChromosome a_subject) {
    // Take care of the fitness evaluator. It could either be weighting higher
    // fitness values higher (e.g.DefaultFitnessEvaluator). Or it could weight
    // lower fitness values higher, because the fitness value is seen as a
    // defect rate (e.g. DeltaFitnessEvaluator)
    boolean defaultComparation = a_subject.getConfiguration().
        getFitnessEvaluator().isFitter(2, 1);

    double fitness;

    fitness = 0.0;

    int[] servicesList = new int[3];

    servicesList = listOfServices(a_subject);

    double S1cost = getServiceValues("cost","S1",servicesList[0]);
    double S1time = getServiceValues("time","S1",servicesList[0]);
    double S1reliability = getServiceValues("reliability","S1",servicesList[0]);
    double S1availability = getServiceValues("availability","S1",servicesList[0]);

    double S2cost = getServiceValues("cost","S2",servicesList[1]);
    double S2time = getServiceValues("time","S2",servicesList[1]);
    double S2reliability = getServiceValues("reliability","S2",servicesList[1]);
    double S2availability = getServiceValues("availability","S2",servicesList[1]);

    double S3cost = getServiceValues("cost","S3",servicesList[2]);
    double S3time = getServiceValues("time","S3",servicesList[2]);
    double S3reliability = getServiceValues("reliability","S3",servicesList[2]);
    double S3availability = getServiceValues("availability","S3",servicesList[2]);

    fitness += (10*S1reliability + 35*S1availability)/(35*S1cost + 20*S1time);


    double S2check = (10*S2reliability + 35*S2availability)/(35*S2cost + 20*S2time);
    if (S2check!=S2check){
      fitness += 5;
    }else{
      fitness += S2check;
    }
    fitness += (10*S3reliability + 35*S3availability)/(35*S3cost + 20*S3time);
    return fitness;
  }

  public static int[] listOfServices(IChromosome a_potentialSolution) {
    int[] outlist = new int[3];

    int S1 = getServices(a_potentialSolution, 0);
    int S2 = getServices(a_potentialSolution, 1);
    int S3 = getServices(a_potentialSolution, 2);

    outlist[0] = S1;
    outlist[1] = S2;
    outlist[2] = S3;
    return outlist;
  }
  public static int getServices(IChromosome a_potentialSolution,
                                           int a_position) {
    Integer serviceNumber =
        (Integer) a_potentialSolution.getGene(a_position).getAllele();
    return serviceNumber.intValue();
  }

  public static double getServiceValues(String serviceValue, String topLevelService, int serviceNumber){

    JSONObject services = Services.initializeServices();
    JSONObject topLevel= (JSONObject) services.get(topLevelService);
    JSONObject specificService = (JSONObject) topLevel.get(topLevelService + serviceNumber);

    double outValue = specificService.getDouble(serviceValue);

    return outValue;

  }

}
