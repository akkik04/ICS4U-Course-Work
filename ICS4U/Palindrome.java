/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-11
 * 
 * PALINDROME DETECTION #1 IN JAVA.
 * THIS PROGRAM INTENDS TO DETECT A PALINDROME FROM A STRING INPUTTED BY THE USER.
 */

// importing the scanner class.
import java.util.Scanner;

public class Palindrome {

    // creating a function with the parameter as the inputted string.
    public static String checkPalindrome(String s) {

        // creating variables, the original string, and the reversed version of the string.
        String originalS = s.toLowerCase();
        String revString = "";

        // creating a character array of the original string, as we will iterate from the end of it.
        char characters[] = originalS.toCharArray();

        // creating a for-loop to iterate for the length of the character array, from reverse.
        for (int i=characters.length - 1; i >= 0; i--){

            // adding the characters from the opposite direction into the reversed variable.
            revString += characters[i];
        }

        // code to print the reversed version of the string.
        System.out.println("The reversed version of the string is: " + revString);

        // creating an if-statement to check if the reversed version of the string is the same as the front (original) version.
        if (originalS.equals(revString)){

            return "The word you entered is a palindrome!";
        }

        else {

            return "The word you entered is not a palindrome.";
        }
        
    }

    // main method.
    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // prompting the user to enter a string.
        System.out.print("Enter a string please: ");
        String s = kp.nextLine();

        // code to store and print the answer returned by the function.
        String answer = checkPalindrome(s);
        System.out.println(answer);
    }
}