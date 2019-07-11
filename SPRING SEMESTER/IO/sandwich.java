/**   
 * @author johnny Haizel-Cobbina
 * @version V1 - 2/25/2015
 ************************************************************/
import java.io.*;
public class sandwich implements Serializable
{
   String bread;
   String toppings;
   String cheese;
      public sandwich(String bread, String toppings, String cheese)
      {
        this.bread = bread;
        this.toppings = toppings;
        this.cheese = cheese;
      }
      public String getBread()
      {

        return bread;
      }
      public String getToppings()
      {
        
        return toppings;
      }
      public String getCheese()
      {

        return cheese;
      }
      public String toString()
      { 
        return(getBread() + "\t" + getToppings() + "\t" + getCheese()); 
      } 
  
}
