/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-09
 * 
 * ROUNDING ERROR IN JAVA
 * THIS PROGRAM INTENDS TO COMPARE THE ERROR THAT OCCURS IN THE VALUES BETWEEN THE SQUARE OF THE SQUARE ROOT OF A GIVEN NUMBER.
 */

 // importing the required class for the GUI functionality.
import javax.swing.JOptionPane;

public class RoundingError {

    // main method.
    public static void main(String[] args) {

        // creating a variable to take input from the user regarding the number.
        double num = Double.parseDouble(JOptionPane.showInputDialog("Please enter a number"));

        // creating a variable to store the square-root value of the inputted number.
        double sqrt = Math.sqrt(num);
       
        // creating a variable to store the square of the square-root value.
        double square = Math.pow(sqrt, 2);

        // code to print the square of the square-root to the user.
        System.out.println("The square of the square root = " + square);

        // code to find the rounding error.
        double error = num - square;

        // code to print the rounding error to the user.
        System.out.println("The round off error = " + error);
        
    }
}
