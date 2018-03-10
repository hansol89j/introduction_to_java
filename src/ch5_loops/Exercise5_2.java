package ch5_loops;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 11..
 */
public class Exercise5_2 {
    public static void main(String[] args){
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS){
            int n1 = (int)(Math.random() * 16 + 1);
            int n2 = (int)(Math.random() * 16 + 1);

            if(n1 < n2){
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }

            System.out.print("What is " + n1 + " - " + n2 + "? ");
            int answer = input.nextInt();

            if(n1 - n2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else{
                System.out.println("Your answer is wrong.\n" + n1 + " - " + n2 + " should be " + (n1 - n2));
            }
            count++;
            output += "\n" + n1 + "-" + n2 + "=" + answer + ((n1 - n2 == answer) ? " correct" : " wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);
    }
}
