package ch6_methods;

/**
 * Created by hansoljeong on 2018. 2. 22..
 */
public class Exercise6_10 {
    public static void main(String[] args) {
        int numberOfPrimes = 0;	// Counts the number of prime numbers

        // Find the number of prime numbers less than 10000
        for (int i = 1; i < 1000; i++) {
            if (PrimeNumberMethod.isPrime(i))
                numberOfPrimes++; // Increament
        }

        // Display result
        System.out.println(
                "The number of prime numbers less than 10000: " + numberOfPrimes);
    }
}
