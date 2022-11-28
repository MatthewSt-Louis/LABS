package labexercise6;

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.

public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;
	
	//constructor
	public SalariedProgrammer(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		//super constructor
		super(firstName, lastName, socialSecurityNumber); 
		//make sure salary is a valid amount
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
		//set instance variable of salary if valid
		this.weeklySalary = weeklySalary;
	} 
	
	//set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	} 
	
	//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	} 
	
	//calculate earnings; override abstract method earnings in Programmer
	@Override
	public double earnings() {	
		return getWeeklySalary();
	}
	
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}                                             

	//return String representation of SalariedProgrammer object   
	@Override  
	public String toString() {
	return String.format("%s: %s %s\n%s: %s\n%s: $%.2f ",
	  "Salaried programmer", this.getFirstName(), this.getLastName(), "SSN", this.getSSN(), "Weekly salary", this.getPaymentAmount());
	} 
                                            
}//end of class

