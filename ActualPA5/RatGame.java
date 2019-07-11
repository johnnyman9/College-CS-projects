import java.util.Scanner;
/************************************************************
 * RatGAme - This is a ratGame using arrays
 *
 * @author johnny Haizel-Cobbina
 * @version V1 - 11 November 2015
 ************************************************************/
 /*******************************************************
 /  References and Ackknowledgements: I have recieved
 /  help by basing my code of vinnie's code and Shannon 
 /  to help explain an error assignment
 /
 /*******************************************************/
/********************************************************************
 * RatGame plays the game of Rat, our variant of the old game of Pig
 *******************************************************************/
public class RatGame
{
	private Player[] players;
	private RatDice dice;
	private Scanner kb;
	
	/******************************************************************
	 * Explicit value constructor to initialize the game elements
	 *
	 * @param kb The Scanner object (assumed to be the keyboard)
	 * @param player1 The first player define
	 * @param seed 	The seed value to begin the random generator
	 ******************************************************************/
	public RatGame(Scanner kb,Player[] players,int seed)
	{
		this.kb = kb;
      this.players = players;
      dice = new RatDice(seed);
	}
	
	/******************************************************************
	 * playGame performs the game controls and "plays" the game
	 *****************************************************************/
	public void playGame()
	{
		int playerTurn;
      int i = 0;
      playerTurn = i;// Player turn will start at 0.
      boolean keepRolling = false;
      int playerRoll;
      String player1Str;
      int nextPlayer;
      
      // See who goes first -------------------------------
      do
      {  
         //what ever each player rolls is set into playerRoll
         playerRoll = players[i].throwDice(dice);
         player1Str = dice.toString();
         
         if(playerRoll == 7)
          {               
             playerTurn = i;
             sopln(players[playerTurn].getName() + " rolls " + player1Str + ", " +         
             players[playerTurn].getName() + " goes first.");
             nextPlayer = playerTurn;
          }     
         
          i = (i + 1) % players.length; 
	   }while(playerRoll != 7);      
     
      //Start the game play -------------------------------
      do //play again loop
      {        
         
         sopln("");
            //This loop is going to set the score of every player to 0 after the game    
            for(i = 0; i < players.length; i++)
            {
              players[i].resetScore();       
            }
         
          do
          {      
    
               do  // player1 turn loop
               {
                playerRoll = players[playerTurn].throwDice(dice);
                  players[playerTurn].addThrowPoints(playerRoll);
                  
                  if(dice.isRatsEyes())
                  {
                      players[playerTurn].endOfTurn(dice.isRatsEyes());
                     sopln(players[playerTurn].getName() + " rolls " + dice.toString() + 
                        " - RATS! Total: " +  players[playerTurn].getTotalPoints()); 
                  }
                  if(dice.isBoxcar())
                  {
                      players[playerTurn].endOfTurn(dice.isRatsEyes()); 
                     sopln( players[playerTurn].getName() + " rolls " + dice.toString() + 
                        " - BOXCARS! Turn: " +  players[playerTurn].getTurnPoints() + 
                        " Total: " +  players[playerTurn].getTotalPoints()); 
                  }         
                  if(!(dice.isRatsEyes() || dice.isBoxcar()))
                  {      
                     sopln( players[playerTurn].getName() + " rolls " 
                     + dice.toString() + "\tTurn: " +  players[playerTurn].getTurnPoints() + 
                        " Total: " +  players[playerTurn].getTotalPoints());
                    if(( players[playerTurn].getTurnPoints() +  players[playerTurn].getTotalPoints()) < 100)
                    {
                       sopln("Give up the dice? ");
                       keepRolling = players[playerTurn].goAgain(kb);
                    }
                  }
                      
               }while(!keepRolling && !dice.isRatsEyes() && !dice.isBoxcar() && 
               (players[playerTurn].getTurnPoints() + players[playerTurn].getTotalPoints()) < 100);
               // end of player1 loop
                players[playerTurn].endOfTurn(dice.isRatsEyes());
            
            
            playerTurn = (playerTurn + 1) % players.length;
                       //player1Turn = !player1Turn;  //determines who turn it is next
        
         }while( players[(playerTurn + 
         players.length - 1)% players.length].getTotalPoints() < 100); // keep going until someone wins.
         sopln("\n" + players[(playerTurn + players.length - 1)% players.length].getName() + " WINS!\t");
         for(i = 0; i < players.length; i++)
         {
            sopln(players[i].getName()+ " " + players[i].getTotalPoints());
         }      
           
         sop("\n\nDo you want to play again?");      
      //This will determine the next Player to go
      nextPlayer = (playerTurn + 1) % players.length; 
      playerTurn = nextPlayer; 
     
      }while(players[playerTurn].goAgain(kb));       
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
