package ch5_loops;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 19..
 */
public class Exercise5_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        for(int rows = 1; rows <= number; rows++){
            for(int s = number - rows; s >= 1; s--){
                System.out.print("  ");
            }
            for(int l = rows; l >= 2; l--){
                System.out.print(l + " ");
            }

            for(int col = 1; col <= rows; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
