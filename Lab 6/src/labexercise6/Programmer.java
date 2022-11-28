package labexercise6;
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!

public abstract class Programmer implements Payme {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	//three-argument constructor
	public Programmer(String first, String last, String ssn) {
	 firstName = first;
	 lastName = last;
	 socialSecurityNumber = ssn;
	}
	
	/**
	 * Getters for the private variables
	 */
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getSSN() {
		return this.socialSecurityNumber;
	}
	/**
	 * Setters for the private variables
	*/
	public void setFirstName(String name) {
		this.firstName = name;
	}
	public void setLastName(String name) {
		this.lastName = name;
	}
	public void setSSN(String ssn) {
		this.socialSecurityNumber = ssn;
	}
	
	
		
	//return String representation of Programmer object
	@Override
	public String toString() {
	return String.format("%s %s\n%s: %s\n%s: %s",
	  this.getFirstName(), this.getLastName(), this.getSSN());
	} 
	
	/**
	 * Abstract method to be implemented by subclasses polymorphically
	 */
	public abstract double earnings();
	
	//interface method should be here
} 


