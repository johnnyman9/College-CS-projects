/**********************************************************************
 * Class purpose: Allows me to create and test a class for Cars
 * 
 * @author  Johnny Haizel-Cobbina
 * @version 10/20/15
 *******************************************/
public class CarDriver 
{ 
   public static void main(String[] args) 
      { 
          Car jag = new Car("Jaguar", "XJ-6", 1985, 123456789); 
          jag.display();
          
          Car lambo = new Car("Lamborghini", "Murcielago LP 670 Super Veloce",  2008, 834657164); 
          lambo.display();
      
          Car  LaFerrari = new Car("Ferrari", "LaFerrari", 2008, 76315543);
          LaFerrari.display();
          
          Car Chrysler = new Car("Chrysler", "Town & Country", 2016, 8776335);
          Chrysler.setMake("Chrysler Mom van!");
          Chrysler.display();
      
      } 
}