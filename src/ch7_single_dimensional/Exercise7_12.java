package ch7_single_dimensional;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 3. 19..
 */
public class Exercise7_12 {
    public static void main(String[] args){
        double[] array = new double[10];
        Scanner input = new Scanner(System.in);

        System.out.print("Enter " + array.length + " numbers: ");
        for (int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }

        double[] reverse = reverse(array);

        System.out.println("The array in reverse: ");
        printArray(reverse, 10);
    }

    public static double[] reverse(double[] original){
        double[] reverse = new double[original.length];
        int endIndex = original.length - 1;

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = original[endIndex--];
        }

        return reverse;
    }

    public static void printArray(double[] array, int numberPerLine){
        for (int i = 0; i < array.length; i++){
            System.out.printf("%4.2f ", array[i]);
            if ((i + 1) % numberPerLine == 0)
                System.out.println("");
        }
    }
}
