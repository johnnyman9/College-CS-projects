/**************************************************************
 * This class implements a mutable baseball player statistic object.
 * The object maintains a player's hitting statistics: number
 * of official at-bats, walks, hits, and total bases.
 *************************************************************/
public class BaseStat
{
	private int cntAtBat;	// Number of official at-bats
	private int cntWalk;		// Number of walks
	private int cntHit;		// Number of hits
	private int cntTotalBase;	// Number of total bases from hits

	private final boolean DEBUG = false;

	/**************************************************************
	 * This constructor creates a BaseStat object with
	 * all statistics set to 0.
	 *************************************************************/
	public BaseStat()
	{
		Util139.printDebug(DEBUG, "");
		cntAtBat=0;
      cntWalk=0;
      cntHit=0;
      cntTotalBase=0;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
	}

	/**************************************************************
	 * The method modifies the object by adding an out to the player's
	 * statistics. An out counts as an official at-bat but nothing else.
	 * @return The string "out"
	 *************************************************************/
	public String addOut()
	{
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		cntAtBat++;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		return "out";
	}

	/**************************************************************
	 * The method modifies the object by adding a walk to the player's
	 * statistics. A walk does not count as an official at-bat and
	 * it does not count as a hit.
	 * @return The string "walk"
	 *************************************************************/
	public String addWalk()
	{
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		cntWalk++;
      cntTotalBase++;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		return "walk";
	}

	/**************************************************************
	 * The method modifies the object by adding a single to the player's
	 * statistics. A single counts as an official at-bat, a hit, and
	 * as one total base.
	 * @return The string "single"
	 *************************************************************/
	public String addSingle()
	{
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		cntAtBat++;
      cntHit++;
      cntTotalBase++;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		return "single";
	}

	/**************************************************************
	 * The method modifies the object by adding a double to the player's
	 * statistics. A double counts as an official at-bat, a hit, and
	 * as two total bases.
	 * @return The string "double"
	 *************************************************************/
	public String addDouble()
	{
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
      cntHit++;
      cntAtBat++;
      cntTotalBase += 2;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		return "double";
	}

	/**************************************************************
	 * The method modifies the object by adding a triple to the player's
	 * statistics. A triple counts as an official at-bat, a hit, and
	 * as three total bases.
	 * @return The string "triple"
	 *************************************************************/
	public String addTriple()
	{
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
      cntHit++;
      cntAtBat++;
      cntTotalBase += 3;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		return "triple";
	}

	/**************************************************************
	 * The method modifies the object by adding a home run to the player's
	 * statistics. A home run counts as an official at-bat, a hit, and
	 * as four total bases.
	 * @return The string "home run"
	 *************************************************************/
	public String addHomer()
	{
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		cntHit++;
      cntAtBat++;
      cntTotalBase += 4;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		return "homer";
	}

	/**************************************************************
	 * This method returns this object's batting average.  Batting
	 * average is 1000 times the number of hits divided by at-bats.
	 * If there are no at-bats, the average is 0.
	 * @return The batting average
	 *************************************************************/
	public int getBatAvg()
	{
		int avg;
		avg = 0;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		avg = (int)(cntHit / cntTotalBase);
      Util139.printDebug(DEBUG, "avg=%d\n", avg);
		return avg;
	}

	/**************************************************************
	 * This method returns this object's slugging average.  Slugging
	 * average is 1000 times the number of total bases divided by at-bats.
	 * If there are no at-bats, the average is 0.
	 * @return The slugging average
	 *************************************************************/
	public int getSlugAvg()
	{
		int avg;
		avg = 0;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		if(cntAtBat == 0)
      {
         avg = 0;
      }
      else
         avg = (int)(1000 * (cntTotalBase / cntAtBat));
		Util139.printDebug(DEBUG, "avg=%d\n", avg);
		return avg;
	}

	/**************************************************************
	 * This method returns this object's on-base average.  On-base
	 * average is 1000 times the number of hits+walks divided by 
	 * at-bats+walks.
	 * If at-bats+walks is 0, the average is 0.
	 *************************************************************/
	public int getOnBaseAvg()
	{
		int avg;
		avg = 0;
		Util139.printDebug(DEBUG, "this=%s\n", this.toString());
		avg = (int)(((cntHit + cntWalk) / (cntTotalBase + cntWalk)) * 1000);
		Util139.printDebug(DEBUG, "avg=%d\n", avg);
		return avg;
	}

	/*********************************************************
	 * This method returns a string representation of the object.
	 * @return A string representation of the object
	 *********************************************************/
	public String toString()
	{
		String str;
		str = "(AB=" + cntAtBat
		 + ",H=" + cntHit
		 + ",TB=" + cntTotalBase
		 + ",BB=" + cntWalk	// Walks are also known as "Base on Balls" or BB
		 + ")";
		return str;
	}

}