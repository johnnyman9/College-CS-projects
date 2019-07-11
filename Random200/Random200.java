/********************************************************
 * This program will stimulate a random number generator. 
 *
 * @author Johnny Haizel-Cobbina
 * @version 9/19/2015
 ********************************************************/
 /*******************************************************
 *  References and Acknowledgements: Johnny Haizel-Cobbina
 *  
 *
 ********************************************************/
import java.util.Random; // needed for keyboard input
 

public class Random200
{  
static Random randomNumber = new Random();
 static int number;   
      public static boolean isHeads()
      {
      number = randomNumber.nextInt(2); // set heads equal to 1 and tails equal to 0. so if the number is 1 then you outcome is heads.
      if (number==1)
         return true;
      else
         return false;
      }
      
      public static int diceRoll()
         {  
            number = randomNumber.nextInt(6) + 1;// calculates the number after the dice is rolled. Add 1 so you dont get a 0
            return number;
         }
      public static int randomRange(int LO_VAL, int HI_VAL)
         {
              number = randomNumber.nextInt(HI_VAL)+ LO_VAL;
               return number;
                
              
         }
    
    
}