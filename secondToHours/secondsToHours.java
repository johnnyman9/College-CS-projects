import java.util.Scanner;
/********************************************************
 * This class is a starting place for Java
 *  
 * This is where a description of the class should be
 *
 * @author - Johnny Haizel-Cobbina
 * @version - 9/10/151
 ********************************************************/
 /*******************************************************
 /  References and Ackknowledgements: I have recieved
 /  no help on this programming assignment
 /
 /*******************************************************/

public class secondsToHours
{
   public static void main(String[] args)
   {
      //declarations
      int minutes;
      int seconds;
      int hours;
      int secondsInMinutes;
      int secondsInHour;
      
      Scanner keyboard;
      keyboard = new Scanner(System.in);
     
      secondsInMinutes = 60;
      secondsInHour = 3600;
       
      System.out.print("Type the number of seconds: ");
      seconds = keyboard.nextInt();//This will ask how many seconds there they have?
     
      hours = seconds/secondsInHour; // This will figure out the number of hours from the amount of seconds put in.
      System.out.print("\nhour = " + hours);
      
      minutes = ((seconds % secondsInHour)/secondsInMinutes);// The remainder of the after getting hours is divided by 60 to get minutes.
      System.out.print("\nminutes = " + minutes);
      
      seconds = ((seconds % secondsInHour)% secondsInMinutes);// The remainder of hours and the remainder of minutes is going to be how many you have left for seconds.
      System.out.print("\nseconds = " + seconds);
      
      
      
   }
}