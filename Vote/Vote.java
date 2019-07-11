/**********************************************************************
 * Class purpose: Vote class
 * 
 * @author  Johnny Haizel-Cobbina
 * @version 10/13/15
 *********************************************************************/
public class Vote
{
	// declare your attributes (global variables here)
	private int mcauliffe;
	private int cuccinelli;
	private int sarvis;
	
	// create the votemCauliffe() method here
   public void voteMcauliffe()
   {
         mcauliffe++;
   }
	// create the voteCuccinelli() method here
   public void voteCuccinelli()
   {
         cuccinelli++;
   }	
	// create the voteSarvis() method here
   public void voteSarvis()
   {
         sarvis++;
   }
	
	// here is the toString method that you will use to print the results
	public String toString()
	{
		String builder;
		builder = String.format("McAuliffe: %d\nCuccinelli: %d\nSarvis: %d",
				mcauliffe, cuccinelli, sarvis);
		return builder;
	}
}
