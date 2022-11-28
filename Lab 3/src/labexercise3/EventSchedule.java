package labexercise3;
import java.time.*;
/**
 *File Name: EventSchedule
 *Author: Matthew St. Louis
 *Course: CST 8284 OOP (Java)
 *Assignment: Lab #3
 *Date: 2022-09-26
 *Professor: Sandra Iroakazi
 *Purpose: The base class with multiple overloaded constructors to be called in TestDemo.java to demonstrate
 *my understanding of constructor overloading and chaining.
 */	

/**
 * A class designed to store the date of an event. Using multiple constructors.
 * @author Matthew St. Louis
 * @version 1.0
 * @since 11.0.16.1
 * */
public class EventSchedule {
	private int year;
	private int month;
	private int day;
	/**
	 * Default Constructor
	 * Sets the date to the current day via the triple argument constructor by passing in
	 * LocalDate method calls.
	 * */
	public EventSchedule() {
		this(LocalDate.now().getYear(), LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule() was called");
		//by default send the current year, month, and day to the triple param constructor
	}
	/**
	 * Single argument constructor, designed to just take the year
	 * @param y - integer for passing in the year upon creation*/
	public EventSchedule(int y) {
		this(y,LocalDate.now().getMonthValue(),LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule(int) was called");
		this.year = y;
	}
	/**
	 * Double argument constructor, designed to take the year and month
	 * @param y - integer for passing in the year
	 * @param m - integer for passing in the month
	 */
	public EventSchedule(int y, int m) {
		this(y,m,LocalDate.now().getDayOfMonth());
		System.out.println("EventSchedule(int, int) was called");
		this.year = y;
		this.month = m;
	}
	/**
	 * Triple argument constructor, design to take the year, month, and day. This is the only constructor
	 * that actually set the instance variables.
	 * @param y - integer for passing in the year
	 * @param m - integer for passing in the month
	 * @param d - integer for passing in the day
	 * */
	public EventSchedule(int y, int m, int d) {
		System.out.println("EventSchedule(int, int, int) was called");
		this.year = y;
		this.month = m;
		this.day = d;
	}
	/**
	 * This is a simple method designed to print the schedule stored in the object.
	 * @author Matthew St. Louis
	 * @version 1.0
	 * @since 11.0.16.1
	 * */
	public void printSchedule() {
		System.out.printf("The event schedule is: Year: %d Month: %d Day: %d ", this.year, this.month, this.day);
	}
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}
	
}
