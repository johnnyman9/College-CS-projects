/*******************************************************
 *@author Johnny Haizel-Cobbina
 *  
 * @version 11/2/2015  
 ********************************************************/
public class StdDevHelper
{
   /******************************************************
	 * Sets user input equal to boy or girl
	 * @param args double[] array
    * @return mean
	 ******************************************************/ 
   public static double  Mean(double[] array) 
   {
      double mean = 0;
      double sum = 0;
      
      for(int i = 0; i < array.length; i++)
      {
         sum += array[i];
         mean = sum/array.length;
      }
      return mean;
    }
      
     /******************************************************
	 * Sets user input equal to boy or girl
	 * @param args double[] array
    * @return StdDev
	 ******************************************************/ 
      public static double StdDev(double[] array)
      {
        //Initializes the variables
        double[] value;
        double[] value2;
        double mean;
        double meani = 0;
        double StdDev = 0;
      
      //Intantites value and value2.
      value = new double[array.length]; 
      value2 = new double[array.length];
     
      mean = Mean(array);
      //Using the formula for standard deviation, this calculates the stdDev
         for(int i = 0; i < array.length; i++)
         {
            value[i] = array[i]-mean;
         }
      
            for(int i = 0; i < array.length; i++)
             {
               value2[i] = Math.pow(value[i],2); 
             }
         meani = StdDevHelper.Mean(value2);
         StdDev = Math.pow(meani,.5);
         return StdDev;

   }
}