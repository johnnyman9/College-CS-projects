import java.util.Scanner;

/**********************************************************************
 * Class purpose: Vote class
 * 
 * @author  Johnny Haizel-Cobbina
 * @version 10/13/15
 *********************************************************************/
public class VotingBooth
{
   /** main method that tallies up votes.
   * @param args unused in this program
   *******************************************************************/  

	public static void main(String args[])
	{
         String choice;
         char choice1;
         String results;
         
         
		// declare variables
      Vote voter;
      voter = new Vote();
		
		Scanner keyboard;
      keyboard = new Scanner(System.in);
      
      
      // set up your loop
      do
        {
		      System.out.print("Enter m for Mcauliffe, c for Cuccinelli,  s for Sarvis, x to exit\n");
            choice = keyboard.nextLine();
            choice1 = choice.charAt(0);
      
      // loop body
         if(choice1 == 'm')
         {
            voter.voteMcauliffe();
         }
         else if(choice1 == 'c')
         {
            voter.voteCuccinelli();
         }
         else if(choice1 == 's')
         {
            voter.voteSarvis();
         }
         else if(choice1 == 'x')
         {
            results = voter.toString();
            System.out.print(results);
         }
      // carry out the actions
		  }while( choice1 == 'm'|| choice1 == 'c' || choice1 == 's'||choice1 != 'x'); 
		
	}
}
				
