   /**********************************************************************
 * Class purpose: Teaches how to better use arrays
 * 
 * @author  Johnny Haizel-Cobbina
 * @version 10/28/15
 *******************************************************/
public class arrayPlay
{
   public static void main(String[] args)
   {   
      final int arraySize = 6; 
      int[] numbers = new int[arraySize]; 
    
    for (int i = 0; i <= 5; i++)
      {
         numbers[i] = -1;
        
         System.out.println(numbers[i]);
      }  
     
     for(int i = 0; i<=5; i++)
     {
        numbers[i] = i;
        System.out.println(numbers[i]);
     }
     for(int i = 0; i<=5; i++)
     {
        numbers[i] =0;
        System.out.println(numbers[i]);
     }
     

      Die fun = new Die();
     
     for(int i = 0; i<=99; i++)
     {
      
         fun.roll();     
         int face = fun.getFace();
    
      if(face == 1)
      {
         numbers[0] = numbers[0] + 1;
      }
      
       
       else if(face == 2)
       {
         numbers[1] = numbers[1] + 1;
       }
    
      else if(face == 3)
      {
        numbers[2] = numbers[2] + 1;
      }
    
      else if(face == 4)
      {
         numbers[3] = numbers[3] + 1 ;
      }
    
      else if(face == 5)
      {
         numbers[4] = numbers[4] + 1;
      }
    
      else if(face == 6)
       {
         numbers[5] = numbers[5] + 1 ;
       }
        
    
   }     
         System.out.println("1 was rolled" + numbers[0] + " times");
         System.out.println("2 was rolled " + numbers[1] + " times");
         System.out.println("3 was rolled " + numbers[2] + " times");
         System.out.println("4 was rolled " + numbers[3] + " times");
         System.out.println("5 was rolled " + numbers[4] + " times");
         System.out.println("6 was rolled " + numbers[5] + " times");  
  
      
      double[] number = {10,4,12,3,13,22,21,18,20,15};
      double[] digits = new double[10];
      
      System.out.println("Before: ");
      for(int i = 0; i <= 9; i++)
      {
         System.out.println(number[i]+ " , " + digits[i]); 
      }
         
      System.out.println("After: ");
      
      for(int i = 0; i < number.length;i++)        
      {
         digits[i] = number[i];
        System.out.println(number[i]+ " , " + digits[i]);
        
      }
      
  
  
   }  
 }    
     
  
   
   
   