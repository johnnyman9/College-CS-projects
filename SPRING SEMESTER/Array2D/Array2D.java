/** Array2D - Provides tools for manipulating a 2D array
   
	@author - Johnny Haizel-Cobbina
	@version - V1 - YOUR DATE GOES HERE
 */
public class Array2D
{
	/** getTotal sums all of the values of the array.
	 *
	 * @param matrix The two dimensional array
	 * @return The sum of the array elements
	 */
	public static double getTotal(double [][] matrix)
	{
		  double total;
        total = 0;
      for (int row = 0; row < matrix.length; row++)
      {
         for (int col = 0; col < matrix[row].length; col++)
         total += matrix[row][col];
      }

      return total;
        
         
	}
	
	/** getaverage averages all of the values of the array.
	 *
	 * @param matrix The two dimensional array
	 * @return The average of the array elements
	 */

	public static double getAverage(double [][] matrix)
	{
		int total;
      total = 0;
      for (int row = 0; row < matrix.length; row++)
      {
         for (int col = 0; col < matrix[row].length; col++)
         total += matrix[row][col];
       }

   return (total/matrix.length);
	}
	
	/** getRowTotal sums all of the values in one row of the array.
	 *
	 * @param matrix The two dimensional array
	 * @param row The number (0 based) of the row to sum
	 *
	 * @return The sum of the row array elements.  If the row does not exist
	 *         in matrix....YOU FILL IN THE REST.
	 */

	public static double getRowTotal(double [][] matrix, int row)
	{
      double total = 0;
  if(row > matrix[0].length)
  {
      return 0;
  }
  else
  { 
   for (int i = 0; i < matrix.length; i++) 
    {
      if(i == row)
      {
        for(int index = 0; index < matrix[i].length; index++)
         {   
            total += matrix[i][index];         
         }
      }
    }
    return total;
	}

	}
	
	/** getColumnTotal sums all of the values in one column of the array.
	 *
	 * @param matrix The two dimensional array
	 * @param col The number (0 based) of the col to sum
	 *
	 * @return The sum of the array elementsin that column.  
	 *				If the row does not exist in matrix....YOU FILL IN THE REST.
	 */
	public static double getColumnTotal (double [][] matrix, int col)
	{
       double total = 0;
  if(col > matrix[0].length)
  {
      return 0;
  }
  else
  { 
   for (int i = 0; i < matrix.length; i++) 
    {
      for(int index = 0; index < matrix[i].length; index++)
      {   
      
      if(index == col)
      {
        total += matrix[i][index];
      }
    }
   }


    return total;
	}
  }

	/** getHighestInRow finds the largest value one row of the array.
	 *
	 * @param matrix The two dimensional array
	 * @param row The number (0 based) of the row to find the largest
	 *
	 * @return The highest of the row array elements.  If the row does not exist
	 *         in matrix....YOU FILL IN THE REST.
	 */
	public static double getHighestInRow(double [][] matrix, int row)
	{
   
   double highest = 0;
  if(row > matrix.length)
  {
   return 0;
  }
  else
  {   
    for (int i = 0; i < matrix.length; i++) 
    {
        for(int col = 0; col < matrix[i].length; col++)
        {
         if (matrix[i][col] > highest) 
         {
            highest = matrix[i][col];
         }
        }      
     }
    return highest;
   }
  }	
	
	/** getLowestInRow finds the lowest value one row of the array.
	 *
	 * @param matrix The two dimensional array
	 * @param row The number (0 based) of the row to find the lowest
	 *
	 * @return The lowest of the row array elements.  If the row does not exist
	 *         in matrix....YOU FILL IN THE REST.
	 */
	public static double getLowestInRow(double [][] matrix, int row)
	{
	  double lowest = 0;
  if(row > matrix.length)
  {
   return 0;
  }
  else
  {   
    for (int i = 0; i < matrix.length; i++) 
    {
      if(i ==row)
      {
        for(int col = 0; col < matrix[i].length; col++)
        {
         if (matrix[i][col] < lowest) 
         {
            lowest = matrix[i][col];
         }
        }
      }
     }
    return lowest;
   }
}
}
