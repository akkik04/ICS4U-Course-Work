/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-10
 * 
 * EASTER VARIATION 2 IN JAVA
 * THIS PROGRAM INTENDS TO COMPARE THE ERROR THAT OCCURS IN THE VALUES BETWEEN THE SQUARE OF THE SQUARE ROOT OF A GIVEN NUMBER.
 */

// importing the required class for the GUI functionality.
import javax.swing.JOptionPane;

public class EasterVariation2 {

    // main method.
    public static void main(String[] args) {

        // creating a string variable to store the month.
        String monthP;

        // code to take user input for the year.
        int year = Integer.parseInt(JOptionPane.showInputDialog("Please enter the year for which you want to find the date of easter: "));

        // finding the quotient 'a' and remainder 'b' of the inputted 'year / 100'.
        int a = year / 100;
        int b = year % 100;

        // (3 * (a + 25)) by 4 to get the quotient 'c' and the remainder 'd'.
        int c = (3 * (a + 25)) / 4;
        int d = (3 * (a + 25)) % 4;

        // (8 * (a + 11) by 25 to get the quotient 'q'.
        int q = (8 * (a + 11)/25);

        // (5 * a + b) by 19 to get the remainder 'f'.
        int f = (5 * a + b) % 19;

        // (19 * f + c - q) by 30 to get the remainder 'g'.
        int g = (19*f + c - q) % 30;

        // (f + 11 * g) by 319 to get the quotient 'h'.
        int h = (f + 11*g) / 319;

        // (60 * (5 - d) + b) by 4 to get the quotient 'j', and the remainder 'k'.
        int j = (60 * (5 - d) + b) / 4;
        int k = (60 * (5 - d) + b) % 4;

        // Divide (2 * j - k - g + h) by 7 to get the remainder 'n'.
        int n = (2 * j - k - g + h) % 7;

        // Divide (g - h + n + 114) by 31.
        int month = (g - h + n + 114) / 31;
        int day = ((g - h + n + 114) % 31) + 1;

        // creating an if-statement to check if the integer value of month is equal to '3'.
        if (month == 3){

            // code to set the string variable of month to 'March'.
            monthP = "March";
        }

        else {
            
            // code to set the string variable of month to 'April' if the integer value of month is equal to '4'.
            monthP = "April";

        }
        
        // code to print the date of easter to the user.
        JOptionPane.showMessageDialog(null, "Easter falls on " + monthP + " " + day + " in the year " + year);
    }
}
