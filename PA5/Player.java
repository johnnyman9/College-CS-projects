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
		this.name = name;
      totalPoints = 0;
      turnPoints = 0;
	}
	
	/******************************************************************
	 * This method throws the dice for this player
	 *
	 * @param dice The RatDice object that we want to throw
	 * @return The total of the dice roll
	 *****************************************************************/
	public int throwDice(RatDice dice)
	{
		return dice.throwDice();
	}
	/*****************************************************************
	 * This method adds the points to the throw points for this player
	 *
	 * @param points The points to add to the throw point field
	 ****************************************************************/
	public void addThrowPoints(int points)
	{
		this.turnPoints = this.turnPoints + points;
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
	   if(ratsEyes)
         this.turnPoints = 0;
         
      this.totalPoints = this.totalPoints + this.turnPoints;
      this.turnPoints = 0;
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
	   return totalPoints;
	}
	
	/**************************************************************
	* getName returns the player name
	*
	* @return The player name
	**************************************************************/
	public String getName()
	{
	   return this.name;
	}
	/**************************************************************
	* goAgain returns true if the player will go again, false 
	* otherwise.  The Scanner object is used to prompt the human
	* player for their response. 
	*
	* @return true if the player wants to go again, false otherwise
	**************************************************************/
	public boolean goAgain(Scanner kb)
	{
	   boolean result = false;
      String input = kb.nextLine();
      
      if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"))
         result = true;
      
      return result;
	}

	/**************************************************************
	* resetScore resets the turnPoints and totalPoints to zero
	**************************************************************/
	public void resetScore()
	{
	   this.totalPoints = 0;
      this.turnPoints = 0;
	}
	
	/************************************************************
	 * toString returns a String representation of this Player
	 * in the form of "%s points %d", where %s is the player name
	 * and %d is the total points for this player
	 ************************************************************/
	public String toString()
	{
	   return this.getName() + " points " + this.getTotalPoints();
	}
}
