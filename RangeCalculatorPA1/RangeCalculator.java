/********************************************************
 * This class will calculate the number miles a car
 * can travel given the number of gallons of fuel,
 * and the MPG of the car can achieve. 
 *
 * @author Johnny Haizel-Cobbina
 * @version 9/19/2015
 ********************************************************/
 /*******************************************************
 *  References and Acknowledgements: Vinnie
 *  
 *
 ********************************************************/
import java.util.Scanner; // needed for keyboard input
 
public class RangeCalculator // START class RangeCalculator
{  
	
	/*****************************************************
	 * main method 
      In this program, it will calculate the gallons or liters needed to travel to a certain destination
       Ex: How many miles will you be traveling: 100
           Type the name of your destination that is 100.0 miles away: Bridgewater College
           Number Of Miles:  100.00
           Destination: Bridgewater College
           Gallons needed: 4.35 or Gallons in liters needed: 16.4583
           
       Ex2: Welcome to the CSCI105 Range Calculator
           How many miles will you be traveling: jh
           jh is not valid. I will use 100 for number of miles.
           Type the name of your destination that is 100.0 miles away: Congo
           Number Of Miles:  100.00
           Destination: Congo
           Gallons needed: 4.35 or Gallons in liters needed: 16.4583
       
       Ex3: How many miles will you be traveling: -78
         Type the name of your destination that is -78.0 miles away: The sun
          Number Of Miles:  -78.00
         Destination: The sun 
         Gallons needed: -3.39 or Gallons in liters needed: -12.8375

	 *
	 * @param String args
	 * @return void
	 *****************************************************/
	public static void main(String args[]) // START main method
	{  
		System.out.print("Welcome to the CSCI105 Range Calculator");// Welcome Message															
		
      //constants
      final double LITERS_CONVERSION = 3.78541178;	// conversion factor for liters
		final int MPG = 23;// # of miles per gallon
 
      // Declarations
		double numberOfMiles;
      String destination;
      double gallons;
      double liters;
      String badInput;
																	
		
		Scanner keyboard;
      
		// instantiate keyboard (readies the Scanner variable for use)
      keyboard = new Scanner(System.in);	
		
		// Prompts and Input
      
      
      System.out.print("\nHow many miles will you be traveling: ");
      if(keyboard.hasNextInt())// Checks to see if the user input is an integer or not
         {  
            numberOfMiles = keyboard.nextInt();// sets numberOfMiles if it is an integer equal to the user input
            keyboard.nextLine();//clears the buffer after user input
         }
		 
           else  
             {
               badInput = keyboard.nextLine(); //new container that holds anything else that is not an integer.
               System.out.print(badInput + " is not valid. I will use 100 for number of miles.");//if the user input is not an integer, this will alert the user.
               numberOfMiles = 100;//This is the default value for if the number of miles is not an integer.
                          
             }
         
       System.out.print("\nType the name of your destination that is " + numberOfMiles + " miles away: ");//Prompts the user to enter the name of their destination 
       destination = keyboard.nextLine(); //allows the user to input a string
    
  
  		// Calculate number of gallons
      gallons = numberOfMiles / MPG; // m = 100. m/g = 23.  100/g = 23. 23g = 100. g = 4.3478   
		
      // Calculate number of liters
      liters = gallons * LITERS_CONVERSION; // turn gallons into liters. g = 4.3475 * 3.78541178 = 16.4583

		// Output
		System.out.printf("Number Of Miles:%,8.2f\n", numberOfMiles);
      System.out.printf("Destination: %s\n" , destination);
      System.out.printf("Gallons needed: %,.2f or Gallons in liters needed: %,.4f", gallons , liters);      	
			
	} // END main method
	
} // END class RangeCalculator
