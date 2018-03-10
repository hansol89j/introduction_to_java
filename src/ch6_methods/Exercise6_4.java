package ch6_methods;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 21..
 */
public class Exercise6_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create Scanner

        System.out.println("Display and integer reversed:");

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number){
        String reverse = "";
        String n = number + "";

        for(int i = n.length() - 1; i >= 0; i--){
            reverse += n.charAt(i);
        }
        System.out.println(Integer.parseInt(reverse));
    }
}
