package parallelScripts;

import org.testng.annotations.Test;

public class SampleFiveTest {
	@Test
	  public void testOne() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test1 in Samplefive");
	  }
		  
		  @Test
		  public void testTwo() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test2 in Samplefive");
		  }
		  
		  @Test
		  public void testThree() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test3 in Samplefive");
		  }
		  
		  @Test
		  public void testFour() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test4 in Samplefive");
		  }
}
