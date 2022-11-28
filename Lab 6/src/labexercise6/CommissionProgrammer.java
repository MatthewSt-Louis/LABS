package labexercise6;

//CommissionProgrammer.java
//CommissionProgrammer class extends Programmer.

public class CommissionProgrammer extends Programmer { 
	
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	
	/**
	 * Overloaded constructor
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber,
								double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
		
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 
	
	/**
	 * Method to set sales amount with exception handling to ensure
	 * amount entered isn't less than or equal to 0.
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	} 
	
	//return gross sales amount 
	public double getGrossSales() {
		return grossSales;
	} 
	
	//set commission rate
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
		    "Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	} 
	
	//return commission rate
	public double getCommissionRate() {
		return commissionRate;
	} 
	
	/**
	 * Calculate the earnings of the individual
	 */
	@Override
	public double earnings() {
		double totalEarnings = 0;	
		return totalEarnings; 
	}
	/**
	 * Overriding method from Payme interface that is implemented in
	 * the Programmer super class to return the amount to be payed to the individual
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             
	/**
	 * Return a String representation of the object
	 */
	@Override  
	public String toString() {
		return String.format("%s %s %s\n%s: %s\n%s: $%.2f\n%s: %.2f\n%s: $%.2f",
		"Commission Programmer", this.getFirstName(), this.getLastName(), "SSN", this.getSSN(), "Gross sales", this.getGrossSales(), "Commission rate", this.getCommissionRate(), "Amount Earned", this.getPaymentAmount());
	} 
                                            

}

