package ch5_loops;

/**
 * Created by hansoljeong on 2018. 2. 11..
 */
public class Exercise5_5 {
    public static void main(String[] args){
        System.out.printf("%-12s%8s", "Kilograms", "Pounds");
        System.out.printf("\t\t|\t\t");
        System.out.printf("%-12s%-8s\n", "Pounds", "Kilograms");

        for (int i = 1, j = 20; i < 200 && j < 516; i += 2, j += 5) {
            System.out.printf("%-12d%8.1f", i, i * 2.2);
            System.out.printf("\t\t|\t\t");
            System.out.printf("%-12d%-8.2f\n", j, j / 2.2);
        }
    }
}
