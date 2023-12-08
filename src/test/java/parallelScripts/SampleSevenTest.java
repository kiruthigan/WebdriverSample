package parallelScripts;

import org.testng.annotations.Test;

public class SampleSevenTest {
	@Test
	  public void testOne() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test1 in Sampleseven" +id);
	  }
		  
		  @Test
		  public void testTwo() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test2 in Sampleseven .." +id);
		  }
		  
		  @Test
		  public void testThree() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test3 in Sampleseven" +id);
		  }
		  
		  @Test
		  public void testFour() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test4 in Sampleseven" +id);
		  }
  
}


