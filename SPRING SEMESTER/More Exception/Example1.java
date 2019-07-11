/**********************************************************************
 * Class purpose: This code catches execption
 * 
 * @author:  Johnny Haizel-Cobbina
 * @version 2/21/16
 *******************************************/
public class Example1
{
    public static void main(String[] args)
    {
	int     denominator, numerator, ratio;


	numerator   = 5;
	denominator = 0;

   try
   {
	   ratio = numerator / denominator;  
      System.out.println("The answer is: " + ratio);
   }
   
   catch(ArithmeticException cow)
   {
      cow.printStackTrace();
      
	   System.out.println("Done."); // Don't move this line
      System.out.println("Divide by 0;");
   }
   }
}