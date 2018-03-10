package ch6_methods;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 21..
 */
public class Exercise6_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "Palindrome.");
    }

    public static int reverse(int number){
        String reverse = "";
        String n = number + "";

        for(int i = n.length() - 1; i >= 0; i--){
            reverse += n.charAt(i);
        }

        return Integer.parseInt(reverse);
    }

    public static boolean isPalindrome(int number){
        return number == reverse(number) ? true : false;
    }
}
