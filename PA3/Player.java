import java.util.Scanner;

/*******************************************************************
 * Player represents a single player in the RatGame.
 ******************************************************************/
public class Player
{
	private String  name;
	private int 	 totalPoints;
	private int 	 turnPoints;


	/*******************************************************************
	 * Explicit value constructor
	 *
	 * sets the name for this player
	 *
	 * @param name The name of this player
	 ******************************************************************/
	public Player(String name)
	{
         name = name; 
            
	}
	
	/******************************************************************
	 * This method throws the dice for this player
	 *
	 * @param dice The RatDice object that we want to throw
	 * @return The total of the dice roll
	 *****************************************************************/
	public int throwDice(RatDice dice)
	{
      int throwDice = dice.throwDice();
	   return throwDice;
	}
	/*****************************************************************
	 * This method adds the points to the turn points for this player
	 *
	 * @param points The points to add to the turn point field
	 ****************************************************************/
	public void addTurnPoints(int points)
	{
		
      turnPoints = turnPoints + points;
      
      
	}
	
	/****************************************************************
	 * endOfTurn updates the accumulated points for this player 
	 * based on turn points and clears turn points.
	 * If ratsEyes is true, turn points are 
	 * cleared and no update to accumulated points occurs.
	 *
	 * @param ratsEyes Whether or not to add the turn points to the 
	 *                 accumulated points.
	 ***************************************************************/
	public void endOfTurn(boolean ratsEyes)
	{
	   if(ratsEyes == true)
      {
         turnPoints = 0;
        totalPoints = totalPoints + turnPoints;
      }
     totalPoints = turnPoints + totalPoints;
     turnPoints = 0;
	}
	
	/***************************************************************
	 * getTurnPoints returns the value of this turn's points
	 *
	 * @return The turn points
	 **************************************************************/
	public int getTurnPoints()
	{
     
     return turnPoints; 
   }
	/**************************************************************
	* getTotalPoints returns the total accumulated points for this
	* user.  It includes both the total points and any points in 
	* the turn points field.
	* @return The total points for this user
	**************************************************************/
	public int getTotalPoints()
	{
	      return totalPoints + turnPoints;
	}
	
	/**************************************************************
	* getName returns the player name
	*
	* @return The player name
	**************************************************************/
	public String getName()
	{
	   return name;
	}
	/**************************************************************
	* goAgain returns true if the player will go again, false 
	* otherwise.  The Scanner object is used to prompt the human
	* player for their response. 
	*
	* @return true if the player wants to go again, false otherwise
	***************************************************************/
	public boolean goAgain(Scanner kb)
	{
        char again;
        boolean goAgain = true;
        boolean onceAgain = false;
    
     while(goAgain)
     {
       again = kb.nextLine().charAt(0);
     
         if(again == 'y' ||again == 'Y'|| again == 'N'|| again == 'n')
         {
             goAgain = false;
            if(again == 'y' ||again == 'Y')
            {
               onceAgain= false;
            }
            else
            {
               onceAgain = false;
            }
         }
         else
         System.out.print("Invalid input, try again!"); 
      }
      return onceAgain;   
  }

	/**************************************************************
	* resetScore resets the turnPoints and totalPoints to zero
	**************************************************************/
	public void resetScore()
	{  
	   this.turnPoints = 0;
      this.totalPoints = 0;
	}
	
	/************************************************************
	 * toString returns a String representation of this Player
	 * in the form of "%s points %d", where %s is the player name
	 * and %d is the total points for this player
	 ************************************************************/
	public String toString()
	{     
     return(this.name + " points " + this.totalPoints); 
	     
	}
}
