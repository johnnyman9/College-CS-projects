import java.util.Scanner;
/************************************************************
 * RatGAme - This is a ratGame using arrays
 *
 * @author johnny Haizel-Cobbina
 * @version V1 - 11 November 2015
 ************************************************************/

public class Rats
{
	public static void main (String [] args)
	{
	   int seed = 3;
      String firstName;     
      RatGame rg;
      Player player1;
     
     
      int numInput;
      Scanner kb = new Scanner(System.in);
      
      if(args.length > 0)
         seed = Integer.parseInt(args[0]);
	
      System.out.println("Welcome to the CSCI105 Rats game!!\n\n");
      
      System.out.println("Enter number of players: ");      
      do
      {
         //Make sure the user enters a number greater than 3
         numInput = kb.nextInt();
         kb.nextLine();
         if(numInput < 3)
            {
               System.out.print("You need 3 or more players.\n Enter number of players: ");
            } 
                               
      }while(numInput < 3);
      
      Player[] players = new Player[numInput];
                   
      for (int i = 0; i < players.length; i++)
      {     
         System.out.print("What is the player's first name?");
         firstName = kb.nextLine();
         players[i] = new Player(firstName);//array for the names.
      }    
      
      
      rg = new RatGame(kb, players, seed);
      
      rg.playGame();
	}
}
