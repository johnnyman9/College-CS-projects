import java.sql.*;
//Name Johnny Haizel-Cobbina
public class DBTest
{     
   public static void main(String[] args) throws Exception
   {         
      
      String s1="jdbc:ucanaccess://";
      String user="";
      String pass="";
      String s2="Students1.accdb";
      String URL = s1+s2;
      ResultSet result;
      
      result = connectToDB(URL);
      printDB(result);
      System.out.println();
      
      addRow("Johnny", "Haizel-Cobbina", URL);
      result = connectToDB(URL);
      printDB(result);
      System.out.println();
      
     deleteRow(2,URL);
     result = connectToDB(URL);
     printDB(result);
     
     modifyRow(1,URL);
     result = connectToDB(URL);
     printDB(result);
   }
   
   public static void printDB(ResultSet result)
   {
      try
      {
         while (result.next()) 
            {
               System.out.print(result.getString(1) + " ");
               System.out.println(result.getString(2));
            }
      }catch (SQLException e) 
      {
         e.printStackTrace();
      }

   }
      
   public static ResultSet connectToDB(String URL)
   {   
      ResultSet rs = null;
      try 
      {
         Connection conn = DriverManager.getConnection(URL);
         Statement s = conn.createStatement();
         rs = s.executeQuery("SELECT FirstName, LastName FROM Students");

      }catch (SQLException e) 
      {
         e.printStackTrace();
      }
      return rs;
   } 
   public static void addRow(String fName, String lName, String URL)
   {
      try 
      {
         Connection conn = DriverManager.getConnection(URL);
         Statement s = conn.createStatement();
         s.executeUpdate("INSERT TO Students(ID, FirstName, LastName) VALUES('448855','Johnny','Haizel-Cobbina')");
      }
      catch (SQLException e) 
      {
        System.out.print("SQL Exception");
      }
     
   } 
   public static void deleteRow(int row, String URL)
   {
      try 
      {
         Connection conn = DriverManager.getConnection(URL);
         Statement s = conn.createStatement();
         s.executeUpdate("DELETE FROM Students WHERE ID=" + row);
      }
      catch (SQLException e) 
      {
         System.out.println("SQL Exception");
      }
   } 
   public static void modifyRow(int row, String URL)
   {
      try 
      {
         Connection conn = DriverManager.getConnection(URL);
         Statement s = conn.createStatement();
         s.executeUpdate("UPDATE Students SET FirstName='JOhnny' WHERE ID=" + row);
      }
      catch (SQLException e) 
      {
         System.out.println("SQL Exception");
      }
   }    
   
}