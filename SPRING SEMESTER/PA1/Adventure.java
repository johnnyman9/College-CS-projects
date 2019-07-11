/***********************************************************
This is a Adventure class for the Adventure game
a Room has a description only at this point
The constructor is written for you.
You may not have to change it... write appropriate methods
Some have been stubbed out for you.

@version .01 - Johnny Haizel-Cobbina (<- put your name here)

************************************************************/
//Need to implement serializable now.
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
import java.util.Random;

public class Adventure
{
   private final static int numCols = 3;
   private final static int numRows = 3;
   private final static int maxCol = numCols - 1;
   private final static int maxRow = numRows - 1;
   Scanner kb;
   int num;
   String dropNumber;
   String command;
   String direction;
   Player player;
   private Room[][] rooms;
   boolean notWin = true;
   private final boolean DEBUG = true;
   public static int emptyIndex;
	public static int emptyIndex1;
   public static int itemNumber = 0;
   private static int invNumber = 0;
   private final static int roomItems = 3;
	private final static int playerItems = 3;
  
   
   public Adventure()
   {
      kb = new Scanner(System.in);//
      initGame();//calls the initGame method
      initPlayer();//calls the Player method
      playGame();//Calls the playGame method
      
   }
   
   public void playGame()
   {
      
      while(notWin)//While not win is true, this will keep running
      {
         
       //allow move
      //Prints out the room they are in as well as the decription
      System.out.print(rooms[player.getxPos()][player.getyPos()].getDesc() + "\n");
    
      System.out.print("Possible moves: ");
      //This will check for the possible moves based on where the player is
      if(player.getyPos() + 1 < numRows)
      {
         System.out.print(" South ");
      }
      if(player.getxPos() + 1 < numCols)
      {
         System.out.print(" East");
      }
      if(player.getyPos() - 1 >= 0)
      {
         System.out.print(" North ");
      }
      if(player.getxPos() - 1 >= 0)
      {
         System.out.print(" West  ");
      }
       for(int x = 0; x < playerItems; x++)
    	  {
    	    if(player.getItem(x) != null)
          {
    	          System.out.print("\nInventory: ");
                System.out.print(player.getItemName(x));
          }
    	  }      
      
      System.out.print("\nYou see: ");
    //to look through the objects in the room  
           if (player.getxPos() == 0 && player.getyPos() == 0)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[0][0].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 0 && player.getyPos() == 1)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[0][1].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 0 && player.getyPos() == 2)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[0][2].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 1 && player.getyPos() == 0)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[1][0].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 1 && player.getyPos() == 1)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[1][1].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 1 && player.getyPos() == 2)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[1][2].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 2 && player.getyPos() == 0)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[2][0].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 2 && player.getyPos()== 1)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[2][1].getObject(i));
	             }
	         }
	         
	         if (player.getxPos() == 2 && player.getyPos() == 2)
	         {
	        	 for (int i = 0; i <= 2; i ++)
	        	 {
	        		 System.out.println("\n" + (i+1) + ": " + rooms[2][2].getObject(i));
	          }
	         }

      System.out.print("\n" + player.getName() + ", " + 
      "What would you like to do next." +
      " Enter GET ITEM to select an item and Enter DROP ITEM to select an item to drop." +
      " Type exit to quit: "); 
      
            
      command(kb.nextLine());
  

                  
         //continue until player quits
        
         //check win condidtion           
      }
   }
   
   /******************************************************
    * the method parses command and calls methods that carry out the command
    * i.e. Move North, will call the move method with North as the argumant.  
    * the move method will check to see if the move is leagal, then move the players xPos and yPos
	 * Sets user input equal to boy or girl
	 * @param args String command
    * @return result
	 ******************************************************/  
   public boolean command(String command)
   {
      boolean result = true;
     String[] parts = command.split(" "); 
     if(command.contains("Move")||command.contains("move"))
     {
        move(parts[1]);
     }
     else if(command.contains("get") || command.contains("pick up"))
     {
         pickUp(parts[1]);   
     }
     else if(command.contains("drop") || command.contains("Drop"))
     {
         dropItem(parts[1]);
     }
     else if(command.contains("save")||command.contains("Save"))
	  {
        saveRoom();
     }
     
    else if(command.contains("load"))
	 {
	   load();
    }
    else if(command.contains("attack") || command.contains("Attack"))
    {
       if(rooms[player.getxPos()][player.getyPos()].getObject(0).equals("OH NO, THERE IS AN Infected person ATTACKING")||rooms[player.getxPos()][player.getyPos()].getObject(1).equals("OH NO, THERE IS AN Infected person ATTACKING")||rooms[player.getxPos()][player.getyPos()].getObject(2).equals("OH NO, THERE IS AN Infected person ATTACKING"))
       {
            attack();
       }
       else
       System.out.println("\nThere is nothing to attack");   
    }
     else
      System.out.print("I dont understand your command. " +
       "What would you like to do next. Type exit to quit:\n ");
      result = false;     
      return result;
         
   }
   

   /******************************************************
	 * this method will do error checking for moves within the 2D array, 
    * and adjust a players xPos and yPos
	 * @param args String Direction
    * @return 
	 ******************************************************/  
   public void move(String direction)
   {  
              
         if(direction.equals("North") || direction.equals("north"))
         {
            if(player.getyPos() == 0)//at 0, there is no place to more north
            {
               System.out.print("Try again, you cant move there\n");
            }
            else
            {
               player.moveNorth();
            }
       
         }
         else if(direction.equals("South") || direction.equals("south"))
         {
            if(player.getyPos() == maxRow)//at maxRow, which is 3, there is no souuth option
            {
               System.out.print("Try again, you cant move there\n");
            }
            else
            {
               player.moveSouth();
            }
       
         }
         else if(direction.equals("West") || direction.equals("west"))
         {
            if(player.getxPos() == 0)// when the x value is 0, there is no west option
            {
               System.out.print("Try again, you cant move there\n");
            }
            else
            {
               player.moveWest();
            }
       
         }
        else if(direction.equals("East") || direction.equals("east"))
         {
            if(player.getxPos() == maxCol)//When the player position is at maxCol, there is no east option
            {
               System.out.print("Try again, you cant move there\n");
            }
            else
            {
               player.moveEast();
            }
       
         }

             
   }
   
  /******************************************************
	 *Ask the player their name and create the player object...
    * @param args 
    * @return 
	 ******************************************************/  
   public void initPlayer()
   {  
       //ASK USER FOR NAME
      System.out.print("Enter name: ");
      String name = kb.nextLine();

      //ASK USER FOR NAME
     player = new Player(name,0,0);// This is where the player starting point is located
      System.out.print("");
   }
   
    
   /******************************************************
	 * create the array and all the rooms in the array. 
    * This instantiates the rooms of the 2D array 
	 * @param args
    * @return 
	 ******************************************************/  
   public void initGame()
   {     
      rooms = new Room[numRows][numCols];     

      rooms[0][0] = new Room("(Foyer of a small cabin) "+ "You are standing in the foyer of a small cabin\n", "");
      rooms[0][0].setObject(0," ");
      rooms[0][0].setObject(1,"knife");//This empty but usable for later expantion
      rooms[0][0].setObject(2,"Shotgun");//This empty but usable for later expantion
   
      rooms[0][1] = new Room("(Dinning room) "+ "You are standing in a huge dining room.\n","");
      rooms[0][1].setObject(0,"knife");//This empty but usable for later expantion
      rooms[0][1].setObject(1,"knife");
      rooms[0][1].setObject(2,"knife");
      
      rooms[0][2] = new Room("(Bathroom) " + "You are standing in the bathroom.  You see a mirror.\n","");
      rooms[0][2].setObject(0," ");
      rooms[0][2].setObject(1,"OH NO, THERE IS AN Infected person ATTACKING");
      rooms[0][2].setObject(2," ");//This empty but usable for later expantion
      
      rooms[1][0] = new Room("(Bigger Dinning room) " + "You are standing in a huge dining room.\n","");
      rooms[1][0].setObject(0,"knife");//This empty but usable for later expantion
      rooms[1][0].setObject(1,"knife");
      rooms[1][0].setObject(2,"knife");
      
      rooms[1][1] = new Room("(Long hallway) " + "You are in a long hallway.\n","");
      rooms[1][1].setObject(0,"Oil Lamp");
      rooms[1][1].setObject(1,"knife");
      rooms[1][1].setObject(2,"knife");
      
      rooms[1][2] = new Room("(Kitchen)" + "You are standing in the Kitchen\n","");
      rooms[1][2].setObject(0,"knife");//This empty but usable for later expantion
      rooms[1][2].setObject(1,"knife");
      rooms[1][2].setObject(2,"knife");
      
      rooms[2][0] = new Room("(Living room) " + 
      "You are standing in the living room, next to the fireplace.\n","");
      rooms[2][0].setObject(0,"Book");//This empty but usable for later expantion
      rooms[2][0].setObject(1,"knife");
      rooms[2][0].setObject(2,"knife");
      
      rooms[2][1] = new Room("(Other side of Living room)"+ 
     "You are standing in the living room.  You see a couch and a fireplace.\n","");
      rooms[2][1].setObject(0,"knife");//This empty but usable for later expantion
      rooms[2][1].setObject(1,"knife");
      rooms[2][1].setObject(2,"knife");
      
      rooms[2][2] = new Room("(Breakfast Nook) "+
      "This is a breakfast nook.  You see a small table with chairs.\n","" );
      rooms[2][2].setObject(0,"knife");//This empty but usable for later expantion
      rooms[2][2].setObject(1,"knife");
      rooms[2][2].setObject(2,"Key");    
   }
   /******************************************************
	 * This is my drop item class, this allows the user to access inventory
      and if the room is empty, the user will be able to drop any of their
      inventory items.
	 * @param String dropNumber
    * @return 
	 ******************************************************/
  public void dropItem(String dropNumber)
  {
    if(rooms[player.getxPos()][player.getyPos()].getObject(0) == null || 
    rooms[player.getxPos()][player.getyPos()].getObject(1) == null || 
    rooms[player.getxPos()][player.getyPos()].getObject(2) == null )
     {
          for(int x = 0; x < playerItems; x++)
    	    {
    	      if(player.getItem(x) != null)
            {
    	         System.out.println("" + (x+1) + ":" + player.getItemName(x));
            }
    	    }
               System.out.print("Select the number of the item you wish to drop: " + 
               "if none, enter 4: ");
               dropNumber = kb.nextLine();
         for(int x = playerItems-1; x >= 0; x--)
    	   {
    	         if(rooms[player.getxPos()][player.getyPos()].getObject(x) == null)
    	         {
    	            emptyIndex1 = x;
    	         }
    	   }
               if (dropNumber.equals("1"))
        		   {
           			 rooms[player.getxPos()][player.getyPos()].setObject(emptyIndex1, player.getItemName(0));
           			 player.setItem(0, player.getItem(1));
           			 player.setItem(1, player.getItem(2));
           			 player.setItem(2, null);
           			 invNumber--;//decriments when they pick the item they want to drop
        		   }
          
               if(dropNumber.equals("2"))
        		   {
        			 rooms[player.getxPos()][player.getyPos()].setObject(emptyIndex1, player.getItemName(1));
        			 player.setItem(1, player.getItem(2));
        			 player.setItem(2,null);
        			 invNumber--;
        		 }     		 
        		 if (dropNumber.equals("3"))
        		 {
        			 rooms[player.getxPos()][player.getyPos()].setObject(emptyIndex1, player.getItemName(2));
        			 player.setItem(2, null);
        			 invNumber--;
        		 } 		     
    }
 }
    /******************************************************
	 * This is pickUp my pick up method. Once the user enters "get item",
      if there are items this will allow the user to pick them up and put them 
      into the inventory
    *
	 * @param String pickUp
    * @return 
	 ******************************************************/
  public void pickUp(String pickUp)
  {
     System.out.println("Enter the number of the item you want to pick up:  "
      + "Enter 4 to continue");
	  pickUp = kb.nextLine();
	         
	  for(int x = playerItems-1; x >= 0; x--)
	  {
	        	 if (player.getItem(x) == null)
	        	 {
	        		 emptyIndex = x;	 
	        	 }
	  }
    
     if(pickUp.equals("1"))
	  {	        	 
	    if(itemNumber < 3)
	     {
	       System.out.println("You picked up a: " +
           rooms[player.getxPos()][player.getyPos()].getObject(0));
	  		 itemNumber++;
	       player.setItem(emptyIndex, rooms[player.getxPos()][player.getyPos()].getAdd(0));
	       rooms[player.getxPos()][player.getyPos()].setObject(0,null);
	       System.out.println(player.getName() + "'s inventory ");
	     }
	    else
	     {
	       System.out.println("Can't add more items...");
	  		 System.out.println(player.getName() + "'s inventory ");
	     }
	 }
    if(pickUp.equals("2"))
	 {        	 
	   if (itemNumber < 3)//Make sure this is less than 3
	   {
	     System.out.println("You picked up a: " + 
        rooms[player.getxPos()][player.getyPos()].getObject(1));
	     itemNumber++;
	     player.setItem(emptyIndex, rooms[player.getxPos()][player.getyPos()].getAdd(1));
	     rooms[player.getxPos()][player.getyPos()].setObject(1, null);
   	  System.out.println(player.getName() + "'s inventory");
	   }
	   else
	   {
	    System.out.println("Can't add more items...");
	    System.out.println(player.getName() + "'s inventory");
	   }
	 }
    if(pickUp.equals("3"))
	 {
      if(itemNumber < 3)
	    {
	      System.out.println("You picked up a: " + 
         rooms[player.getxPos()][player.getyPos()].getObject(2));
	      itemNumber++;//so the user can't carry more than 3
	      player.setItem(emptyIndex, rooms[player.getxPos()][player.getyPos()].getAdd(2));
	      System.out.println(player.getName() + "'s inventory ");
	      rooms[player.getxPos()][player.getyPos()].setObject(2, null);
	    }
	    else
	    {
	      System.out.println("Can't add more items...");
	      System.out.println(player.getName() + "'s inventory ");
	    }
	 }
    if(pickUp.equals("4"))//To Continue
	 {
	   System.out.println("No item Selected.");
	 }
	 for(int x = 0; x < playerItems; x++)
	 {
	   if(player.getItem(x)!= null)//if it is not empty
      {
	     System.out.println((x + 1) + ": " + player.getItemName(x));
	   }
    }
 }
public void attack()
{  
   Random rand = new Random();
   String enemy = "OH NO, THERE IS AN Infected person ATTACKING";
   int enemyHealth = 100;
   int enemyAttack = 25;
   
   int playerHealth = 150;
   int playerAttack =25 ;
   
   int health = rand.nextInt(enemyHealth);
   
   while(enemyHealth > 0)
   {
     System.out.println("\nPlayer Health: " + playerHealth);
     System.out.println("\nThis infected person has: " + enemyHealth); 
     System.out.println("\nWhat do you want to do?");
     String attackForm = kb.nextLine();
      if(attackForm.equals("1"))
      { 
         int hitNum = rand.nextInt(playerAttack);
         int damageNum = rand.nextInt(enemyAttack);  
         enemyHealth -= hitNum;
         playerHealth -= damageNum;
      }
     if(playerHealth < 1)
     {
         System.out.println("\nYou are clearly too weak");
         notWin = false;
     }
     if(enemyHealth < 1)
     {
        System.out.println("\nYou have defeated the Infected person and stopped the Infection from spreading"); 
        notWin = false;    
     }
    
   }   
}  
   
   
public void saveRoom()
{

    System.out.println("YOUR GAME HAS BEEN SAVED");
  try      
  {
    FileOutputStream gameFile = new FileOutputStream("savingGame.ser");
    ObjectOutputStream out = new ObjectOutputStream(gameFile);
    out.writeObject(player);
    out.writeObject(rooms);
    gameFile.close();
  }
  catch(IOException e)
  {
     e.printStackTrace();
  }
}
public void load()
{
    System.out.println("YOUR GAME HAS BEEN LOADED\n");

	try
	{
	   FileInputStream gameFile = new FileInputStream("savingGame.ser");
	   ObjectInputStream in = new ObjectInputStream(gameFile);
	   player = (Player)in.readObject();
      rooms = (Room[][])in.readObject();
	   in.close();
	   gameFile.close();
	}
	catch(IOException iOError)
	{
	  iOError.printStackTrace();
	}
	catch(ClassNotFoundException classNotFound)
	{
	  System.out.println("The Player class not found\n");
	  classNotFound.printStackTrace();
	}
}         
 
}