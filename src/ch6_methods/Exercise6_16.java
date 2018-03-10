package ch6_methods;

/**
 * Created by hansoljeong on 2018. 2. 23..
 */
public class Exercise6_16 {
    public static void main(String[] args){
        System.out.print("Year      Days in year\n");
        for(int year = 2000; year <= 2020; year++){
            System.out.println(year + "      " + numberOfDaysInYear(year));
        }
    }

    public static int numberOfDaysInYear(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;

    }

    public static boolean isLeapYear(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
