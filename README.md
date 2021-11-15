# Genetic_Algorithm

# Fitness Function

Our Fitness Function for Lab 4 is calculated firstly by normalizing all of the data inputs from 0 to 1. 
The Fitness Function is normalized with the greatest value being 1, and the smallest value being 0.

Our equation for the Fitness Function is as follows:
- (reliability + availability) / (cost + time)

The fitness of a chromosome is determined by having as large of a value as possible because of this we wanted to choose a fitness function that selected as small of a cost and time as possible and as large of a reliability and availability as possible.

The above function is applied to each gene separately and then the sum of those is used as the overall fitness. 
For the services we decided to normalize them by their top level designations. This places all the values between 0 and 1 and allows us
to not over weight a service in S1 because a service in S3 has a high value.
For gene for S2 we added 3 null services that represent the recommender choosing to skip service 2 all
together. These three services have a very low cost and time (0.1 to avoid dividing my zero error) and the largest possible value of 1 for availability and reliability.
This is because it costs nothing and takes no time if we don't go to S2 and this option requires no availability or maintenence. 


# Genes

In our Algorithm, we define three seperate genes: 
- a gene for S1
- a gene for S2
- a gene for S3

When our algorithm runs, our chromoses get assigned random values for each of these three genes based on the sample input.
To simulate 'skipping' S2, we added 3 null services that represent the recommender choosing to skip service 2 all
together. These three services have a very low cost and time (0.1 to avoid dividing my zero error). This is to simulate S1 directly to S3 having a better fitness than S1 to S2 to S3.

# Chromosomes

Our Chromosomes are made of up three Genes representing S1, S2, and S3. Our population size represents the number of seperate chromosomes we run fitness functions on. Each of these chromosomes are tested by our fitness function, and we keep track of the most fit chromosome we have seen throughout our iterations.

After each iteration, we breed our chromosomes to induce randomness in our chromosomes to continue searching the space for other solutions. We also provide a change for a chromosome to have a mutation, meaning one of the genes for that chromosome gets randomly reassigned/recalculated. This makes sure we don't get trapped in local minima, and can continue searching for the best possible chromosome as determined by our fitness function.
