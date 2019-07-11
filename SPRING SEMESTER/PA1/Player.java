/***********************************************************
This is a Pkayer class for the Adventure game
a Player has a name and an X and Y position
Write a constructor, and appropriate methods

@version .01 - Johnny Haizel-Cobbina (<- put your name here)

************************************************************/
import java.io.*;
public class Player implements Serializable
{
   private String name;
   private int xPos;
   private int yPos;
   item[] playerInventory = new item[3];
   
   public Player(String name, int xPos, int yPos)
   {
      this.name = name;
      this.xPos = xPos;
      this.yPos = yPos;

   }
   public String getName()
   {
      return name;
   }
   public int getxPos()
   {
      return xPos;
   }
   public int getyPos()
   {
      return yPos;
   }
   public void moveEast()
   {
      xPos++;
   }
   public void moveSouth()
   {
      yPos++;
   }
   public void moveWest()
   {
      xPos--;
   }
   public void moveNorth()
   {
      yPos--;
   }
   public void setItem(int x, item inventory)
   {
	   playerInventory[x] = inventory;
   }
	   
	public item getItem(int x)
	{
     return playerInventory[x];

	}
	   
   public String getItemName(int x)
   {

	  return playerInventory[x].getName();
    
   }
}