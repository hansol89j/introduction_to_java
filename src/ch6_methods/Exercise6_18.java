package ch6_methods;

import java.util.Scanner;

/**
 * Created by hansoljeong on 2018. 2. 23..
 */
public class Exercise6_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // Create a Scanner

        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        System.out.println();
    }

    public static boolean isValidPassword(String password){
        final int LENGTH_OF_VALID_PASSWORD = 8;
        final int MINIMUM_NUMBER_OF_DIGITS = 2;

        boolean validPassword = isLengthValid(password, LENGTH_OF_VALID_PASSWORD) && isOnlyLetterAndDigits(password) && hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);

        return validPassword;
    }

    public static boolean isLengthValid(String password, int validLength){
        return password.length() >= validLength;
    }

    public static boolean isOnlyLetterAndDigits(String password){
        for(int i = 0; i < password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean hasNDigits(String password, int n){
        int numberDigits = 0;

        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                numberDigits++;
            }
            if(numberDigits >= n){
                return true;
            }
        }
        return false;
    }
}
