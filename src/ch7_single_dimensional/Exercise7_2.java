package ch7_single_dimensional;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 3. 19..
 */
public class Exercise7_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        System.out.print("Enter ten integers: ");
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();

    }
}
