package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 19..
 */
public class Exercise5_18A {
    public static void main(String[] args){
        int number = 6;

        for(int row = 1; row <= number; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}

