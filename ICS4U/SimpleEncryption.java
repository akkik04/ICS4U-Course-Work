/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-12
 * 
 * SIMPLE ENCRYPTION IN JAVA:
 * THIS PROGRAM INTENDS TO ENCRYPT AND DECRYPT A GIVEN STRING USING A GIVEN CONSTANT NUMBER OF CHARACTER SHIFTS.
*/

// importing the scanner class.
import java.util.Scanner;

public class SimpleEncryption {

    // creating a function to encrypt the inputted string.
    public static String encryptString(String str, int shiftConstant) {

        // creating an array of the words in the inputted string, and a variable to store the encrypted string.
        String arr[] = str.split(" ");
        String encryptedS = "";

        // creating a for-loop to iterate through the words in the array.
        for (int i=0; i < arr.length; i++){

            // creating a variable to store the current word.
            String cur_word = arr[i];

            // creating an array of all the characters in the current word.
            char characters[] = cur_word.toCharArray();

            // creating a nested for-loop to iterate for the characters in the current word.
            for (int j=0; j < characters.length; j++){

                // encrypting the characters by the chosen shift amount.
                characters[j] += shiftConstant;
            }
            
            // converting the shifted array of characters into a string.
            String s = String.valueOf(characters);

            // adding the encrypted string into the appropriate variable.
            encryptedS += s;
            encryptedS += " ";

            // re-setting the 's' variable to convert the next word's encrypted letters into a string.
            s = "";
        }

        // returning the encrypted version of the string.
        return encryptedS;
    }

    // creating a function to decrypt the inputted string.
    public static String decryptString(String str, int shiftConstant) {

        // creating an array of the words in the inputted string, and a variable to store the decrypted string.
        String arr[] = str.split(" ");
        String decryptedS = "";

        // creating a for-loop to iterate through the words in the array.
        for (int i=0; i < arr.length; i++){

            // creating a variable to store the current word.
            String cur_word = arr[i];

            // creating an array of all the characters in the current word.
            char characters[] = cur_word.toCharArray();

            // creating a nested for-loop to iterate for the characters in the current word.
            for (int j=0; j < characters.length; j++){

                // decrypting the characters by the chosen shift amount.
                characters[j] -= shiftConstant;
            }

            // converting the shifted array of characters into a string.
            String s = String.valueOf(characters);

            // adding the decrypted string into the appropriate variable.
            decryptedS += s;
            decryptedS += " ";

            // re-setting the 's' variable to convert the next word's decrypted letters into a string.
            s = "";
        }

        // returning the decrypted version of the string.
        return decryptedS;
    }

    // main method.
    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // prompting the user to enter a string, while applying appropriate modifications to the inputted string.
        System.out.print("Please enter a phrase: ");
        String str = kp.nextLine();
        str = str.toUpperCase();

        // prompting the user to enter a shift amount for rotating the characters.
        System.out.print("Please enter the character rotation amount (1-25): ");
        int shiftConstant = kp.nextInt();

        // prompting the user to specify if the inputted string needs to be encrypted or decrypted.
        System.out.print("1. Encrypt , 2. Decrypt. ");
        int EorD = kp.nextInt();

        // creating an if-statement to check for encryption or decryption.
        if (EorD == 1){

            // code to encrypt the inputted string.
            String answer = encryptString(str, shiftConstant);
            System.out.println(answer);
        }

        else if (EorD == 2){

            // code to decrypt the inputted string.
            String ans = decryptString(str, shiftConstant);
            System.out.println(ans);
        }
    }
}