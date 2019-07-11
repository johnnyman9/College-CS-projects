import java.util.Scanner;
/**********************************************************************
 * Class purpose: These are some exceptions that are found within coding daily and how to deal with them.
 * 
 * @author:  Johnny Haizel-Cobbina
 * @version 2/18/16
 *******************************************/
public class Exceptions
{
   public static void main(String[] args)
   {
       Scanner keyboard;
      keyboard = new Scanner(System.in);
     
      //This code is an example of an ARITHMETIC EXCEPTION   
         int x = 6;
         int y = 0;
          Scanner keyboard;
      keyboard = new Scanner(System.in);
         
        int answer = x/y;// The variable x is being divided by zero which is undefined.
        System.out.print(answer);
        
        //This code will catch the arithmetic Expection   
         int x = 6;
         int y = 0;
         
         if( y != 0)
          {
            int answer = x/y;// The variable x is being divided by zero which is undefined.
             System.out.print(answer);
          }
        else
        System.out.print("This is an arithmetic expection");

     //This Code is potential for an Input mismatch error. If the user inputs a String instead of an integer.
       int character;
      
        System.out.print("Enter A: ");
        character = keyboard.nextInt();
        
        System.out.print(character);   
      
 //This will tell the user their error if there is a type mismath error      
       
       System.out.print("Enter A: ");
       if(keyboard.hasNextInt())
       {
         System.out.print(keyboard);
       }
       else
       System.out.print("This will cause a type mismatch error");

 
 //This will create an Out of Bounds Exceptions because you are checking for a bigger array size than you actually have created.   
 
       int[] number = new int[6];
         for( int i = 0; i <= 6; i++)
         {
           number[i] = -1;
         }
 
//This will make sure to check for anything less than 6 but not equal to six cause it does not exist.
   int[] number = new int[6];
         for( int i = 0; i < 6; i++)
         {
           number[i] = -1;
           System.out.println(number[i]);
         }

 //This will give a null pointer expections because the string foo is empty.
          String foo = null;
          int length = foo.length();   
         
       
//This will tell the user that there is null pointer error.      
       String foo = null;
       if(foo != null)
       { 
         int length = foo.length();
          System.out.print(length);
       }
       else
       System.out.print("this will give you a null pointer error");
                               
   }
}