package labexercise5;
import static org.junit.Assert.*;
import org.junit.Test;
/**
   This program is the second test for the SalesAgent class including the subclasses.
*/
public class SalesAgentTest2
{  
	/**
	 * A couple unit-tests to ensure the constructors and new methods are working properly
	 */
	@Test
	public void toStringTest() {
		
		//creating two identical objects to ensure toString() method is working as intended
	   SalesChief chief1 = new SalesChief("Matthew", 29, "Ottawa", "Sales");
	   SalesChief chief2 = new SalesChief("Matthew", 29, "Ottawa", "Sales");
	   
	   //compare the two objects to see if methods are working 
	   assertEquals("The objects are not the same!", chief1.toString(), chief2.toString());
	}
	@Test
	public void departmentTest() {
		//expecting "Sales" for assert comparison
		final String EXPECTED = "Sales";
		//create object with "Sales" as department
		SalesChief chief = new SalesChief("Matthew", 29, "Ottawa", "Sales");
		//test object against EXPECTED
		assertEquals("Values don't match", chief.getDepartment(), EXPECTED);
	}
	/**
	 * Main method for testing the functionality of the subclass and its methods
	 * */
   public static void main(String[] args)
   {
	   //instantiate object with hard coded values to test toString() method
	   SalesChief chief = new SalesChief("Matthew", 29, "Ottawa", "Sales");
	   
	   //use instantiated object to print information stored in object
	   System.out.printf(chief.toString() + "\nTesting getters below:\nName: " + chief.getName() +
						"\nAge: " + chief.getAge() + "\nLocation: " + chief.getLocation() + "\nDepartment: " +
						chief.getDepartment());
   }
}  