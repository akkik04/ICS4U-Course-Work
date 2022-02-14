/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-11
 * 
 * PALINDROME DETECTION #3 IN JAVA.
 * THIS PROGRAM INTENDS TO DETECT IF AN ENTIRE PHRASE/SENTENCE INPUTTED IS A PALINDROME.
*/

// importing the scanner class.
import java.util.Scanner;

public class Palindrome3 {

    // creating a function with the inputted string as a parameter.
    public static String checkPalindrome(String s) {

        // creating variables to store the original string with modifications and the reversed version of the original string.
        String originalS = s.replaceAll("\\s","").toLowerCase();
        String revS = "";

        // creating an array of characters with the original version of the modified string. 
        char characters[] = originalS.toCharArray();

        // creating a for-loop to iterate backwards from the characters array.
        for (int i= characters.length - 1; i >= 0; i--){

            // adding each character to the reversed variable from the reverse direction.
            revS += characters[i];
        }

        // creating an if-statement to check if the original string matches the reversed variation of the string.
        if (originalS.equals(revS)){

            return s + " is a palindrome";
        }

        else {

            return s + " is not a palindrome";
        }
        
    }

    // main method.
    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // prompting the user to enter a phrase/sentence without any punctuation marks.
        System.out.print("Please enter a phrase without any punctuation marks: ");
        String s = kp.nextLine();

        // creating a variable to store and print the string returned by the function.
        String answer = checkPalindrome(s);
        System.out.println(answer);
    }
}