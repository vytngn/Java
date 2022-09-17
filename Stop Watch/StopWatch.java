class StopWatch {
	
		  /**Private data field */
		  private long startTime;
		  private long endTime;
		  
		  /* No-arg Construct StopWatch Object */
		  public StopWatch(){
			  startTime = System.currentTimeMillis();
		  }
		  
		  
		  /**Getter methods*/
		  public long getStartTime(){
		   return startTime;
		  }
		  public long getEndTime(){
		    return endTime = System.currentTimeMillis(); 
		  }
		  
		  /**Methods*/
		  /* Method reset startTime to current time */
		  public void start(){
		    startTime = System.currentTimeMillis() ;
		  }

		  /* Method sets the endTime to current time */
		  public void stop(){
		    endTime = System.currentTimeMillis();
		  }
		  
		  /* Method returns the elapsed time for the stopWatch in milliseconds*/
		  public long getElapsedTime(){
		    return endTime - startTime; 
		  }
}

