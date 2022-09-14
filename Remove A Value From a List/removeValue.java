package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class removeValue {

	public static void main(String[] args) {
	
	List<Integer> list = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	//Prompt user to enter the numbers to add to the list
	System.out.print("Enter a list of nonnegative numbers."
			+ "(Mark the end of the list with a negative number) : ");
	
	// add user input to the list 
	int next = sc.nextInt();
	int index = 0;
	
	while(next >= 0) {
		list.add(next);
		next = sc.nextInt();
	}
	
	//Prompt user to enter value to remove
	System.out.print("Enter the value you want to remove: ");
	int value = sc.nextInt(); //assgin user input to value 
	System.out.println("----------------------------------");
	//print out the original list
	System.out.println("\nThe original list is: ");
	System.out.print(list);
	
	//invoke method to remove value 
	removeOccurences(list,value);
	
	//print list after remove occurences of 1
	System.out.println("\nAfter remove occurences of " + value + ", the list is:");
	System.out.print(list);

	}
	
	/**Methods removeOccurences() to remove occurences of integers**/
	public static void removeOccurences(List<Integer> list, int value) {
		
	for(Iterator<Integer> itr = list.iterator(); itr.hasNext();)
	
		if( (itr.next()).equals(value)) {
			itr.remove();
		}	
	}
	

}
