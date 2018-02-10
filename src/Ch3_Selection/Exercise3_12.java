package Ch3_Selection;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 10..
 */
public class Exercise3_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three digit integer: ");
        int digit = input.nextInt();

        // Test for palindrome
        int digit1 = (int)(digit / 100);
        int remaining = digit % 100;
        int digit3 = (int)(remaining % 10);

        // Display result
        System.out.println(
                digit + ((digit1 == digit3) ? " is a " : " is not a ") + "palindrome");
    }
}
