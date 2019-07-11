import java.util.Scanner;
/**********************************************************************
 * Class purpose: Allows me to create and test a class for Cars
 * 
 * @author:  Johnny Haizel-Cobbina
 * @version 9/18/16
 *******************************************/
 
 public class ArrayManipulation
 {
   private static int[] number;
   
   public static void main(String[] args)
   {
      int numInput;
      int population;
      int input;
      int startScan;
      int index;
      int minIndex;
      int minValue;
      int position;
      int newNumber;
      int delete;
      int value;
        
      Scanner keyboard;
      keyboard = new Scanner(System.in);
     do
      {
         System.out.println("Enter an integer between 10-15: ");
         numInput = keyboard.nextInt();
         if(numInput < 10 || numInput > 15)
            {
               System.out.println("The number must be be between 10 and 15, inclusive.");
            } 
                               
      }while(numInput < 10 || numInput > 15);
      
      number = new int[numInput]; 
      for(int i = 0; i <= numInput - 1; i++)
      {
         System.out.print("Input integer number " + (i + 1) + ":" );
         number[i] = keyboard.nextInt();
      }
     
     System.out.print("1.Sort the array.\n2.Insert a number into the array.\n3.Delete a number from the array.\n4.Search for a number.\n5.Print the array.\n6.Continue to next part.\n");
     System.out.print("Enter an Integer between 1-6:"); 
    
    input =  keyboard.nextInt();
    while(input != 6)
     {
     if(input == 1)
     { 
       System.out.print("The unsorted values are: ");
      for (int i = 0; i < number.length; i++)
       {
        System.out.print(number[i] + " ");
       }
       for (startScan = 0; startScan < number.length ; startScan++)
      {
         minIndex = startScan;
         minValue = number[startScan];
         for(index = startScan + 1; index < number.length; index++)
         {
            if (number[index] < minValue)
            {
               minValue = number[index];
               minIndex = index;          
            }
         }
         number[minIndex] = number[startScan];
         number[startScan] = minValue;
        
      }
      System.out.print("\nThe sorted values are: ");
     for (int i = 0; i < number.length; i++)
      {
         System.out.print(number[i] + " "); 
      }
     }      
     int[] values = new int[numInput];
     if(input == 2)
     {
         System.out.print("Before\n");
         for (int i = 0; i < number.length; i++)
         {
            System.out.print(number[i] + " ");
         } 
       System.out.print("\nEnter Postion: ");
       position = keyboard.nextInt();
       keyboard.nextLine();  
       System.out.print("\nEnter new number: ");
       newNumber = keyboard.nextInt();
      
       for (int i = 0; i < number.length; i++)
         {   
            values[i] = number[i];
         }
         
       values[position] = newNumber;
       
       System.out.print("After :");
         for (int i = 0; i < values.length; i++)
         {
            System.out.print(values[i] + " ");
         }                          
     }
     
     if(input == 3)
     {
        System.out.print("Before\n");
        for (int i = 0; i < number.length; i++)
        {
          System.out.print(number[i] + " ");
        } 
        System.out.print("\nWhich index do you want to delete");
        delete = keyboard.nextInt();
        keyboard.nextLine();      
         
         number[delete] = 0;
         
        for (int i = delete; i < number.length; i++)
        {
          if(i == number.length - 1)
           {
               number[i] = 0;
           }
           else
           {
             number[i] = number[i + 1];
           }
        }  
        
        for(int i = 0; i < number.length; i++)
         {
            System.out.print(number[i] + " ");
         }

     }
     if(input == 4)
     {
      int element;      // Element the value is found at
      boolean found;    // Flag indicating search results
      index = 0;
      System.out.print("Search value: ");
      value = keyboard.nextInt();
      // Store the default values element and found.
      element = -1;
      found = false;

      // Search the array.
         do
         {
          if (number[index] == value)
           {
             found = true;
             element = index;
             System.out.print("The number " + value + " , was found at position " +  element);         
           }   
            index++;
          
           }while (!found && index < number.length); 
            
               if(found != true)
               {
                  System.out.print("Your number was not found in the array");
               }          
        }
    
    if(input == 5)
    {
       for (int i = 0; i < number.length; i++)
       {
        System.out.print(number[i] + " ");
       }
    }
    System.out.print("\n1.Sort the array.\n2.Insert a number into the array.\n3.Delete a number from the array.\n4.Search for a number.\n5.Print the array.\n6.Continue to next part.\n");
    System.out.print("Enter an Integer between 1-6:"); 
    input =  keyboard.nextInt();
   }
 
   difference(numInput);
   sum();
   none();
   shift();
 
 }
  
  
   public static void difference(int numInput)
   {  
      int difference;
          
      
      int highest = number[numInput-1];
	   for (int i = 1; i < number.length; i++)
	   {
		   if (number[i] > highest)
			highest = number[i];
	   }
      int lowest = number[numInput-1];
	   for (int i = 0; i < number.length - 1; i++)
	   {
		   if (number[i] < lowest)
			lowest = number[i];
	   }      
     difference = highest - lowest;
     System.out.println("difference: " + difference); 
   }       
   
   public static void sum()
   {  
      int sum = 0;
        
      for (int i = 0; i < number.length; i++)
      {
         if(number[i] != 13)
         {
           sum += number[i];
         }
         else
         {
           i++;
         }
      }
    
      System.out.println("Sum: " + sum);
    }
   public static void none()
   {
      boolean none = true;
      for (int i = 0; i < number.length; i++)
      {
         if(number[i] == 1 && number[i] == 3)
         {
           none = false;
         }
         else if( number[i]/10 == 1 || number[i]/10 == 3)
         {
           none = false;
         }
         else if(number[i]%10 == 1 || number[i]%10 == 3)
         {
            none = false;
         }
        
      }
      System.out.println(none);
   }
   public static void shift()
   {
      int temp = -1;
      for(int i = 0; i < number.length; i++)
      {
          if(i == 0)
          {
            temp = number[number.length - 1];
            number[number.length - 1] = number[i];
          }
          else if(i == number.length - 1)
           {
            number[i-1] = temp;
          }
          else
          number[i-1] = number[i];     
     }  
      
       for (int i = 0; i < number.length; i++)
       {
        System.out.print(number[i] + " ");
       } 
   }
}
