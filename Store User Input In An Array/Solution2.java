package StoreInputArray;

import java.util.ArrayList;
import java.util.Scanner;

/*ArrayList : serves as dynamic data, resizable array */

public class Solution2 {
	
	

	public static void main(String[] args) {
		
		//create an ArrayList
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		
		//create Scanner to read input 
		Scanner sc = new Scanner(System.in);
		
		//prompt user 
		System.out.print("Enter numbers: ");
		
		//if there is more input add to the Arr 
		while(sc.hasNextInt()) {
			Arr.add(sc.nextInt()); //only display result if detect the next character is not int 
		}
		
		//display result 
		System.out.println("The numbers of elements are: " + Arr.size());
		System.out.println(Arr);
		
		
		
		
		


    }


	

}
