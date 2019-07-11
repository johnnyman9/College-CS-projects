/**   
 * @author johnny Haizel-Cobbina
 * @version V1 - 2/25/2015
 ************************************************************/
import java.io.*;
public class FileArray
{
   public static void main(String[] args) throws IOException
   {
      int[] nums = {1,2,3,4,5,6,7,8,9};
      
      // Print the array (may want to use a method/function)
         for(int i = 0; i < nums.length; i++)
         {
            System.out.println(nums[i]);
         }
      // Write the array to a file named myArray.dat
         writeArray(nums,"myArray.dat");
         readArray("myArray.dat");
      // Change element 3 to 12, and the element 6 to 24
    

      // Print the array to verify the above changes
      
      // Read the array from the file myArray.dat
      
      // Print the array
      
   }
   public static void writeArray(int[] nums,String myArray) throws IOException
   {
     FileOutputStream fstream = new FileOutputStream("myArray.dat");
     DataOutputStream outputFile = new DataOutputStream(fstream);
     
     System.out.print("\nWriting numbers to File........");
     
     for(int i = 0; i < nums.length; i++)
     {
        if(i == 3)
        {
          nums[i] = 12; 
        }
        if(i == 6)
        {
            nums[i] = 24;
        }
         
         outputFile.writeInt(nums[i]);
     }
     
     System.out.print("\nDone");
     outputFile.close();
   }
   
   public static void readArray(String myArray) throws IOException
   {
      int number;
      boolean endOfFile = false;
      
     FileInputStream fstream = new FileInputStream("myArray.dat");
     DataInputStream inputFile = new DataInputStream(fstream);
     
     System.out.print("\nReading numbers from file " + myArray + ".");
     
     while(!endOfFile)
     {
         try
         {
            number = inputFile.readInt();
            System.out.print(number + " ");
         }
         catch(EOFException e)
         {
            endOfFile = true;
         }
     } 
     
     System.out.print("\nComplete");
     inputFile.close(); 
   }
   

}