import java.util.Scanner;

public class ArrayAdder {

	public static void main(String[] args) {
		
		//setting up the scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("What size array would you like?");
		//store next inputed integer
		int arraySize = input.nextInt();
		
		//set up array to hold type double
		double[] arr = new double[arraySize];
		
		//for loop to populate the array
		for(int i = 0; i < arraySize; i++) {
			System.out.println("Please populate array: ");
			arr[i] = input.nextDouble();
		}
		
		//double to store the accumulative array additions
		double count = 0;
		
		System.out.println("Your array is: ");
		
		//for loop displaying contents and adding members 
		for(int i = 0; i < arraySize; i++) {
			System.out.print(arr[i] + "\t");
			count = count + arr[i];
		}
		
		//displaying the total to the user
		System.out.println("\nThe sum total is:  " + count);
		
		//close scanner
		input.close();
		
	}//end method

}//end class

