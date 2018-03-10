package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 19..
 */
public class Exercise5_18B {
    public static void main(String[] args){

        for(int row = 6; row >= 1; row--){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
