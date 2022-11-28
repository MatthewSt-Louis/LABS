/**
 *File Name: CovidStatistics
 *Author: various - Matthew St Louis
 *Course: CST 8284 OOP (Java)
 *Assignment: Lab #2
 *Date: 2022-09-19
 *Professor: Sandra Iroakazi
 *Purpose: This program is design to use a 2D array of COVID-19 statistics of recovered patients across multiple 
 *provinces. It will format and output the values in a organized manner. Also, at the bottom of each column print
 *the sum of the recovered patients for that month across all provinces.
 */	

public class CovidStatistics {
	/**
	 * @author various - Matthew St Louis
	 * @version 1.0
	 * @since 11.0.16.1
	 * @param args an array of Strings passed as parameters when you are running your 
	 * application through command line in the OS.
	 */
public static void main(String[] args) {
	
   final int COLUMNS = 8;//range constant for the number of columns
   int sum = 0;//variable to hold the sum of each column  

   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };

   String[] provinces = 
      { 
         "Ontario", 
         "Quebec", 
         "Nova Scotia",
         "New Brunswick", 
         "Manitoba", 
         "British Columbia",
	     "Prince Edward Island"         
      };
   
   System.out.println("Month:               Feb    March    April    May    June    July    Aug    Sept");
   System.out.println();
   
   /*
    * Display all elements in the array in an organized fashion using nested for-loops
    * this first loop simply prints and formats the information of both arrays nicely
    */
   int spaces = 0;//variable used for spacing purposes for elements to line up nicely when displayed
   for (int i = 0; i < patients.length; i++) {
	   if (i > 0) {
		   System.out.println();
	   }
	   System.out.printf(provinces[i]);
	   spaces = 20 - provinces[i].length();//depending on the length of the item at [i], subtract its length from 20
	   for(int x = 0; x <= spaces; x++) {//using the amount in stored spaces, loop that many times and put a space for each time it loops
		   System.out.printf(" ");
	   }	   
	   for (int j = 0; j < patients[i].length; j++) {		   
		   System.out.printf("%-8d", patients[i][j]);
	   }
   }

   //line breaks for formatting
   System.out.println();
   System.out.println();
   System.out.print("Recovered Patients:  ");
   
 
   //this second for loop adds up the totals of each column in the 2D int array  
   for(int i = 0; i < COLUMNS; i++) {
	   for (int j = 0; j < patients.length; j++) {	
		   sum += patients[j][i];//go through each element of the current column and add them together.
	   }
	   System.out.printf("%-8d", sum);//print the result
	   sum = 0;//reset the sum before next column
   }  
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );
}//end of main
}//end of class






   
   
   
   
   





