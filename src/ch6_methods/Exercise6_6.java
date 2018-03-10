package ch6_methods;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 22..
 */
public class Exercise6_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter the number of rows
        System.out.print("Enter the number of rows: ");
        int numberOfRows = input.nextInt();

        displayPattern(numberOfRows);
    }

    public static void displayPattern(int n){
        int padding = n - 1;
        for (int r = 1; r <= n; r++){
            for(int p = 0; p < padding; p++) {
                System.out.print("  ");
            }
            for(int i = r; i > 0; i--){
                System.out.print(i + " ");
            }
            System.out.println();
            padding--;
        }
    }
}
