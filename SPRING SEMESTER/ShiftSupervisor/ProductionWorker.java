/*******************************************************************
 * Practicing inheritance
 *
 * Version - 0.01 February 11 2016 @Johnny Haizel-Cobbina
 ******************************************************************/
public class ProductionWorker extends employee //this is correct - need this
{
     private int shift;
     private double payRate;
   
   public ProductionWorker(String name, String number, String hireDate, int shift, double rate)
   {
       super(name, number, hireDate);
       this.shift = shift;
       this.payRate = rate;
   }
   public int getShift() 
   {
    return shift;
   }

    public double getPayRate() 
   {
      return payRate;
   }
    public void setPayRate(double newPayRate) 
   {
     this.payRate = newPayRate;
   }
   public String toString()
   {
     String str = super.toString();
      str += "\tEmployee Shift: " + shift +
           "\tEmployee Hourly Pay Rate: " + payRate;
    return str;
   }
}

