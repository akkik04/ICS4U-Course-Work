/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-11
 * 
 * PALINDROME DETECTION #2 IN JAVA.
 * THIS PROGRAM INTENDS TO DETECT ALL THE PALINDROMES THAT ARE PRESENT WITHIN AN INPUTTED STRING SENTENCE.
*/

// importing the scanner class.
import java.util.Scanner;

public class Palindrome2 {

    // creating a function to find the palindromic words in a sentence.
    public static String checkPalindrome(String str) {

        // creating an array of the words in the inputted sentence and a variable to count the palindromic words in the sentence.
        String arr[] = str.split(" ");
        int count = 0;

        // creating a for-loop to iterate through the array of words.
        for (int i = 0; i < arr.length; i++) {

            // creating a variable to store the current word, and an array to store the characters in the current word.
            String curr_word = arr[i];
            char characters[] = curr_word.toCharArray();

            // creating a variable to store the reversed variation of the current word.
            String revString = "";

            // creating a nested for-loop to add the characters in the current words array from reverse into the reversed variation of the string.
            for (int j = characters.length - 1; j >= 0; j--){

                revString += characters[j];
            }

            // creating a nested if-statement to check if the current word is a palindrome.
            if (curr_word.equals(revString)){

                // printing that the current word is a palindrome, and incrementing the count variable by 1.
                System.out.println((count + 1) + ". " + "'" + curr_word + "'" + " is a palindrome.");
                count++;

                // code to re-set the reversed variation of the string variable to default for the next iteration.
                revString = "";
            }
        }

        // code to print the total count of palindromes in the sentence.
        return "There are " + count + " palindrome(s) in the sentence.";
    }

    // main method.
    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // prompting the user to enter a sentence.
        System.out.print("Enter a sentence: ");
        String str = kp.nextLine();
        
        // code to apply appropriate modifications on the inputted string.
        str = str.toLowerCase();
        str = str + ' ';

        // creating a variable to store and print the string returned by the function.
        String answer = checkPalindrome(str);
        System.out.println(answer);
    }
}