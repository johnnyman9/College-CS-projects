import java.util.Scanner;
/*******************************************************
 *@author Johnny Haizel-Cobbina
 * 
 * @version  11/2/15
 ********************************************************/
 public class StdDev
 {
   public static void main(String[] args)
   {
      
      int numInput;
      double[] array;
     
     Scanner keyboard;
     keyboard = new Scanner(System.in);
         if(args.length > 0)    
          {
            numInput = Integer.parseInt(args[0]);
          }
            else
            { 
              numInput = 25;
            } 
            System.out.println(numInput);
           array = new double[numInput];    
           for(int loop = 0; loop < array.length; loop++)
            {
               array[loop] = keyboard.nextDouble();
            }
      
      System.out.printf("Mean: %.2f\n", StdDevHelper.Mean(array));
      System.out.printf("Deviation: %.2f\n", StdDevHelper.StdDev(array));

      
            
   }// END MAIN
}// END Class