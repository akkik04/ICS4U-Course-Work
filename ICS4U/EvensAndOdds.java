/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-03-08
 * 
 * Q2 ICS4U TEST 2:
*/

// importing the scanner class.
import java.util.Scanner;

public class EvensAndOdds {

    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // creating an array of desired capacity.
        int[] arr = new int[25];

        // creating an array of 25 random numbers.
        for (int i = 0; i < arr.length; i++){

            arr[i] = (int)(99 * Math.random() + 1);
        }

        // filtering out the even numbers.
        System.out.println("Even: ");
        for (int j = 0; j < arr.length; j++){

            // creating an if-statement to check for " %2 == 0", indicating an even number.
            if (arr[j] % 2 == 0){

                System.out.println(arr[j] + " ");
            } 
        }

        // filtering out the odd numbers.
        System.out.println(" ");
        System.out.println("Odd: ");

        for (int k = 0; k < arr.length; k++){

            // creating an if-statement to check for " %2 == 1", indicating an odd number.
            if (arr[k] % 2 == 1){

                System.out.println(arr[k] + " ");
            }
        }
    }
}