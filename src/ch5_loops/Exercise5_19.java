package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 19..
 */
public class Exercise5_19 {
    public static void main(String[] args){
        int startRight = 0;
        int endSpace = 7;

        for(int row = 1; row <= 128; row += row){
            for(int startSpace = 0; startSpace < endSpace; startSpace++){
                System.out.print("    ");
            }

            for(int l = 1; l <= row; l += l){
                System.out.printf("%4d", (l));
            }

            for(int r = startRight; r > 0; r /= 2){
                System.out.printf("%4d", (r));
            }
            System.out.println();
            endSpace--;
            startRight = row;
        }
    }
}
