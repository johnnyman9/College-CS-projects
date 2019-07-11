/*******************************************************************
 * Practicing inheritance
 *
 * Version - 0.01 February 11 2016 @Johnny Haizel-Cobbina
 ******************************************************************/

public class employee
{
   private String name;
   private String number;
   private String hireDate;
   private boolean validNumber = false;
  
   public employee(String name, String number, String hireDate)
   {
      this.name = getName(name);
      this.number = getNumber(number);
      this.hireDate = getHireDate(hireDate);
   }
   public String getName(String name)
   {
      if(name.length() <= 2)
      {
         name = "NAME";
      }      
      return name;
   }
   public String getNumber(String number)
   {

         if(number.length()!= 5)
          {
            number = "000-Z";
          }
          
          else if((!Character.isDigit(number.charAt(0)))||(!Character.isDigit(number.charAt(1)))||(!Character.isDigit(number.charAt(2)))||(number.charAt(3) != '-')||(!Character.isLetter(number.charAt(4)))||(!(number.charAt(4)>= 'A' && number.charAt(4)<= 'M')))         
            {
               number = "000-Z";
            }
         else
         {
          validNumber = true;
         }
         
      return number;
   
   }
   public String getHireDate(String hireDate)
   {  
      return hireDate;
   }
    public String toString()
    {
     return ("\nName: " + name + "\t number: " + number + "\t\t hireDate: " + hireDate);

    }
    public void display()
    {
        System.out.print(toString());
    }
}