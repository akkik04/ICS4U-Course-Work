/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-11
 * 
 * MORSE CODE PROGRAM IN JAVA:
 * THIS PROGRAM INTENDS TO CONVERT AN INPUT STRING INTO MORSE CODE AND DISPLAY IT BACK TO THE SCREEN.
 */

// importing the scanner class.
import java.util.Scanner;

public class MorseCode {

    // creating a function to convert a given string to morse code.
    public static String convertToMorse(String initialString) {

        // creating a variable to store the morse code version of the string.
        String morseCode = "";

        // creating an array of morse code, corresponding to each letter and number consecutively.
        String[] morse = {" ", ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
        ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
        "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
        "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
        "-----"};

        // creating an array of letters and numbers.
        char[] letters = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 
        '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

        // creating a for-loop to iterate through the characters in the inputted string.
        for (int i = 0; i < initialString.length(); i++) {

            // creating a nested for-loop to iterate through the '37' characters present in the letters array.
            for (int j = 0; j < 37; j++) {

                // creating a nested if-statement to check for the corresponding morse character of each letter in the string.
                if (initialString.charAt(i) == letters[j]) {

                    // adding the appropriate morse character into the appropriate variable, with a space after each addition.
                    morseCode += morse[j];
                    morseCode += "   ";
                break;

                }        
            }
        }

        // returning the morse code version of the inputted string.
        return "The text in morse code is: " + "\n" + morseCode;
    }

    // main method.
    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // creating a variable to store the inputted string.
        String initialString = "";
        System.out.print("Please enter the string you want to change to Morse Code: ");
        initialString = kp.nextLine();
        
        // converting the inputted string to all lowercase.
        initialString = initialString.toLowerCase();

        // creating a variable to store and print the string returned by the function.
        String answer = convertToMorse(initialString);
        System.out.println(answer);
    }
}