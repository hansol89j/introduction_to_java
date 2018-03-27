package ch6_methods;

/**
 * Created by hansoljeong on 2018. 3. 12..
 */
public class Exercise6_38 {
    public static void main(String[] args){
        final int NUMNBER_OF_UPPERCASE_LETTERS = 100; // Number of uppercase letters
        final int NUMNBER_OF_SINGLE_DIGITS = 100;	// Number of single digits
        final int NUMBERS_PER_LINE = 10; // Print 10 characters per line

        for (int i = 0; i < NUMNBER_OF_UPPERCASE_LETTERS; i++){
            System.out.print(RandomCharacter.getRandomUpperCaseLetter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }

        for (int i = 1; i <= NUMNBER_OF_SINGLE_DIGITS; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }
    }
}
