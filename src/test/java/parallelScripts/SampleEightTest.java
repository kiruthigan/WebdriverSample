package parallelScripts;

import org.testng.annotations.Test;
//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
public class SampleEightTest {
  
	@Test
	  public void testOne() {
		  long id = Thread.currentThread().getId();
		  System.out.println("Test1 in SampleEight" +id); 
	  }
		  
		  @Test
		  public void testTwo() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test2 in SampleEight" +id);
		  }
		  
		  @Test
		  public void testThree() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test3 in SampleEight" +id);
		  }
		  
		  @Test
		  public void testFour() {
			  long id = Thread.currentThread().getId();
			  System.out.println("Test4 in SampleEight" +id);
		  }
}
