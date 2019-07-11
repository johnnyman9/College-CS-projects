import java.io.*;
/***********************************************************
This is a Room class for the Adventure game
a Room has a description only at this point
Write a constructor, and appropriate methods

@version .01 - Johnny Haizel-Cobbina(<- put your name here)

************************************************************/
public class Room implements Serializable
{
   private String desc;
   private String objects;
   item[] inventory = new item[3];
   /******************************************************
	 * 
	 * @param args String desc
    * @return 
	 ******************************************************/  
   public Room(String desc, String objects)
   {
      this.desc = desc;
      this.objects = objects;
      
   }
   /******************************************************
	 * This is a print 
	 * @param args String text
    * @return gender
	 ******************************************************/  
   public String getDesc()
   {
      return desc;
   }
   public void setObject(int x, String objects)
	
	{
		inventory[x] = new item(objects);
	}
  
   public item dropItem(int x)
	{
    	   return inventory[x];
	}

	
	public String getObject(int x)
	{

    return inventory[x].getName();
	}	
 
   public item getAdd(int x)
	{
		return inventory[x];
	}
  public void dropObject(int emptyIndex, Object setItem)
	{
		
		
	}
 }