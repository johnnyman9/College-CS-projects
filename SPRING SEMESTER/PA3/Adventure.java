import java.util.Scanner;
import java.util.Random;

public class Adventure
{
   private final static int numCols = 3;
   private final static int numRows = 3;
   private final static int maxCol = numCols - 1;
   private final static int maxRow = numRows - 1;
   private final static int itemsPerRoom = 3;
  // private final static int playerItems = 3;
   Scanner kb;
   Player player;
   private Room[][] rooms;
   private final boolean DEBUG = true;
    int playerHealth = 25;
    int enemyHealth = 110;
    int enemyAttack = 26;
    int playerAttack =25;
    boolean notWin = true;
   
   public Adventure()
   {
      kb = new Scanner(System.in);
      initGame();
      initPlayer();  
   }
   
   public void playGame()
   {
      
     System.out.println("\nThere has been cases of individuals acting in strange ways. They have been seen attacking and eating human flesh!" + "\nWhile back from a friend's house, you hear a strange growling sounds coming from a creepy old house." +"\nWith your leave of curiosity, you decide to check it out.");
   
      while(notWin)
      {      
         //sop room description
         sop(rooms[player.getYPos()][player.getXPos()].getDesc());
         sop("Exits: " + getExits(player.getYPos(), player.getXPos()));
         sop("");
         //sop room inventory
         sop("You see: " + rooms[player.getYPos()][player.getXPos()].listItems());
         sop("You have: " + player.getInventory());
         //allow move
         sopNNL(player.getName() + ", what should you do now? ");
         //continue until player quits
         notWin = command(kb.nextLine());
         //check win condidtion           
      }
   }
   
   public String getExits(int x, int y)
   {
      String result = "";
      if(x != 0)
         result = result + "North ";
      if(y != maxCol)
         result = result + "East ";
      if(x != maxRow)
         result = result + "South ";
      if(y != 0)
         result = result + "West ";
      
      return result;            
   } 
   
   public boolean command(String command)
   {
      boolean result = true;
      command = command.toLowerCase();
      String verb = "";
      String noun = "";
      
      int space = command.indexOf(' ');
      if(space == -1)
      {
        if(command.equals("exit") || command.equals("end") || command.equals("quit"))
            verb = "quit";
         else if(command.equals("inventory") || command.equals("inv"))
            verb = "inventory";
         else if(command.equals("attack") || command.equals("Attack"))
            verb = "attack";
         else if(command.equals("load"))
            verb = "load";
         else
         {
            verb = "move";
            noun = command;            
         }   
      }
      else
      {
         verb = command.substring(0, space);
         noun = command.substring(space + 1);
      }
//      if(DEBUG) sop("Comm: " + command + " Verb: " + verb + " Noun: " + noun);
      
      switch(verb)
      {
         case "move":
         case "mov":
         case "go":
            move(noun);
            break;
         case "get":
         case "grab":
            get(noun);
            break;
         case "put":
         case "drop":
            drop(noun);
            break;   
         case "attack":
            attack(noun);
            if(enemyHealth < 1 || playerHealth < 1)
            {
               result = false;
            }
            break;
          case "load":
            loadGun(noun);
            break;
          case "quit":
            result = false;
            break;
         case "inventory":
            printInventory();
            break;
         default:
            sop("I dont know how to: " + verb);
      }
      return result;
   }
   
   public void drop(String noun)
   {
      if(DEBUG) sop("" + rooms[player.getYPos()][player.getXPos()].getItemCount());
      if(rooms[player.getYPos()][player.getXPos()].getItemCount() < itemsPerRoom)
      {   
         if(rooms[player.getYPos()][player.getXPos()].addItem(player.loseItem(noun)))
            sop("You dropped the " + noun);
         else
            sop("Something didnt work...");
      }
      else
         sop("No place in the room to drop anything...");
   }
   
   public void get(String noun)
   {      
      Item result = rooms[player.getYPos()][player.getXPos()].getItem(noun);
      if(result != null)
      {
         sop("You now have the " + noun);
         player.recieveItem(result);
      }
      else
         sop("I dont see the " + noun);  
   }
   
   public void move(String direction)
   {
      switch(direction)
      {
         case "north":
            if(player.getYPos() == 0)
               sop("You cant move North from here!");
            else
               player.setYPos(-1);
            break;
         case "south":
            if(player.getYPos() == maxRow)
               sop("You cant move South from here!");
            else
               player.setYPos(1);
            break;
         case "east":
            if(player.getXPos() == maxCol)
               sop("You cant move East from here!");
            else
               player.setXPos(1);
            break;
         case "west":
            if(player.getXPos() == 0)
               sop("You cant move West from here!");
            else
               player.setXPos(-1);
            break;
         default: 
            sop("I can't move THAT direction!");
      }
   }
   
   public void printInventory()
   {
      sop(player.getInventory());
   } 
   
   public void initPlayer()
   {
      Player result;

         sopNNL("What is your name? ");
         result = new Player(kb.nextLine());
      
      this.player = result;
   }
    
   public void initGame()
   {
      int num = 0;
      Item temp;
      rooms = new Room[numCols][numRows];
      
      for(int loopRow = 0; loopRow < numRows; loopRow++)
      {
         for(int loopCol = 0; loopCol < numCols; loopCol++)
         {
            rooms[loopRow][loopCol] = new Room(getDesc(num));
            num++;
         }
      }
      
      temp = new Item("knife");
      rooms[0][2].addItem(temp);
      
      temp = new Item("unloaded shotgun");
      rooms[2][0].addItem(temp);
      
      temp = new Item("Hammer");
      rooms[0][0].addItem(temp);
      
      temp = new Item("shotgun shells");
      rooms[0][1].addItem(temp);

 
   }
   
   public static String getDesc(int num)
   {
      String desc;
      switch(num)
      {
         case 0:
				desc = "You are in the bathroom now, the mirror is shattered and there is a bloody hammer in the running sink";
				break;
			case 1:
				desc = "YOU ARE STARTLED ONCE AGAIN BY A GROWL FROM THE SOUTH! "+"\nyou are in the master bedroom, everything is knocked over or broken. You see shotgun shells on the floor";
				break;
			case 2:
				desc = "You are in the kitchen. This room is clean, looks like someone was cooking something." + "\nThere is a knife on the counter";
				break;
			case 3:
				desc = "YOU ARE STARTLED BY A GROWL FROM THE EAST! You are standing in a huge dining room. With broken chairs and broken plates all over the ground";
				break;
			case 4:
				desc = "There is an Infected person here! she stops eating on the flesh of a dead man,BUT NOW THIS THING IS COMING AFTER YOU!";
				break;
			case 5:
				desc = "YOU ARE STARTLED BY A GROWL FROM THE WEST!" + "\nYou are in the dining room of the cabin now, blood stains on the floor continue but the markings go towards the room with the growling";
				break;
			case 6:
				desc = "You are standing in a small dinning room, It is in perfect condition. There is a shotgun in the corner";
				break;
			case 7:
				desc = "\nYou are standing in the foyer of a creepy house. You see a sign on the door that tells you DO NOT ENTER!" + "\nYou hear a growling sound coming from the North";
				break;
			case 8:
				desc = "You are in the Living room. There are blood stains all over the wall, blood stains that look like a body was drag on the floor";
				break;
			default:
				desc = "No CLUE\n";
				break;		
      }
      return desc;
 }
public void loadGun(String noun)
{
   Item temp;
 if(player.getInventory().contains("unloaded shotgun") && rooms[player.getYPos()][player.getXPos()].getDesc().contains("shotgun shells"))
 {
    System.out.println("\nNEW ITEM: ");
        
        temp = new Item("loaded shotgun");
        rooms[0][1].addItem(temp);
 }
 else
 {
     System.out.println("\nYou don't have a gun to load or there are no shotgun shells in this room");
 }
}
public void attack(String noun)
{  
  if(rooms[player.getYPos()][player.getXPos()].getDesc().contains("Infected person")){  
   if(player.getInventory().contains("loaded shotgun")||player.getInventory().contains("knife")){
        while(enemyHealth > 0 && playerHealth > 0){
         
          Random rand = new Random();
          String enemy = "OH NO, THERE IS AN Infected person ATTACKING";
          int health = rand.nextInt(enemyHealth);
        
           System.out.println("\nPlayer Health: " + playerHealth);
           System.out.println("\nThis infected person has: " + enemyHealth); 
           System.out.println("\nWhat do you want to do? Enter stab or shoot to engage");
           String attackForm = kb.nextLine();
             if(attackForm.equals("stab")){ 
               System.out.println("\nThis method is proving in effective as the infected man chews on your flesh");
               int hitNum = rand.nextInt(playerAttack);
               int damageNum = rand.nextInt(enemyAttack);  
               enemyHealth -= hitNum;
               playerHealth -= damageNum;
               
                if(enemyHealth < 1 ){
                  System.out.println("\nYou have defeated the Infected person and stopped the Infection from spreading");
                }
                else if(playerHealth < 1){
                  System.out.println("\n SINCE YOU SUCK AND DIED, THE ENTIRE WORLD IS GOING TO BE INFECTED WITH THE VIRUS!");
                }  
          
             }
             else if(attackForm.equals("shoot infected person"))
             {
                  enemyHealth -= 55;
                  if(enemyHealth < 1 )
                  {
                   System.out.println("\nYou have defeated the Infected person and stopped the Infection from spreading");
                  }
             }
             
            else
            System.out.println("\nI don't understand your command!");              
        }   
     }
     else{
     
      if(playerHealth == 0)
      {
         System.out.println("\nYou attacked without a weapon, You got  eaten by the infected person");
      }
     System.out.println("\nYou don't have a weapon(Hint:DO NOT ATTACK WITHOUT A WEAPON)");
     playerHealth -= playerHealth;
     System.out.println("\nYour Health is now: " + playerHealth);
     }
    }
    else
    System.out.println("\nThere is either nothing to attack");
}  
   
   
   
   public static void sop(String text)
   {
      System.out.println(text);
   }
   
   public static void sopNNL(String text)
   {
      System.out.print(text);
   }
   
   public static int getItemsPerRoom()
   {
      return itemsPerRoom;
   }
}