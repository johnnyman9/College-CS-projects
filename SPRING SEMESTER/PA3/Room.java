public class Room
{
   private String desc;
   private Item[] roomItems;
   
   public Room(String desc)
   { 
      this.desc = desc;
      roomItems = new Item[3];
   }
   
   public int getItemCount()
   {
      int result = -1;
      boolean status = true;
      for(int pos = 0; pos < roomItems.length && status; pos++)
      {
         if(roomItems[pos] == null)
         {
            result = pos;
            status = false;
         }
      }
      return result;
   }
   
   public String getDesc()
   {
      return desc;
   }
   
   public Item getItem(String desc) // removes it from the room
   {
      Item result = null;
      
      for(int position = 0; position < roomItems.length && roomItems[position] != null; position++)
      {
         if(roomItems[position].getDesc().equalsIgnoreCase(desc))
         {
            result = roomItems[position];
            roomItems[position] = null;
            organizeItems(); 
         }
      }
      return result;
   }
   
   public void organizeItems()
   {
     
   }
   
   public String listItems()
   {
      String result = "";
      
      for(int loop = 0; loop < Adventure.getItemsPerRoom(); loop++)
      {
         if(!(roomItems[loop] == null))
            result = result + roomItems[loop].getDesc() + " ";
      }
      return result;
   }
   
   public boolean addItem(Item item) // adds item to room
   {
      boolean status = false;
      for(int pos = 0; pos < roomItems.length && !status; pos++)
      {
         if(roomItems[pos] == null)
         {
            roomItems[pos] = item;
            status = true;
         }
      }
      return status;
   }
   
   public boolean deleteItem(Item item)
   {
      boolean status = false;
      for(int pos = 0; pos < roomItems.length && !status; pos++)
      {
         if(roomItems[pos] == item)
         {
            roomItems[pos] = null;
            status = true;
         }
      }
      return status;
   }
}