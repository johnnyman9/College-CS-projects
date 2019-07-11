import java.util.Scanner;
/********************************************************
 * This class is a starting place for Java
 *  
 * This program will calculate whether the year is a leap year or not
 *
 * @author - Johnny Haizel-Cobbina
 * @version - 9/17/2015
 ********************************************************/
 /*******************************************************
 /  References and Ackknowledgements: I have recieved
 /  no help on this programming assignment
 /
 /*******************************************************/
 
 public class leapYear
 {
   int leapYear;
   
   public static void main(String[] args)
   {
      //declarations 
      int leapYear;
      int years;
      int grade;
      
      
      Scanner keyboard;
      keyboard = new Scanner(System.in);
      
     System.out.print("Enter the year: ");// Asks for an input from the user
     years = keyboard.nextInt();
     
     if(years <= 1582)// if the year is 1582 or below, it will let the user know that the gregorian calender did not exist during that time.
      {
           System.out.print(years + " is before the Gregorian calender therefore not a leap year");   
      }
      else if(years % 4 == 0 && years % 100 != 0 || years % 400 == 0) // checks to make sure that you get a true, true and true in order to prove that it is a leap year or not.           {
            {
             System.out.print(years + " is a leap year");
            }
      else
          System.out.print(years + " is not a leap year"); 
   
   
   
   
   
    System.out.println("\nEnter number grade: ");
    grade = keyboard.nextInt();
    
    switch(grade)
    {
    
         case 0:              
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            System.out.println("you exam grade of  " + grade + " is an F" ); // sets the different numbers to a designated letter grade.
            break;
         case 6:
             System.out.println("you exam grade of a " + grade + " is an D");
             break;
         case 7:
              System.out.println("you exam grade of a " + grade + " is an C");
              break;
         case 8:
            System.out.println("you exam grade of an " + grade + " is an B");
            break;
         case 9:
         case 10:
              System.out.println("you exam grade of a " + grade + " is an A");
              break;
         default:
            System.out.println("Invalid choice.");
     
     }    
 
   
   
   
   
   
   
   }
 }