/*
   Name: Caroline Krusen
   Date: 2/24/16
   Title: Smallest1.java
   Description: program that has user input three numebers and outputs
               the smallest of the three numbers
   Input: user inputs three numbers
   Output: the smallest number
*/

import java.util.Scanner;

public class Smallest1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      int number1;
      int number2;
      int number3;
      
      System.out.print("Enter number #1: ");
      number1 = kb.nextInt();
      
      System.out.print("Enter number #2: ");
      number2 = kb.nextInt();
      
      System.out.print("Enter number #3: ");
      number3 = kb.nextInt();
      
      if (number1 < number2)
      {
        if (number1 < number3)
         System.out.println("Smallest number: " + number1);
      }  
      
      if (number2 < number1)
      {
         if (number2 < number3) 
            System.out.println("Smallest number: " + number2);
      
      }             
      
      if (number3 < number1)
      {
         if (number3 < number2)
            System.out.println("Smallest number: " + number3);
      
      }
      if(number3 == number1)
      {
         if(number2 == number3)
         System.out.print("Smallest number: " + number2);
      }
   }
}      