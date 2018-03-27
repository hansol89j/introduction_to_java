package ch7_single_dimensional;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 3. 19..
 */
public class Exercise7_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = input.nextInt();
        String[][] students = new String[2][size];

        for (int i = 0; i < students[1].length; i++){
            System.out.print("Enter student #" + (i + 1) + " name: ");
            students[0][i] = input.next();
            System.out.print("Enter student #" + (i + 1) + " score: ");
            students[1][i] = input.next();
        }

        sort(students);
        printArray(students);
    }

    public static void sort(String[][] students){
        for (int i = 0; i < students[1].length - 1; i++){
            int currentIndex = 0;
            int currentMin = new Integer(students[1][i]);
            String name = "";
            for (int k = i + 1; k < students[1].length; k++){
                if (currentMin > Integer.parseInt(students[1][k])){
                    currentMin = Integer.parseInt(students[1][k]);
                    name = students[0][k];
                    currentIndex = k;
                }
            }

            if (currentIndex != i) {
                students[0][currentIndex] = students[0][i];
                students[1][currentIndex] = students[1][i];
                students[0][i] = name;
                students[1][i] = Integer.toString(currentMin);
            }
        }
    }

    public static void printArray(String[][] array){
        for (int i = array[1].length - 1; i >= 0; i--){
            System.out.println("Student: " + array[0][i] + " Score: " + array[1][i]);
        }
    }
}
