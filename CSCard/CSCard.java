import java.util.Scanner;
/**************************************
 *   prepare the monthly charge account statement for a customer of CS CARD International
 *
 * @author - Johnny Haizel-Cobbina
 * @version - 9/15/2015
 *************************************/
public class CSCard 
{
	/********************************************
	 * main method documentation goes here.  What does
	 * this method do 
	 *
	 * @param args Unused in this application
	 ********************************************/
	public static void main (String args [])
	{
	
		// add any needed constants here
      
		
		// variables
		Scanner keyboard;
		
		double priorBalance;
		double addtlCharges;
		double interest;
		double newBalance;
		double minPayment;
      double interestRate;
	
		// add any needed variables here
      interestRate = .02;

		
		keyboard = new Scanner(System.in);
		
		System.out.print("Type the balance: ");
      
      if(keyboard.hasNextDouble())
        {
          priorBalance = keyboard.nextDouble();
        }
          else
         { 
            priorBalance = 0;
         }
		
		// make sure that the number entered is a double
		// and if so read it in.
		// if not, use a default value of zero.  No error message to the user.
							
		System.out.print("\nType the new charge amount: ");
      if(keyboard.hasNextDouble())
        {
          addtlCharges = keyboard.nextDouble();
        }
       else
         { 
            addtlCharges = 0;
         }
			
				
		// make sure that the number entered is a double
		// and if so read it in.
		// if not, use a default value of zero.  No error message to the user
		
		
		
		// Perform the calculation of interest, new balance and minimum payment
      if(priorBalance <= 0)
         {
            interest = priorBalance * interestRate;
         }
         else
           {
               interest = 0; 
           }
      newBalance = ((priorBalance + addtlCharges) * interestRate);
      
      
      
      if (newBalance < 0)
         {
          minPayment = 0.00;
         }
        else if(newBalance <= 0 && newBalance >= 49.99)
           {
            minPayment = newBalance;
           }
         else if(newBalance <= 50 && newBalance >= 300)
            {
              minPayment = 50.00;
            }
           else
             {
               minPayment = newBalance * .2;
             } 
				
							
		// Output the resulting statement (do not change)
		System.out.println("\n\nCS CARD International Statement");
		System.out.println("===============================");
		System.out.printf("Previous balance:   $%,8.2f\n", priorBalance);
		System.out.printf("Additional charges: $%,8.2f\n", addtlCharges);
		System.out.printf("Interest:           $%,8.2f\n\n", interest);
		System.out.printf("New balance:        $%,8.2f\n\n", newBalance);
		System.out.printf("Minimum payment:    $%,8.2f\n", minPayment);
	
	}
}
