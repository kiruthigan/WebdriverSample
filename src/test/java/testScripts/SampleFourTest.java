package testScripts;

import org.testng.annotations.Test;

public class SampleFourTest {
	 @Test(groups="feature2")
	  public void testOne() {
		  
		  System.out.println("Test1 in SampleFour");
	  }
		  
		  @Test(groups="feature1")
		  public void testTwo() {
			  
			  System.out.println("Test2 in SampleFour");
		  }
		  
		  @Test
		  public void testThree() {
			  
			  System.out.println("Test3 in SampleFour");
		  }
		  
		  @Test
		  public void testFour() {
			  
			  System.out.println("Test4 in SampleFour");
		  }
}
