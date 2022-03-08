/*
 * AKSHITH KANDIVANAM
 * MR. MARTINS
 * 2022-03-08
 * 
 * Q1 ICS4U TEST 2:
*/

public class GeneratedNums {

    // main method.
    public static void main(String[] args) {

        // creating an array of desired capacity.
        int array[] = new int[101];

        // creating a for-loop to perform the appropriate task.
		for (int index = 0; index < 101; index++){

            // creating a variable to store the sum.
			int sum=0;

            // creating a tempVariable and tying it to the index.
			int tempIndex = index;

            // creating a for-loop to get the digit using 'modulus' operator.
			for (sum = 0; tempIndex != 0; tempIndex /= 10){
				sum+=tempIndex%10;
			}

            // adding the element and digits of the index.
			sum = sum + index;
			array[index]=sum;
		}

        // printing the numbers.
		System.out.println("Index Generated Number");
		for (int index = 0; index < 101; index++){

			System.out.println(index+" "+array[index]);
		}
	}
}