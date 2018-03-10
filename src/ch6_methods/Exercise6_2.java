package ch6_methods;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 21..
 */
public class Exercise6_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter an integer
        System.out.print("Enter a integer: ");
        long number = input.nextLong();

        System.out.println("The sum of the digits in " + number + " is " + sumDigits(number));
    }

    public static long sumDigits(long n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
