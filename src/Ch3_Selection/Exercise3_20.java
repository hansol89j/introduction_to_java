package Ch3_Selection;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 10..
 */
public class Exercise3_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double p1 = input.nextInt();
        double p2 = input.nextInt();

        double xDistance = Math.pow(p1 * p1, 0.5D);
        double yDistance = Math.pow(p2 * p2, 0.5D);

        if ((yDistance <= 2.5) && (xDistance <= 5.0)) {
            System.out.println("Point (" + p1 + ", " + p2 + ") is in the rectangle.");
        } else {
            System.out.println("Point (" + p1 + ", " + p2 + ") is not in the rectangle.");
        }
    }
}
