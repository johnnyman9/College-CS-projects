import java.util.Scanner;
import java.io.*;
public class item implements Serializable
{
  private String itemDesc;
   
   public item(String item)
   {
      itemDesc = item;
   }
   public String getName()
   {
      return itemDesc;
   }
}