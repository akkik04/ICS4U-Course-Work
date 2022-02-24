/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-02-24
 * 
 * RESISTORS PROGRAM IN JAVA.
 * FINDING THE RESISTANCE VALUE OF A RESISTOR, GIVEN THE BAND COLOURS
*/

// importing the required classes from the 'util' package.
import java.util.*;

public class Resistors {

    // creating a function to calculate the magnitude of resistance.
    public static String magnitudeOfResistance(String s) {

        // creating an array of the inputted colours, splitting them at the '-'.
        String s_arr[] = s.split("-");

        // creating a hashtable to tie each band colour to its respective number.
        Hashtable<String, String> my_dict = new Hashtable<String, String>();

        // adding the band colours and corresponding numbers.
        my_dict.put("BLACK", "0");
        my_dict.put("BROWN", "1");
        my_dict.put("RED", "2");
        my_dict.put("ORANGE", "3");
        my_dict.put("YELLOW", "4");
        my_dict.put("GREEN", "5");
        my_dict.put("BLUE", "6");
        my_dict.put("VIOLET", "7");
        my_dict.put("GREY", "8");
        my_dict.put("WHITE", "9");

        // creating a variable to concatenate the first two numbers, based on the colour given in the first and second index of the array.
        // numbers are found by matching the string of the colour in the array to its corresponding value in the hashtable.
        String first_two = ""; 
        first_two = my_dict.get(s_arr[0]) + my_dict.get(s_arr[1]);

        // creating a variable to add the last number, based on the last colour in the array of inputted colours.
        // tying the string of the colour in the array to the corresponding hashtable value for the same string.
        String last_one = "";
        last_one = my_dict.get(s_arr[s_arr.length-1]);

        // converting each of the numerical terms into integers for calculations.
        int x = Integer.parseInt(first_two);
        int y = Integer.parseInt(last_one);

        // calculating the resistance based on the formula given.  
        double resistance = x * (Math.pow(10, y));
        
        // returning the value of the resistance.
        return "The resistance is: " + resistance + " ohms.";
    }

    // main method.
    public static void main(String[] args) {
        
        // instantiating the scanner object.
        Scanner kp = new Scanner(System.in);

        // code to take input for the string containing the colour of the bands on the resistor.
        String str = kp.nextLine();

        // modifying the inputted string to all capital characters.
        str = str.toUpperCase();

        // creating a variable to store and print the value returned by the function.
        String answer = magnitudeOfResistance(str);
        System.out.println(answer);
    }
}