/***********************************************************
 * RecMath is a class to let you play with recursive mathemtical
 * functions.
 * @author  Johnny Haizel-Cobbina
 * @version March 3, 2016
 ***********************************************************/
public class RecurMath
{

   public static int factCounter = 0;
   
   /*****************************************************************
   * This function returns {@code n} factorial.  
   * The factorial of N is defined as:
   *  N * fact(N - 1) for N > 0, 
   *  and the value 1 otherwise.
   *
   * @param n The number to compute the factorial for
   * @return the factorial of n
   *****************************************************************/
   public static int fact(int n)
   {
      int result = -1;  
      factCounter++;
      
      // The next line is a debugging line which can be used to 
      // trace the execution of your code.  The counter provides us a way
      // to show visually each iteration of the recursive call
      System.out.printf("%" + (factCounter * 2) + "s BEG fact(%d)\n", "", n);
      //-------------------------------------------------------------

      // add your code to compute a factorial here
      // using a recursive routine
      if(n <= 1)
			result = 1;
		else
			result = n * fact(n-1);
      
      
  
      //-------------------------------------------------------------
      
      // You will only see this line as we exit the method (after all recursion
      System.out.printf("%" + (factCounter * 2) + "s END %d = fact(%d) \n", "", result, n);
      factCounter--;
      return result;
   }
   
   /*****************************************************************
   * This function returns the {@code n}'th fibonacci number.  
   * The N'th fibonacci number is defined as:
   *  fib(N - 1) + fib( N - 2) for N >= 2, 
   *  the value 1 for N == 1
   *  and the value 0 otherwise.
   *
   * @param n The number to compute the fibonacci number for
   * @param fibCounter a counter to help us trace execution of this method
   * @return the fibonacci number for n
   *****************************************************************/
   public static int fib(int n)
   {
      //--------------------------------------------------------
      // As a class, we will decide what to print as we enter the method
      int result;
      if( n <= 0)
        result = 0;
      
      
      //--------------------------------------------------------
      // add your code to compute a fibonnaci number
      // using a recursive routine
     else if (n <= 1)
     
      result = 1;
      
      //--------------------------------------------------------
      // As a class, we will decide what to print as we leave the method
      else
         result = fib(n - 1) + fib (n - 2);
      return result;
   }
}












































