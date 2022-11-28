package labexercise5;

/**
 * This is the 
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * */
public class SalesAgent {
   private String name;
   private int age;

   /**
      In this portion of your code, construct a SalesAgent object.
      @param n the name of the Sales Agent
      @param a the age of the Sales Agent
   */
   public SalesAgent(String n, int a) {
	   this.name = n;
	   this.age= a;
   }

   /**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }
   
   //getters and setter below this line
   public void setName(String n) {
	   this.name = n;
   }
   
   public String getName() {
	   return this.name;
   }
   
   public void setAge(int a) {
	   this.age = a;
   }
   
   public int getAge() {
	   return this.age;
   }
}