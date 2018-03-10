package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 19..
 */
public class Exercise5_18D {
    public static void main(String[] args){
        for(int row = 6; row >= 1; row--) {
            for (int ws = 0; ws < row; ws++) {
                System.out.print("  ");
            }
            for (int col = 0; col < 6 - row; col++) {
                System.out.print((col + 1) + " ");
            }
            System.out.println();
        }
    }
}
