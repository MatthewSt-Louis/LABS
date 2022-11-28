package labexercise5;

/**
 * The second subclass of the SalesAgent object that extends from the SalesSupervisor class. Similar behaviour to SalesSupervisor
 * except it's adding a department on top of the pre-existing variables. It also ovverrides the toString() method to display this
 * new instance variable in the output.
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * */
public class SalesChief extends SalesSupervisor{
	private String department = "";
	
	/**
	 * Overloaded constructor
	 * @param n - name of agent
	 * @param a - age of agent
	 * @param l - location of agent
	 * @param d - department of agent
	 * */
	public SalesChief(String n, int a, String l, String d) {
		super(n, a, l);
		this.setDepartment(d);
	}

	/**
	 * Override the toString() method to display the new instance variable for his subclass
	 * */
	@Override
	public String toString() {
		
		return "Sales Chief [name= " + super.getName() + ", age= " + super.getAge() + ", location= " + super.getLocation() + 
				", department= " + this.department + "]";
	}
	
	//getters and setters for new instance variable below this line
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
