package ch7_single_dimensional;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 3. 19..
 */
public class Exercise7_8 {
    public static void main(String[] args){
        double[] numbers = new double[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 double numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextDouble();

        System.out.println("The average value is: " + average(numbers));
    }

    public static int average(int[] array){
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;
    }

    public static double average(double[] array){
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total / array.length;

    }

    public static void printArray(int[] array, int numberPerLine){
        for (int i = 0; i < array.length; i++) {

            System.out.printf("%4d", array[i]);
            if ((i + 1) % numberPerLine == 0) System.out.println("");
        }
    }
}
