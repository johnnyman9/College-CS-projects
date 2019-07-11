import java.util.Scanner;
public class Practical
{    
      Scanner keyboard;
      
  public Practical()
  {     
    keyboard = new Scanner(System.in);
  }   
  
 public void adventure()
 {
    String name;
      String gender;
      String color;
      String animal;
      String time;
      String sound;
      String verb;
      String action;
      String year;
      String enter;   
   
     System.out.print("Welcome to the CSCI-210 Adventure game\n");
      
      System.out.print("                   ");
           
      System.out.print("\nEnter your name: ");
      name = keyboard.nextLine();
   
       System.out.print("Welcome " + name + "," + " You are standing in front of a mansion with an open window, the front door and an open garage. " + 
                     "\nDo you want to enter through options 1,2 or 3: ");
     do
     {
         enter = keyboard.nextLine();
        
        if(enter != "1" || enter != "2" || enter != "3")
        {
          System.out.print("You must enter 1,2 or 3. "+ "\nDo you want to enter through options 1,2 or 3: ");
        }
        
     }while(enter != "1" || enter != "2" || enter != "3");  
    System.out.print("you have choosen to enter through: " + enter);
      
 }
} 
 