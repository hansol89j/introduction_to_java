package ch6_methods;

/**
 * Created by hansoljeong on 2018. 3. 10..
 */
public class Exercise6_26 {
    public static void main(String[] args){
        final int NUMBER_OF_PALINDROMIC_PRIMES = 100;
        final int NUMBERS_PER_LINE = 10;

        int count = 0;
        int n = 2;

        while(count < NUMBER_OF_PALINDROMIC_PRIMES){
            if(isPalindrome(n)){
                count++;
                System.out.print(count % NUMBERS_PER_LINE == 0 ? n + "\n" : n + " ");
            }
            n++;
        }
    }

    public static boolean isPalindrome(int num){
        return PrimeNumberMethod.isPrime(num) && Exercise6_3.isPalindrome(num);
    }
}
