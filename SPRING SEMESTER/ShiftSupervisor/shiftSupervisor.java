public class shiftSupervisor extends employee
{
   private double annualSalary;
   private double annualBonus;
 
 public shiftSupervisor(String name, String number,String hireDate,double salary,double bonus)
 {
   super(name,number,hireDate);
   this.annualSalary = salary;
   this.annualBonus = bonus;
   
 }
 public double getAnnualSalary(double salary)
 {
   return annualSalary;
 }
 public void setAnnualSalary(double newSalary)
 {
    this.annualSalary = newSalary;
 }
 public double getAnnualBonus(double bonus)
 {
   return annualBonus;
 }
  public void setAnnualBonus(double newBonus) 
  {
    this.annualBonus = newBonus;
  }
  public String toString()
   {
     String str = super.toString();
      str += "\tAnnual Salary: " + annualSalary +
           "\tAnnual Bonus: " + annualBonus;
    return str;
   }

   
}