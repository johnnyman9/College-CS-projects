import java.util.Scanner;
/********************************************************
 * This class is a starting place for Java
 *  
 * This is where a description of the class should be
 *
 * @author - Vincent D. Capaccio ( <- replace with your name!)
 * @version - .01 - Start
 ********************************************************/
 /*******************************************************
 /  References and Ackknowledgements: I have recieved
 /  no help on this programming assignment
 /
 /*******************************************************/

public class MPG
{
   /***************************************************************
   * main method for a program that calculates the miles per gallon
   * @param args unused in this program  
	****************************************************************/
   public static void main (String[] args)
   {
		// declarations
		double milesDriven;
		double gallonsUsed;
		double mpg;
		
		Scanner keyboard;
		
		// instantiate keyboard (readies the Scanner variable for use)
		keyboard = new Scanner(System.in);
		
		// Create a prompt to help the user understand what they should type
		System.out.print("Enter number of miles driven: ");
		
		// read in the miles
		milesDriven = keyboard.nextDouble();
		
		//Create a prompt to help the user understand what they should type for gallons
		System.out.print("Enter number of gallons: ");
		// read in the gallons
		gallonsUsed= keyboard.nextDouble();
		// calculate the mpg and store the result in mpg
		mpg = gallonsUsed/milesDriven;
		// Output the miles
		System.out.printf("For %f miles, you used %f gallons of gas " + 
		 "and got %f miles per gallon.", milesDriven, gallonsUsed, mpg);
   }
}
