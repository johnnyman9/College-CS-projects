import java.util.Scanner;

/********************************************************************
 * RatGame plays the game of Rat, our variant of the old game of Pig
 *******************************************************************/
public class RatGame
{
	private Player player1;
	private Player player2;
	private RatDice dice;
	private Scanner kb;
	
	/******************************************************************
	 * Explicit value constructor to initialize the game elements
	 *
	 * @param kb The Scanner object (assumed to be the keyboard)
	 * @param player1 The first player defined
	 * @param player2 The second player defined
	 * @param seed 	The seed value to begin the random generator
	 ******************************************************************/
	public RatGame(Scanner kb, Player player1,int seed)
	{
		this.kb = kb;
      this.player1 = player1;
      this.player2 = player2;
      dice = new RatDice(seed);
	}
	
	/******************************************************************
	 * playGame performs the game controls and "plays" the game
	 *****************************************************************/
	public void playGame()
	{
		boolean player1Turn;
      boolean player1GoesFirst;
      boolean keepRolling = false;
      int player1Roll;
      int player2Roll;
      String player1Str;
      String player2Str;
      int numPlayers;
     
      
      // See who goes first -------------------------------
      
      System.out.print("Enter number of players");
      numPlayers = kb.nextInt();     
      int[] number = new int[numPlayers];
      do
      {
         player1Roll = player1.throwDice(dice);
         player1Str = dice.toString();
         player2Str = dice.toString();
         
         if(player1Roll == player2Roll)
            sopln(player1.getName() + " rolls " + player1Roll + ", " + 
               player2.getName() + " rolls " + player2Roll + ", TIE throw again");
     
	   }while(player1Roll == player2Roll);
      
      if(player1Roll > player2Roll)
      {
         sopln(player1.getName() + " rolls " + player1Str + ", " + 
            player2.getName() + " rolls " + player2Str + ", " + 
            player1.getName() + " goes first.");
         player1Turn = true;
         player1GoesFirst = true;
      }
      else 
      {
         sopln(player1.getName() + " rolls " + player1Str + ", " + 
            player2.getName() + " rolls " + player2Str + ", " + 
            player2.getName() + " goes first.");
         player1Turn = false;
         player1GoesFirst = false;
	   }
      //Start the game play -------------------------------
      do //play again loop
      {
         sopln("");
         player1.resetScore();
         player2.resetScore();
         
         do //until someone wins loop
         {
            if(player1Turn) 
            {
               do  // player1 turn loop
               {
                  player1Roll = player1.throwDice(dice);
                  player1.addThrowPoints(player1Roll);
                  
                  if(dice.isRatsEyes())
                  {
                     player1.endOfTurn(dice.isRatsEyes());
                     sopln(player1.getName() + " rolls " + dice.toString() + 
                        " - RATS! Total: " + player1.getTotalPoints()); 
                  }
                  if(dice.isBoxcar())
                  {
                     player1.endOfTurn(dice.isRatsEyes()); 
                     sopln(player1.getName() + " rolls " + dice.toString() + 
                        " - BOXCARS! Turn: " + player1.getTurnPoints() + 
                        " Total: " + player1.getTotalPoints()); 
                  }         
                  if(!(dice.isRatsEyes() || dice.isBoxcar()))
                  {      
                     sopln(player1.getName() + " rolls " + dice.toString() + "\tTurn: " + player1.getTurnPoints() + 
                        " Total: " + player1.getTotalPoints());
                     if((player1.getTurnPoints() + player1.getTotalPoints()) < 100)
                     {
                        sopln("Give up the dice? ");
                        keepRolling = player1.goAgain(kb);
                     }
                  }
                      
               }while(!keepRolling && !dice.isRatsEyes() && !dice.isBoxcar() && (player1.getTurnPoints() + player1.getTotalPoints()) < 100);
               // end of player1 loop
               player1.endOfTurn(dice.isRatsEyes());
            }
            else
            {   
               do  // player2 turn loop
               {
                  player2Roll = player2.throwDice(dice);
                  player2.addThrowPoints(player2Roll);
                  
                  if(dice.isRatsEyes())
                  {
                     player2.endOfTurn(dice.isRatsEyes());
                     sopln(player2.getName() + " rolls " + dice.toString() + 
                        " - RATS! Total: " + player2.getTotalPoints()); 
                  }
                  if(dice.isBoxcar())
                  {
                     player2.endOfTurn(dice.isRatsEyes());
                     sopln(player2.getName() + " rolls " + dice.toString() + 
                        " - BOXCARS! Turn: " + player2.getTurnPoints() + 
                        " Total: " + player2.getTotalPoints()); 
                  }         
                  if(!(dice.isRatsEyes() || dice.isBoxcar()))
                  {      
                     sopln(player2.getName() + " rolls " + dice.toString() + "\tTurn: " + player2.getTurnPoints() + 
                        " Total: " + player2.getTotalPoints());
                     if((player2.getTurnPoints() + player2.getTotalPoints()) < 100)
                     {
                        sopln("Give up the dice? ");
                        keepRolling = player2.goAgain(kb);
                     }
                  }
                          
               }while(!keepRolling && !dice.isRatsEyes() && !dice.isBoxcar() && (player2.getTurnPoints() + player2.getTotalPoints()) < 100);
               // end of player1 loop
               player2.endOfTurn(dice.isRatsEyes());
            }
            
            player1Turn = !player1Turn;  //determines who turn it is next
        
         }while(player1.getTotalPoints() < 100 && player2.getTotalPoints() < 100); // keep going until someone wins.
         
         if(player1Turn)  //the person who went last wins - but we already changed the player for the next round - so change it back
            sopln("\n" + player2.getName() + " WINS!\t" + player1.getName() + " points " + player1.getTotalPoints() +
               "\t" + player2.getName() + " points " + player2.getTotalPoints());
         else
            sopln("\n" + player1.getName() + " WINS!\t" + player1.getName() + " points " + player1.getTotalPoints() +
               "\t" + player2.getName() + " points " + player2.getTotalPoints());
         
         sop("\n\nDo you want to play again?");      
      }while(player1.goAgain(kb));  
      
      sopln("Thanks for playing RATS!!  Good bye");  
	} // END playGame
   
   public void sopln(String text)
   {
      System.out.println(text);
   }
   
   public void sop(String text)
   {
      System.out.print(text);
   }
} // END class
