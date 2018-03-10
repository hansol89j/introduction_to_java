package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 11..
 */
public class Exercise5_3 {
    public static void main(String[] args) {

        System.out.printf("%-12s%8s\n", "Kilograms", "Pounds");

        for (int i = 1; i < 200; i += 2) {
            System.out.printf("%-12d%8.1f\n", i, i * 2.2);
        }
    }
}
