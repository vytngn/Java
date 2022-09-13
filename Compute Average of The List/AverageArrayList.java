import java.util.ArrayList;

public class AverageArrayList {

	public static void main(String[] args) {
		//list hold 25 integers 
		int capacity = 25;
		ArrayList<Integer> list = new ArrayList<Integer>(capacity);
		
		for(int i=0; i< 25; i++ ) {
			list.add(3);
		}
		System.out.println(list);
		
		int av = computeAverage1(list);
		System.out.println(av);
		
		int av2 = computeAverage2(list);
		System.out.println(av2);
		
	}
	
	/*First methods to compute average of the list*/
	public static int computeAverage1(ArrayList<Integer> list) {
		
		int sum = 0;
		
		//Cycle throught all the element in the ArrayList
		for(Integer i: list) {
			sum = sum + i;
		}
		
		//size of the list 
		int numberOfElements = list.size();
		
		if(numberOfElements > 0) {
			
			return(sum/numberOfElements);
		}
		else {
			System.out.println("ERROR: Cannot average 0 numbers");
			System.out.println("computeAverage returns 0");
			return 0;
		}
	}
		
	/*Alternate methods to compute average of the list*/
	public static int computeAverage2(ArrayList<Integer> list) {
		int sum = 0;
		for(int element: list)
			sum+= element;
		return(sum/list.size());
		
	}
	

}
