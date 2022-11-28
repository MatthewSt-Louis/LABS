package labexercise5;
import static org.junit.Assert.*;
import org.junit.Test;

/**
   This program is the first test for the SalesAgent class including the subclass.
*/
public class SalesAgentTest
{  
	/**
	 * A couple unit-tests to ensure the constructors and new methods are working properly
	 */
	@Test	
	public void toStringTest() {
		
		//creating two identical objects to ensure toString() method is working as intended
	   SalesSupervisor supervisor1 = new SalesSupervisor("Matthew", 29, "Ottawa");
	   SalesSupervisor supervisor2 = new SalesSupervisor("Matthew", 29, "Ottawa");
	   
	   //compare the two objects to see if methods are working 
	   assertEquals("The objects are not the same!", supervisor1.toString(), supervisor2.toString());
	}
	@Test
	public void locationTest() {
		final String EXPECTED = "Ottawa";
		SalesSupervisor supervisor = new SalesSupervisor("Matthew", 29, "Ottawa");
		
		assertEquals("Values don't match", supervisor.getLocation(), EXPECTED);
	}
	
	/**
	 * Main method for testing the functionality of the subclass and its methods
	 * */
	public static void main(String[] args) {
		SalesSupervisor supervisor = new SalesSupervisor("Matthew", 29, "Ottawa"); //instantiate object
		
		System.out.printf(supervisor.toString() + "\nTesting getters below:\nName: " + supervisor.getName() +
				"\nAge: " + supervisor.getAge() + "\nLocation: " + supervisor.getLocation());
		
	   
   }
}  