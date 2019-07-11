import java.util.Scanner;

public class Rats
{
	public static void main (String [] args)
	{
	   int seed = 25;
      String firstName;
      String secondName;
      RatGame rg;
      Player player1;
      Player player2;
      int i;
      Scanner kb = new Scanner(System.in);
      
      if(args.length > 0)
         seed = Integer.parseInt(args[0]);
	
      System.out.println("Welcome to the CSCI105 Rats game!!\n\n"); 
      System.out.print("What is the first players name? ");
      firstName = kb.nextLine();
      System.out.println();     
       
      
      player1 = new Player(firstName);
      player2 = new Player(secondName);
      
      rg = new RatGame(kb, player1, player2, seed);
      
      rg.playGame();
	}
}