package StoreInputArray;

import java.util.Scanner;

public class Solution1 {
	
	/* simple method to handle user input and storing converted data into an integer array */
	
	public static int[] getArray() {
		Scanner sc = new Scanner(System.in); //Scanner for input 
		System.out.println("Enter sequence of numbers: "); // space separated 
		String input = sc.nextLine(); //read each number separated by space 
		String[] strArr = input.split(" "); //store splitted characters by whte space
		final int SIZE = strArr.length; //size of array equal to length of strArr
		int[] intArr = new int[SIZE]; // returning array 
		//fill integer array with data converted from String array 
		for (int i = 0; i <SIZE; i++) {
			intArr[i]= Integer.parseInt(strArr[i]);
		}
		sc.close(); //prevent resource leaks 
		return intArr;
	}
	
	
	/*method to print array */
	public static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "," );
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		int[] myArr = getArray();
		printArray(myArr);

	}

}
