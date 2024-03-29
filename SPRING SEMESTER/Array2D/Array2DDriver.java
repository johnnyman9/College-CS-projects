import java.io.*;
import java.util.*;

/** Array2DDriver is a program that will "exercise" the Array2D class.  
 *  The purpose of that class is to provide methods that will manipulate
 *  a simple 2-D array of double values.
 */
 public class Array2DDriver
{
	/** main method
	 	This is the entry point to the application.  Main will build a 2D array
		and then display the sum of a column, row, and the entire array, along
		with a selected row high value and low value.
	 
	 	@param args Should contain the name of the file being used for input
		       data.
	 */
    public static void main(String args[])
   {
      File 		matrixFile;
      Scanner 	matrixScan;
      Scanner 	lineScan;
      String 	line;
      int 		rows, cols;
      double 	result;
   
      double [][] matrix;
   
   	matrixScan = null; // make compiler happy
   	
   	// first check to see if there is a file
      if(args.length == 0)
      {
         System.out.println("Please enter a file name next time.  Ending");
         System.exit(1);
      }
      else
      {
         matrixFile = new File(args[0]);
      
      	// check to see if the file actually exists
         if (!matrixFile.exists())
         {
            System.out.println("Your file " + args[0] + " does not exist.  Ending");
            System.exit(2);
         }
         else	
         {
            try // opening the file
            {
               matrixScan = new Scanner(matrixFile);
            }
                catch (IOException ioe)
               {
               	ioe.printStackTrace();
                  System.out.println("Your file " + args[0] + " could not be opened.  Ending");
                  System.exit(3);
               }
         }
      }
      
		// If we are here, we have a valid file.  
      // First line of the file contains 2 integers determining
      // the size of the matrix
      line = matrixScan.nextLine();
      lineScan = new Scanner(line);
      lineScan.useDelimiter(",");
      
      rows = lineScan.nextInt();
      cols = lineScan.nextInt();
      
      // establish matric size
      matrix = new double [rows][cols];
      
      // fill the matrix
      for (int ii = 0; ii < matrix.length; ii++)
      {
         // each row is a new line from the file
         line = matrixScan.nextLine();
         lineScan = new Scanner(line);
         lineScan.useDelimiter(",");

         for (int jj = 0; jj < matrix[ii].length; jj++)
         {
            matrix[ii][jj] = lineScan.nextDouble();
         }
      }
      
      // We now have a full matrix of values.  Now for the tests
      
		for (int ii = 0; ii < 5; ii++)
		{
         System.out.println("Testing getTotal");
         
         result = Array2D.getTotal(matrix); 
         System.out.println("The total of the 2D array is: " + 
               result);
         
         System.out.println("\nTesting getAverage");
         
         result = Array2D.getAverage(matrix);
         System.out.println("The average of the 2D array is: " + 
               result);
         
         System.out.println("\nTesting getRowTotal for row " + ii);
         
         result = Array2D.getRowTotal(matrix, ii);
         System.out.println("The total of the 2D array row " + ii + " is: " + 
               result);
         
         System.out.println("\nTesting getColumnTotal for column " + ii);
         
         result = Array2D.getColumnTotal(matrix, ii);
         System.out.println("The total of the 2D array column " + ii + " is: " + 
               result);
         
         System.out.println("\nTesting getHighestInRow " + ii);
         
         result = Array2D.getHighestInRow(matrix, ii);
         System.out.println("The highest value in the 2D array row " + ii + " is: " + 
               result);
         
         System.out.println("\nTesting getLowestInRow " + ii);
         
         result = Array2D.getLowestInRow(matrix, ii);
         System.out.println("The lowest value in the 2D array row " + ii + " is: " + 
               result);
         
      }
		System.out.println("\nProgram has completed normally");
   }
}
