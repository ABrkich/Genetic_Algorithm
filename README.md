# Genetic_Algorithm

# Fitness Function

Our Fitness Function for Lab 4 is calculated firstly by normalizing all of the data inputs from 0 to 1. 
The Fitness Function is normalized with the greatest value being 1, and the smallest value being 0.

Our equation for the Fitness Function is as follows:
- (reliability + availability) / (cost + time)

Using this method, a fitness closer to 1 is better than a fitness closer to 0. 
If cost and time are small, this makes the number higher, leading toward a fitness closer to 1.
If reliability and availability are small, this makes the number lower, leading toward a fitness closer to 0.
We think this is a great equation to determine the fitness of the services provided.


# Genes

In our Algorithm, we define three seperate genes: 
- a gene for S1
- a gene for S2
- a gene for S3

When our algorithm runs, our chromoses get assigned random values for each of these three genes based on the sample input.
To simulate 'skipping' S2, we have given S2 a 50% chance to return NaN. If S2 gets assigned NaN, our fitness function will make the S2 value high enough to have a good fitness. This is to simulate S1 directly to S3 having a better fitness than S1 to S2 to S3.

# Chromosomes

Our Chromosomes are made of up three Genes representing S1, S2, and S3. Our population size represents the number of seperate chromosomes we run fitness functions on. Each of these chromosomes are tested by our fitness function, and we keep track of the most fit chromosome we have seen throughout our iterations.

After each iteration, we breed our chromosomes to induce randomness in our chromosomes to continue searching the space for other solutions. We also provide a change for a chromosome to have a mutation, meaning one of the genes for that chromosome gets randomly reassigned/recalculated. This makes sure we don't get trapped in local minima, and can continue searching for the best possible chromosome as determined by our fitness function.
