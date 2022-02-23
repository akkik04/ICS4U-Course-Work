/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-23
 * 
 * ICS4U TEST Q4 IN JAVA.
 * THIS PROGRAM INTENDS TO CALCULATE THE VERTICAL HEIGHT AND DISTANCE OF A LADDER TO THE WALL USING TRIGONOMETRY.
*/

// importing the required modules.
import java.util.Scanner;

public class TrigonomteryProblem {

    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // prompts for input.
        System.out.print("Enter the length of the ladder in metres please: ");
        double lengthLadder = kp.nextDouble();

        System.out.print("Enter the angle with the ground please:");
        double angle = kp.nextDouble();

        // calculating the required values.
        double verticalHeight = lengthLadder * (Math.sin(angle * Math.PI / 180));
        double horiontalDistance = lengthLadder * (Math.cos(angle * Math.PI / 180));

        // printing the output.
        System.out.println("The vertical height is: " + verticalHeight);
        System.out.println("The horizontal distance is: " + horiontalDistance); 
    }
}