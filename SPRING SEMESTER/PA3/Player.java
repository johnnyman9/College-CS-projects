public class Player
{
   private String name;
   private int xPos;
   private int yPos;
   private Item inventory;
   
   public Player(String name)
   {
      this.name = name;
      xPos = 1;
      yPos = 2;   
      inventory = null;
   }
   
   public String getInventory()
   {
      String result = "";
      
      if(inventory != null)
         result = inventory.getDesc();
      return result;
   }
   
   public void recieveItem(Item item)
   {
      inventory = item;
   }
   
   public Item loseItem(String desc)
   {
      Item result = null;
      if(inventory != null)
      {
         if(inventory.getDesc().equalsIgnoreCase(desc))
         {
            result = inventory;
            inventory = null;
         }
      }   
      return result;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getXPos()
   {
      return xPos;
   }
   
   public int getYPos()
   {
      return yPos;
   }
   
   public void setYPos(int offSet)
   {
      yPos = yPos + offSet;
   }
   
   public void setXPos(int offSet)
   {
      xPos = xPos + offSet;
   }
   
}