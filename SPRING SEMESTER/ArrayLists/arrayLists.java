import java.util.Scanner;
import java.util.ArrayList;
/**********************************************************************
 * Class purpose: This will find the average and the number of items within the array list
 * 
 * @author:  Johnny Haizel-Cobbina
 * @version 2/2/2016
 *******************************************/
 
public class arrayLists
{
   public static void main(String[] args)
   {
       ArrayList<String> grades = new ArrayList<String>();//creates an array list
        double average;
             
      Scanner keyboard;
      keyboard = new Scanner(System.in);        
      //This do while loop continues to ask it's user for numbers until the juser enters quit
      do
      {
         System.out.print("\nDo you want to quit or enter a number?");
         if(keyboard.hasNextDouble())
         {
           grades.add(keyboard.nextLine());
         }
         else
         {
            if(keyboard.nextLine().equals("quit")) 
            {
               grades.add("quit");
            }
         }
       //This will add what the user puts in as a number in to the grades arraylist 
                                      
      }while((grades.size())== 0 || !grades.get(grades.size()-1).equals("quit"));//This line will check to makes sure that the late input from then user is not "quit"
   
     System.out.print("\nThe ArrayList has "+ (grades.size()-1) + " objects stored in it");
      
     //This for loop gets the sum of values within the arrayList
     int sum = 0;
     for(int i = 0; i < grades.size()-1; i++)
     {  
       sum += Double.parseDouble(grades.get(i));//Sinces grades is a bunch of strings, this will convert it to integers.
     }
     System.out.println("\nThe sum of numbers in the array is: " + sum);
     
     if(grades.size()-1 == 0)
     {
        System.out.print("NaN");
     }
     else
     {
         System.out.print(grades.size());
         average = (sum / (grades.size()-1));
         System.out.print("Average: " + average);
     }
     
     
      double highest = grades.size()-1;//Sets highest to the elements within the ArrayList grades.
	   for (int i = 1; i < grades.size()-1; i++)
	   {
		   if(Double.parseDouble(grades.get(i)) > highest)
			highest = Double.parseDouble(grades.get(i));
	   }
      
      System.out.print("\nHighest: " + highest);
      double lowest = grades.size()-1;
	   for (int i = 0; i < grades.size()- 1; i++)
	   {
		   if (Double.parseDouble(grades.get(i)) < lowest)
         lowest = Double.parseDouble(grades.get(i));
      }
		System.out.print("\nLowest: " + lowest);	

     double centAvg = (sum - (highest + lowest))/((grades.size() - 1) - 2);
     System.out.print("\nCentered Average: " + centAvg); 
      
   }
}