/** RandomPlay class is a driver to test the Random200 class

 */ 
 public class RandomPlay
 {
 	/** main method will exercise each of the Random139 methods in turn.
	 *
	 * @param args Array of command line arguments - unused
	 */	
	public static void main(String args[])
	{
		final int TIMES = 10;   // test each method 10 times
		final int LO_VAL = 1;   // initial test of randomRange
		final int HI_VAL = 2;  // initial test of randomRange
		
		int 		counter;	 	// loop control variable
		int 		randomNum;	// reciever for random numbers
		boolean	heads; 		// receiver for coin flip results
		
		System.out.println("Coin flips\n");
		
		// test isHeads    
		// start counter at 1, continue until 10, incrementing by 1
		for (counter = 1; counter <= TIMES; counter++)
		{
			heads = Random200.isHeads();
			
			if (heads) 
				System.out.print("heads\t");
			else
				System.out.print("tails\t");
			
			// skip to new line if 5 values on the line
			if (counter % 5 == 0)
				System.out.println();  
				
		}
		
		System.out.println("\nDice Rolls\n");
		
		// test diceRoll
		// start counter at 1, continue until 10, incrementing by 1
		for (counter = 1; counter <= TIMES; counter++)
		{
			randomNum = Random200.diceRoll();
			
			System.out.print(randomNum + "\t");
						
			// skip to new line if 5 values on the line
			if (counter % 5 == 0)
				System.out.println();  
				
		}
		
		System.out.printf("\nRandom Range from %d to %d\n\n", LO_VAL, HI_VAL);
		
		// test randomRange
		// start counter at 1, continue until 10, incrementing by 1
		for (counter = 1; counter <= TIMES; counter++)
		{
			randomNum = Random200.randomRange(LO_VAL, HI_VAL);
			
			System.out.print(randomNum + "\t");
						
			// skip to new line if 5 values on the line
			if (counter % 5 == 0)
				System.out.println();
				  	
		} 
	}
     
 }
 
 