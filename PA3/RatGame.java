import java.util.Scanner;

/**********************************************************************
 * Class purpose: To simulate a game of dice
 * 
 * @author  Johnny Haizel-Cobbina
 * @version 11/10/15
 *********************************************************************/
/********************************************************************
 * RatGame plays the game of Rat, our variant of the old game of Pig
 *******************************************************************/
public class RatGame
{
	private Player player1;
	private Player player2;
	private RatDice dice;
	private Scanner kb;
   private boolean debug= true;
	
	/******************************************************************
	 * Explicit value constructor to initialize the game elements
	 *
	 * @param kb The Scanner object (assumed to be the keyboard)
	 * @param player1 The first player defined
	 * @param player2 The second player defined
	 * @param seed 	The seed value to begin the random generator
	 ******************************************************************/
	public RatGame(Scanner kb, Player player1, Player player2, int seed)
	{
		this.kb = kb;
      this.player1 = player1;
      this.player2 = player2;
      this.dice = new RatDice(seed);		
	}
	
	/******************************************************************
	 * playGame performs the game controls and "plays" the game
	 *****************************************************************/
	public void playGame()
	{
       Player whoStarts;// this will get who start
      Player next; // after the game has started
      boolean play;
      
      play = true;  
	 
      while(play)
      {
       whoStarts = firstPerson();
       //passing in who start so it knows who it will be switch to
       next = secondTurn(whoStarts);  
     //Executes as long as the player whose 
     //turn it is has less that 100 point 
     do
       {
         myTurn(whoStarts);
         myTurn(next);         
      }while(player1.getTotalPoints() < 100 && 
       player2.getTotalPoints() < 100); 
      
       winner(); //Prints the winner along with the score after they have won
       player1.resetScore();//resets the score
       player2.resetScore();///resets the score
       //called the loop for the user to either play again or not.
       play = tryAgain();
      }
   
   }
      
      
  
	
/******************************************************************
	 * Explicit value constructor to initialize the game element
	 * @param seed 	The seed value to begin the random generator
    * @return first turn
	 ******************************************************************/   
  public Player firstPerson()
  {
      int firstRoll;
      int secondRoll;
      Player firstTurn;
      boolean tryAgain;
      
      
      firstTurn = new Player("firstTurn");
      tryAgain = true;
      
  while(tryAgain)
  {
      firstRoll = dice.throwDice();
      System.out.printf("%s rolled " +
       " %s\n",player1.getName(), dice.toString());
      secondRoll = dice.throwDice();
      System.out.printf("%s rolled" + 
      " %s\n",player2.getName(), dice.toString());
      if(firstRoll > secondRoll)
      {
         System.out.print(player1.getName() + 
         " will go first.");
         firstTurn = player1;
         tryAgain = false;
         
      }
      if(secondRoll > firstRoll)
      {
         System.out.print(player2.getName() + 
         " will go first.");
         firstTurn = player2;
         tryAgain = false;  
      }
      if(firstRoll == secondRoll)
      {
         System.out.print("You need to throw again.\n");
         tryAgain = true;
      }      
    }
    return firstTurn;

 }
 	
/******************************************************************
	 * This is method gets the winner and returns their information
	 * 
    * 
	 ******************************************************************/ 
   
   public void winner()
   {
      Player winner;
      
      if(player1.getTotalPoints() > player2.getTotalPoints())
       {         
         System.out.printf("%s with a score of: " +  
         " %d is the winner.", player1.getName(), player1.getTotalPoints());
       }  
      else if( player2.getTotalPoints() > player1.getTotalPoints())
      {
         System.out.printf("\n%s with a score of: " +
         " %d is the winner.",player2.getName(),player2.getTotalPoints());
      } 
   } 
	
/******************************************************************
	 * This method asks the user whether they want to play again or not
	 * @return again
	 ******************************************************************/ 
   public boolean tryAgain()
   {
      char answer;
      boolean again = true;
      
         System.out.print("\nDo you want to play again?");
         answer = kb.nextLine().charAt(0);
          
         if(answer == 'y' ||answer == 'Y')
         {
             again = true;        
         } 
	      else if(answer == 'N'||answer == 'n')
         {   
            again = false;
            System.out.print("Thanks for playing the Rats Game!\n");
         }
      
         return again;   
  }

	
/******************************************************************
	 * this will switch the player everytime they play
	 * @param firstTurn 	the player who started first
    * @return numTwo
	 ******************************************************************/   
    public Player secondTurn(Player firstTurn)
    {      
      Player numTwo;
      
      numTwo = new Player("second");
      
      if(firstTurn == player1)
      { 
         numTwo = player2;
      }
      if(firstTurn == player2)
      {
         numTwo = player1;
      }
      
      return numTwo;   
      
    }
  	
/******************************************************************
	 * this method takes care of who is going at the time/Adds turn points 
    * and gets total points after it is over
	 * @param turn
    *
	 ******************************************************************/ 
   public void myTurn(Player turn)
   {     
     int rollOne; 
     boolean ratsEyes; 
     boolean rolling; 
     
     
     ratsEyes = false;
     rolling = true;
      
      while(rolling)
      {
        if(player1.getTotalPoints() < 
        100 && player2.getTotalPoints() < 100)
        {
         rollOne = dice.throwDice();
            
         turn.addTurnPoints(rollOne);
            
         if(rollOne != 12 && rollOne != 2) 
         {
           System.out.printf("%s rolls %s turn:  %d total: %d"+ 
           " "+ " ",turn.getName(), 
           dice.toString(),turn.getTurnPoints(),turn.getTotalPoints());    
            if(player1.getTotalPoints() < 100 && player2.getTotalPoints() < 100)
             {
                   System.out.print("\ndo you want to roll again?");
                   rolling = turn.goAgain(kb);
             }                                   
             else
             {
               rolling = false;
               turn.endOfTurn(false);     
             }   
          }
          if(rollOne == 12)
          {
               System.out.printf("%s rolls %s BoxCar! turn " +
                " %d total\n "+ 
                " ", turn.getName(), dice.toString(), turn.getTurnPoints());
               rolling = false;
               turn.endOfTurn(false);
          }
          if(rollOne == 2)
          {
            System.out.printf("%s rolls %s Rats " +
            " total %d\n "+
            " ", turn.getName(),dice.toString(),turn.getTotalPoints());
               rolling= false;
               ratsEyes = true;
               turn.endOfTurn(ratsEyes);
          }          
        }   
     
     }           
   }

}
