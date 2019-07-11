import java.util.*;

/****************************************************************
* An example of using a counter with an object that has a 
* recursive method. This class implements an array of int and
* has a recursive fill method.
 * @author  Johnny Haizel-Cobbina
 * @version March 3, 2016
****************************************************************/
public class IntArr
{
   private int [] array;
   private int fillCounter;

   /****************************************************************
   * Constructor makes an aray of size {@code size}.
   ****************************************************************/
   public IntArr(int size)
   {
      array = new int[size];
      fillCounter = 0;
   }

   /****************************************************************
   * This method loads elements from {@code begIndx} to {@code endIndx}
   * with the value {@code value}.
   * 
   * @param value the value to use in initializing the array
   * @param begIndx the beginning index to fill
   * @param endIndx the ending index to fill
   ****************************************************************/
   // Implement this recursively.  Only load one value, then call
   // {@code fill} recursively to load the rest.
   //**************************************************************
   public void fill(int value, int begIndx, int endIndx)
   {
      //------------------------------------------------------------
      // Put in this section the code to print the beginning values.
      // Note the fillCounter which can be used to count each iteration 
      // of the method and the indent method that you will find in the Labm1
      // file.
       fillCounter++;
	   System.out.printf("%" + (fillCounter * 2) + "s BEG fill(%d,%d)\n", "", begIndx, endIndx);
   	System.out.printf("%" + (fillCounter * 2) + "s array(%s)\n", "",this);	  
	  

   	  array[begIndx] = value;
        if (begIndx < endIndx) 
		 fill(value, begIndx + 1, endIndx);
	  // else we are done

	  System.out.printf("%" + (fillCounter * 2) + "s END fill(%d,%d)\n", "", begIndx, endIndx);
    System.out.printf("%" + (fillCounter * 2) + "s array(%s)\n", "", this.toString());	  
	  fillCounter--;
	  
      
      
      
      
      
      
      
      //-------------------------------------------------------------
      // Put in this section the code to perform the fill, recursively
   
   
   
   
   
      //-------------------------------------------------------------
      // Put in this section the code to print the ending values.
   }

   /****************************************************************
   * This method returns a string representation of the object.
   ****************************************************************/
   public String toString()
   {
      return Arrays.toString(this.array);
   }
}