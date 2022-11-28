package labexercise6;

/**
 * This class is the testing area for the PaymeInterface. It includes the main() method and the main output loop of 
 * the program. See details below for in depth functionality details.
 */
public class PaymeInterfaceTest  {

	public static void main(String[] args) {
		/**create empty array of Payme objects*/		
		Payme[] paymeObjects = new Payme[6];
		/**populate array with appropriate data*/
		paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.00);
		paymeObjects[1] = new Invoice("33442", "Gear", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320.00);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40.00);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500.00, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Esther", "Pastel", "102-34-5888", 1200.00, 0.04, 720.00);
				
		/**
		 * This is the main output loop of the program. 
		 * the for loop iterates though each index of the array and calls the current instance's version of toString() each is 
		 * polymorphically designed to behave according to the Type of programmer. There is an if clause that checks during each
		 * iteration to see if it's a BaseCommissionProgrammer. If it is, it adjusts the payment amount accordingly and notifies
		 * the user.*/
		System.out.println(
		    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
		
		/**looping through array of objects and printing them out*/
		for (Payme currentPayme : paymeObjects) {
		    // output currentPayme and its appropriate payment amount
		    System.out.printf("%s \n\n", currentPayme.toString()); 
		    //if it's a commission plus base salary programmer, adjust pay accordingly 
		    if (currentPayme instanceof BasePlusCommissionProgrammer) {
		       // downcast Payme reference to 
		       // BasePlusCommissioProgrammer reference
		       BasePlusCommissionProgrammer programmer = 
		          (BasePlusCommissionProgrammer) currentPayme;
		       //salary adjustment
		       double oldBaseSalary = programmer.getBaseSalary();
		       programmer.setBaseSalary(1.10 * oldBaseSalary);
		       System.out.printf(
		          "Salary with 10%% increase is: $%,.2f\n",
		          programmer.getBaseSalary());
		    } 
		}//end of for loop
	}//end of main
}//end of class


