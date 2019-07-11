/***********************************************************
This is the driver for the Adventure game
You shouldnt have to change anything in this file...

@version .01 - Johnny Haizel-Cobbina (<- put your name here)

************************************************************/
public class AdventureDriver
{
   public static void main(String[] args)
   {  
      Adventure game = new Adventure();
      game.playGame();
      System.out.print("Thanks for playing!");
   }
}