import java.util.Scanner;

public class Rats
{
	public static void main (String [] args)
	{
	   int seed = 0;
      String firstPlayersName;
      String secondPlayersName;
      RatGame rg;
      Player player1;
      Player player2;
      Scanner kb = new Scanner(System.in);
      
      if(args.length > 0)
         seed = Integer.parseInt(args[0]);
	
      System.out.println("Welcome to the CSCI105 Rats game!!\n\n");
      
      System.out.print("What is the first players name? ");
      firstPlayersName = kb.nextLine();
      System.out.println();     
       
      System.out.print("What is the second players name? ");
      secondPlayersName = kb.nextLine();
      System.out.println();
      
      player1 = new Player(firstPlayersName);
      player2 = new Player(secondPlayersName);
      
      rg = new RatGame(kb, player1, player2, seed);
      
      rg.playGame();
	}
}
