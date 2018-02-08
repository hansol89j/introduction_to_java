package JavaIntro;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2017. 11. 19..
 */
public class Ch1_2_2 {
    public static void main(String[] args){
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number for diameter: ");
        double diameter = input.nextDouble();

        double radius = diameter / 2;
        double area = radius * radius * PI;
        double circum = 2 * radius * PI;

        System.out.println("Area of circle is " + area);
        System.out.println("Circumstance of circle is " + circum);
    }
}
