package ch7_single_dimensional;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 3. 19..
 */
public class Exercise7_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] distinctNum = new int[10];
        int num;
        int count = 0;

        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < 10; i++){
            num = input.nextInt();
            if(isDistinct(distinctNum, num)){
                distinctNum[count] = num;
                count++;
            }
        }

        System.out.println("The number of distinct numbers is " + count);
        System.out.print("The distinct numbers are");
        for(int i = 0; i < distinctNum.length; i++){
            if(distinctNum[i] > 0)
                System.out.print(" " + distinctNum[i]);
        }
        System.out.println();
    }

    public static boolean isDistinct(int[]array, int num){
        for (int i = 0; i < array.length; i++){
            if(num == array[i])
                return false;
        }
        return true;
    }
}
