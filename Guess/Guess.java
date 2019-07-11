import java.util.*;

/********************************************************
 *
 * Guess plays a guessing game with a user.
 * The program generates a letter from 'a' to 'j' and then 
 * asks the user to guess what letter it is.
 *
 * If the user makes five or fewer guesses to guess the letter, 
 * they win.
 * If it takes them more than five tries they lose.
 * The computer stops the game if the user makes more than 10 tries
 * 
 * @author Nancy Harris and Johnny Haizel-Cobbina
 * @version 10/1/2015
 *********************************************************/
public class Guess
{
	/******************************************************
	 * main plays the game
	 *
	 * @param args Command line arguments.  Unused in this application
	 ******************************************************/
	public static void main(String args [])
	{
		Scanner kb;
		int randi;
		int guessCount;
		char computerLetter;
		char userLetter;
      char userLetter1;
      
      guessCount = 0;
		
		// setup the Scanner
		kb = new Scanner (System.in);
      System.out.print("Do you want to play my game?");
      String letter1 = kb.nextLine();
      userLetter1 = letter1.charAt(0);
      
      
     
      // generate the character
      randi = (int)(Math.random() * 10);     // generate random number from 0 - 9
		computerLetter = (char)('a' + randi);  // generates a character from 'a' - 'j'
		// as a debugging tool, you might want to print out the computerLetter
		// to see what its value is.
      System.out.print(computerLetter);
      

		// begin your loop...think about the four parts of a loop
  
     while(userLetter1 == 'y' || userLetter1 == 'Y')
         {
     
         do
       {
         System.out.print("\nEnter an a letter between A and J: ");
         String letter = kb.nextLine();
         userLetter = letter.charAt(0);
         guessCount++;
          
           if(computerLetter == userLetter && guessCount <= 5)
            {
             
               System.out.print("Yay,You Won!\n");
               guessCount++;
               
            }
               else if (computerLetter == userLetter && guessCount > 5)
               {
                    System.out.print("It took you more than 5 guesses, computer Wins\n");
                    guessCount++;
               }
                  else if(computerLetter != userLetter && guessCount == 10)
                  {
                     System.out.print("You have guessed 10 times, computer Wins!\n");
                  }    
                  
      }while(computerLetter != userLetter && guessCount < 10);
      
      System.out.print("Do you want to play again? ");
		   letter1 = kb.nextLine();
			userLetter1 = letter1.charAt(0);
         guessCount = 0; // Because at the bottom of the code it still has the number of guess with the number of guess that you have alrready put in.
  }
   
            
       
      
		
		
		
		// output the results
		
	}
}		
