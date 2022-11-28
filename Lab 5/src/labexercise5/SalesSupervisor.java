package labexercise5;

/**
 * The first subclass of the SalesAgent object. Adds an additional class-level variable for the agent's
 * location. Also overrides the parent's toString() method to display said location.
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * */
public class SalesSupervisor extends SalesAgent {
	//unique instance variable for this subclass
	private String location;
	
	/**
	 * Overloaded constructor
	 * @param n - name of agent
	 * @param a - age of agent
	 * @param l - location of agent
	 * */
	public SalesSupervisor(String n, int a, String l) {
		super(n, a);
		this.location = l;
	}
	/**
	 * Override toString() method to include the location of the agent in the output.
	 * */
	@Override
	public String toString() {
		
		return "Sales Supervisor [name= " + super.getName() + " age= " + super.getAge() + " location= " + this.location + "]";
	}
	
	//getter and setter for instance variable location is below this line.
	public void setLocation(String l) {
		
		this.location = l;
	}
	
	public String getLocation() {
		
		return this.location;
	}

}