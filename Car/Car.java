   /**********************************************************************
 * Class purpose: Allows me to create and test a class for Cars
 * 
 * @author  Johnny Haizel-Cobbina
 * @version 10/20/15
 *******************************************/
   public class Car 
   { 
         private String make;
         private String model;
         private int year;
         private int vin;
         
   
      public Car(String make, String model, int year, int vin) 
      {
         
      
         this.make = make; 
         this.model = model; 
         this.year = year; 
         this.vin = vin; 
      } 
         
       public String getMake()
       {
         return make;
       } 
       public String getModel()
       {
         return model;
       }  
       public int getYear()
       {
         return year;
       }
       public int getVin()
       {
         return vin;
       }
        
       public void setMake(String j)
       {
         make = ("Johnny's " + j);
         
       }  
         public void display() 
         { 
            System.out.println(getMake() + "\t" + getModel() + "\t" + getYear() + "\t" + getVin()); 
         } 
         
    }