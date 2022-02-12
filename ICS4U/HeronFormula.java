/**
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-09
 * 
 * AREA OF TRIANGLE USING HERON'S FORMULA
 * THIS PROGRAM INTENDS TO CALCULATE THE AREA OF A SCALENE TRIANGLE USING HERON'S FORMULA.
 */

// importing the required classes.
import java.util.Scanner;

public class AreaOfTriangle {

    // creating a function to calculate the area with Heron's Formula.
    public static double calcAreaWithHeronFormula(double a, double b, double c) {

        // code to calculate the 'semi-perimeter' of the triangle.
        double S = (a + b + c) / 2;

        // calculating the area using Heron's Formula.
        double heronFormula = Math.sqrt(((S) * (S - a)) * (S - b) * (S - c));

        // returning the value of the area found using the Heron's Formula.
        return heronFormula;
    }

    // main method.
    public static void main(String[] args) {

        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // code to take input for the side lengths, 'a', 'b', and 'c'.
        System.out.print("Enter the length of the first side please: ");
        double SideA = kp.nextDouble();

        System.out.println(" ");
        System.out.print("Enter the length of the second side please: ");
        double SideB = kp.nextDouble();

        System.out.println(" ");
        System.out.print("Enter the length of the third side please: ");
        double SideC = kp.nextDouble();

        // creating a variable to store and print the value returned by the function, upon calling it.
        double answer = calcAreaWithHeronFormula(SideA, SideB, SideC);
        System.out.println("The area of the triangle is: " + answer);
    }
}
