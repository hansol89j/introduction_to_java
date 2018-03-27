package ch6_methods;

/**
 * Created by hansoljeong on 2018. 3. 12..
 */
public class Exercise6_27 {
    public static void main(String[] args){
        final int NUMBER_OF_EMIRPS = 100; // Displays the first 100 emirps
        final int EMIRPS_PER_LINE = 10; // Display 10 numbers per line

        int count = 0; // Counts the number of emirps
        int n = 2; // Possible emirps

        // Displays the first 100 emirps. Display 10 numbers per line,
        // separated by exactly one space
        while (count < NUMBER_OF_EMIRPS) {
            if (isEmirp(n)) {
                count++; // Increment count
                System.out.print(count % EMIRPS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++; // Increment n
        }
    }

    public static boolean isEmirp(int num){
        return PrimeNumberMethod.isPrime(Exercise6_3.reverse(num)) && !Exercise6_3.isPalindrome(num);
    }
}
