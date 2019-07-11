import java.util.Scanner;
/**********************************************************************
 * Class purpose: Produce Star patterns demonstrating nested loops
 * 
 * @author  Johnny Haizel-Cobbina
 * @version V2 10/26/05
 *********************************************************************/

public class Stars
{
   /******************************************************************
    * Function purpose:  Prints one star pattern 
    *
    * @param args Command line arguments, ignored
    *****************************************************************/

   public static void main (String[] args)
   {
      char     hiPattern;  // pattern count
      int      maxRows;    // maximum number of rows to print
      Scanner  stdIn;      // standard input
      int      starCnt;    // Stars per row
      int      blnkCnt;    // Blanks preceding the stars

      stdIn = new Scanner(System.in);
      
      System.out.print("Enter positive number for the number of rows: ");
      maxRows = stdIn.nextInt();
      while (maxRows <= 0)
      {
         System.out.printf("\nYou did not enter a POSITIVE number.  You entered %d!\n", maxRows);  
         System.out.print("Enter a positive number for the number of rows: ");
         maxRows = stdIn.nextInt();
      }
      
      //**************************************************
      // First Example, stars per row goes from 1 to maxRow
      //**************************************************
      System.out.println();
      System.out.println("Example\n");
      for (int row = 1; row <= maxRows; row++)
      {
         for (int star = 1; star <= row; star++)
            System.out.print ("*");
         System.out.println();
      }
      
      //*******************************************************
      // Insert code for patterns (a), (b), (c), and (d) below.
      //*******************************************************
   
     System.out.print("Pattern A\n");
     for(int row = 1; row <= maxRows; row++)
     {
         for (int star = maxRows; star >= 1; star--)
         {      
                 if(star >= row)
                  {
                     System.out.print("*");
                  }
                  else
                  System.out.print(" ");
         
         }
            System.out.println();
     }
     
     System.out.print("Pattern B\n");
     for(int row = 1; row <= maxRows; row++)
     {
       for(int star = maxRows; star >= 1; star--) 
         {
            
            if(star > row)
             {
               System.out.print(" ");
             }
             else  
               System.out.print("*");
              
         }
          System.out.println();
            
        
         
       
     }
     
     System.out.println();
     System.out.print("Pattern C\n");
     for (int row = 1; row <= maxRows; row++)
      {
         for (int star = 1; star <= maxRows; star++)
         {      
                 if(star >= row)
                  {
                     System.out.print("*");
                  }
                  else
                  System.out.print(" ");
         
         }
         System.out.println();      
   }

}
}
