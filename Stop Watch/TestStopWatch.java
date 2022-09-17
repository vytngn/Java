public class TestStopWatch {

	public static void main(String[] args) {
		
		// Create a stopwatch1 with the current time 
		StopWatch stopwatch1 = new StopWatch();
	
		System.out.println("The current time is " + stopwatch1.getStartTime());
		System.out.println("The end time is " + stopwatch1.getEndTime());
		System.out.println("The elapsed time is " + stopwatch1.getElapsedTime());
	}
}
	
