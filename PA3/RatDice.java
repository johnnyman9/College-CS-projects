import java.util.Random;

/******************************************************************
 * RatDice represents the two dice from the RatGame
 *****************************************************************/
public class RatDice
{
	private int die1;
	private int die2;
	private Random rand;
	
	/**************************************************************
	 * Constructor that takes in the random seed and creates the 
	 * dice objects
	 *
	 * @param seed The seed value for the random generator
	 *************************************************************/
	public RatDice(int seed)
	{
		 rand = new Random(seed);
		 throwDice();            // make sure it is in correct state
	}
	
	/*****************************************************************
	 * throwDice simulates the dice throw.
	 *
	 * @return the total of the face value of the dice after throwing
	 *****************************************************************/
	public int throwDice()
	{
		die1 = rand.nextInt(6) + 1;
		die2 = rand.nextInt(6) + 1;
		return getTotal();
	}
	/*****************************************************************
	 * get the total value of both dice without throwing them
	 *
	 * @return the total of the face value of the dice after throwing
	 *****************************************************************/
	public int getTotal()
	{
		return die1 + die2;
	}
	
	/*****************************************************************
	 * isRatsEyes returns true if the dice are both 2 and false otherwise
	 * 
	 * @return true if rats eyes, and false otherwise
	 ******************************************************************/
	public boolean isRatsEyes()
	{
		return die1 == 1 && die2 == 1;
	}
	/*****************************************************************
	 * isBoxcar returns true if the dice are both 6 and false otherwise
	 * 
	 * @return true if boxCar, and false otherwise
	 ******************************************************************/
	
	public boolean isBoxcar()
	{
		return die1 == 6 && die2 == 6;
	}
	
	/******************************************************************
	 * a String representation of these Dice in the form %d-%d where 
	 * d is replaced by each of the die face values.
	 *
	 * @return A String representation of these Dice.
	 *****************************************************************/
	public String toString()
	{
		return die1 + " - " + die2;
	}
}
	
