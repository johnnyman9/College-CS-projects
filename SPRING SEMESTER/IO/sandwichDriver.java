import java.io.*;
public class sandwichDriver 
{ 
   public static void main(String[] args) 
      { 
         sandwich american = new sandwich("Italian", "tomatoes,onions,lettuce", "No cheese");
          try
          {
             FileOutputStream fstream = new FileOutputStream("sandwich.dat");
             ObjectOutputStream output = new ObjectOutputStream(fstream);
             output.writeObject(american); 
          } 
          catch(IOException e)
          {
            System.out.print("There is an IO Expection here");
          }
          try
          {
            FileInputStream fstream = new FileInputStream("sandwich.dat");
            ObjectInputStream input = new ObjectInputStream(fstream);
            Object sandwich2 = input.readObject();
            System.out.print(sandwich2);
          }
           catch(IOException e)
          {
            System.out.print("There is an IO Expection here");
          }
          catch(ClassNotFoundException e)
          {
               System.out.print("Error");
          }
          
 }       

}