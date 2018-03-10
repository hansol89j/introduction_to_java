package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 19..
 */
public class Exercise5_18C {
    public static void main(String[] args){
        for(int row = 1; row <= 6; row++){
            for(int s = 6 - row; s >= 1; s--){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
