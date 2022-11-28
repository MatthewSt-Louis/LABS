package labexercise6;

/**
 * Child class of CommissionProgrammer
 * this class has similar functionality to CommissionProgrammer but the main() method is
 * designed to recognize this Type and adjust the pay accordingly to add the commission on 
 * top of their base pay.
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

	private double baseSalary; // base salary per week
	
	/**
	 * Overloaded Constructor
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, 
										double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;                
	}
	
	/**
	 * setBaseSalary() 
	 * contains exception handling in case of salary entered be less than 0.0
	 * If not exception  is thrown, the class level variable is set accordingly.
	 * @param baseSalary - the base salary of the individual
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;                
		} 
		
		//return base salary
		public double getBaseSalary() {
		return baseSalary;
	}
	
	/**
	 * Overriding abstract method from class Programmer
	 */	
	@Override                                                            
	public double earnings() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	} 
	
	/**
	 * overriding class Object's toString method to return
	 * a String representation of this classes information
	 */
	@Override     
	public String toString() {
		return String.format("%s: %s %s\n%s: %s\n%s: $%.2f\n%s: %.2f\n%s: $%.2f", 
		  "Base+Commission Programmer", this.getFirstName(), this.getLastName(), "SSN", this.getSSN(), "Gross sales", this.getGrossSales(),"Commission rate", this.getCommissionRate(), "Base salary", this.getBaseSalary());
	} 
                                                   
}//end of class



