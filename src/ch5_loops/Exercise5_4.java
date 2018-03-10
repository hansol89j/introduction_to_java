package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 11..
 */
public class Exercise5_4 {
    public static void main(String[] args) {

        System.out.printf("%-12s%8s\n", "Miles", "Kilometers");

        for (int i = 1; i < 10; i++) {
            System.out.printf("%-12d%5.3f\n", i, i * 1.609);
        }
    }
}
