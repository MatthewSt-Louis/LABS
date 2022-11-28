package labexercise3;
import java.util.*;
/**
 *File Name: TestDemo
 *Author: Matthew St Louis
 *Course: CST 8284 OOP (Java)
 *Assignment: Lab #3
 *Date: 2022-09-26
 *Professor: Sandra Iroakazi
 *Purpose: This program is designed to solidify my understand of constructor chaining and overloading. Using different 
 *constructor calls based on the amount of parameters passed into the object upon creation.
 */	

/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Matthew St. Louis
 */
public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
	/**
	 * Begin creating EventSchedule objects, one by one and printing their
	 * result after instantiating.
	*/
		System.out.println("Just creating 4 EventSchedules");
		
		System.out.println();
		System.out.println();
		//default constructor call
		System.out.println("EventSchedule1");
		EventSchedule schedule1 = new EventSchedule();
		schedule1.printSchedule();
		
		System.out.println();
		System.out.println();

		System.out.println("EventSchedule2");	
		while(true) {
			try {
				System.out.println("Please enter a year: ");
				year = keyboard.nextInt();
				EventSchedule schedule2 = new EventSchedule(year);
				schedule2.printSchedule();
				break;
			}catch(InputMismatchException e) {//catching non-integer input
				System.out.println("Invalid input, please try again.");
				keyboard.nextLine();//clear input stream of exception
			}	
		}//end of loop
		
		System.out.println();
		System.out.println();
		
		//double param constructor call
		System.out.println("EvenSchedule3");
		while(true) {
			try {
				System.out.println("Please enter a year: ");
				year = keyboard.nextInt();
				System.out.println("Please enter a month: ");
				month = keyboard.nextInt();
				EventSchedule schedule2 = new EventSchedule(year, month);
				schedule2.printSchedule();
				break;
			}catch(InputMismatchException e) {//catching non-integer input
				System.out.println("Invalid input, please try again.");
				keyboard.nextLine();//clear input stream of exception
			}
		}//end of loop
		
		System.out.println();
		System.out.println();
		
		//triple param constructor call
		System.out.println("EventSchedule1");
		while(true) {
			try {
				System.out.println("Please enter a year: ");
				year = keyboard.nextInt();
				System.out.println("Please enter a month: ");
				month = keyboard.nextInt();
				System.out.println("Please enter a day: ");
				day = keyboard.nextInt();
				EventSchedule schedule2 = new EventSchedule(year, month, day);
				schedule2.printSchedule();
				break;
			}catch(InputMismatchException e) {//catching non-integer input
				System.out.println("Invalid input, please try again.");
				keyboard.nextLine();//clear input stream of exception
			}	
		}//end of loop
		keyboard.close();//close scanner object
	}//end of main

}//end of class
