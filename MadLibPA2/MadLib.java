/************************************************************
 * MadLibDriver - Starts the process of playing the MadLib game
 *
 * @author johnny Haizel-Cobbina
 * @version V1 - 22 October 2015
 ************************************************************/
import java.util.Scanner;
/************************************************************
 * MadLib - A MadLib game with a Halloween story
 *
 ************************************************************/
 public class MadLib
 {
 		Scanner keyboard;
	
		
	/*********************************************************
	 * MadLib is the constructor for the MadLib object.
	 * In this application, it's primary function is to 
	 * instantiate a keyboard that can be used by ALL methods
	 * in the class
	 ********************************************************/
	public MadLib()
	{  
		keyboard = new Scanner(System.in);
   }
       
         
   

 	/*********************************************************
	 * tellStory is the controlling method to produce the story
	 * It will call other MadLib methods to carry out the actions.
	 *********************************************************/
 	public void tellStory()
	{
      String name;
      String gender;
      String color;
      String animal;
      String time;
      String sound;
      String verb;
      String action;
      int age;
      String year;   
      char result1;
      int number;
	   
		//input
      System.out.print("Welcome to the CSCI-105 Mad Lib game\n");
      
      System.out.print("                   ");
           
      System.out.print("\nEnter a person's name: ");
      name = keyboard.nextLine();
      
      System.out.print("Enter the person's gender: ");
      gender = keyboard.nextLine(); 
      String g = heShe(gender);
      
      
       System.out.print("Enter a whole number between 1 and 13: ");
       if(keyboard.hasNextInt())
       {
       age = keyboard.nextInt();
       keyboard.nextLine();
       }
       else
       {
         age = 1;
         keyboard.nextLine();
        }      
      System.out.print("Enter your favorite color: ");
      color = keyboard.nextLine();
      
      System.out.print("Enter an unusual animal: ");
      animal = keyboard.nextLine();
      
      System.out.print("Enter a time: ");
      time = keyboard.nextLine();
      
      System.out.print("Enter a sound: ");
      sound = keyboard.nextLine();
      
      System.out.print("Enter a past tense action verb: ");
      action = keyboard.nextLine(); 
      
      int end = num(age);
      //output
      
      System.out.printf("%s's Weird Halloween Adventure!\n", name);
      System.out.println("          ");
      System.out.printf("%s was a %s of %d" + " %s.\n",
          heShe(gender),girlBoy(gender),num(age),year(end)); 
      System.out.printf("%s decided to go trick or treating dressed as %s" + 
          " %s %s. \n" ,heShe(gender),aAn(color),color,creature(animal));   
      System.out.printf("At %s, %s heard a loud %s behind %s \n", time, name, sound, himHer(gender));
      System.out.printf("%s turned and saw %s real " +
          " %s following %s.\n", heShe(gender),word(age),plural(animal,end),himHer(gender));
      System.out.printf("%s was so scared that %s %s" + 
         " all the way home. \n " ,name, heShe(gender),action(action));
	
	} //END tellStroy

   /******************************************************
	 * Sets user input equal to boy or girl
	 * @param args String gender
    * @return gender
	 ******************************************************/  
   public String girlBoy(String gender)
   {
      char result1;
      result1 = gender.charAt(0);
       
     if(result1 == 'M'|| result1 == 'm')
     {
        gender = "Boy";
     }
     
     else if(result1 == 'F'|| result1 == 'f')
     {
       gender = "Girl";
         
     } 
     else
        gender = "girl"; 
     return gender;
   }
    /******************************************************
	 * Sets user input equal to he or She
	 * @param args String gender
    * @return gender
	 ******************************************************/
   public String heShe(String gender)
   {
      char result1;
      
      result1 = gender.charAt(0);
      if(result1 == 'M'|| result1 == 'm')
      {
        gender = "He"; 
      }
      else if(result1 == 'F' || result1 == 'f')
      {
       gender = "She";  
      }
      else
        gender = "She";
            
      return gender;
    }
  /******************************************************
	 * Sets user input equal to him or her
	 * @param args String gender
    * @return gender
	 ******************************************************/
  public String himHer(String gender)
   {
      char result1;
      result1 = gender.charAt(0);
      if(result1 == 'M'|| result1 == 'm') // if result1 is m then this will set gender equal to him or her
      {
        gender = "Him"; 
      }
      else if(result1 == 'F' || result1 == 'f')
      {
       gender = "Her";  
      }
      else
         gender = "Her";
      return gender;
    }
   /******************************************************
	 * Sets user input equal to 1 if the input is less that 1 or greater than 13
	 *
	 * @param args int age
    * @return age
	 ******************************************************/
   public int num(int age)
   {   
      String word = String.valueOf(age);// changes age from an int to a string and sets it equal to word
       
       if(age < 1 || age > 13)
       {  
            age = 1;
       }  
    
    return age;       
   }
  
   /******************************************************
	 * Sets user input equal to 1 if the input is less that 1 or greater than 13
	   takes the user inputs if in the range of 1-13 
    * and coverts it to the word of the number
	 * @param args int age
    * @return word
	 ******************************************************/
   public String word(int age)
   {     
      String word = String.valueOf(age); // changes age from an int to a string and sets it equal to word
      if(age < 1 || age > 13)
       {  
            age = 1;
       }  
      if(age == 1)
         word = "one";
      if(age == 2)
         word = "two";
      if(age == 3)
         word = "three";
      if(age == 4)
         word = "four";
      if(age == 5)
         word = "five";
      if(age == 6)
         word = "six";
      if(age == 7)
         word = "seven";
      if(age == 8)
         word = "eight";
      if(age == 9)
         word = "nine";
      if(age == 10)
         word = "ten";
      if(age == 11)
        word = "eleven";
      if(age == 12)
        word = "twelve";
      if(age == 13)
        word = "thirteen";
    
    return word;    
   }
  /******************************************************
	 * if age 1, this will initialize year as year  
      and if age greater than 1 this will initialize year as years  
	 * @param args int age
    * @return year
	 ******************************************************/
   public String year(int age)
   {
      String year;  
        if(age == 1)
       {
         year = "year";
       }
       else
       {
         year = "years";
       }
       
       return year;
   }
    /******************************************************
	 *  initializes string color as color 
	 * @param args String color
    * @return color
	 ******************************************************/ 
      public String getColor(String color)
   {
   
      return color;   
   }
   /******************************************************
	 *  Takes the first letter of color and depending on whether it was vowel
       or consonant it would us An or A  
	 * @param args String color
    * @return aAn
	 ******************************************************/ 
   public String aAn(String color)
   {
      String aAn = color.toUpperCase();  
     
     if(aAn.charAt(0) == 'O' || aAn.charAt(0) == 'A'||
          aAn.charAt(0) == 'I' ||aAn.charAt(0) == 'E' ||aAn.charAt(0) == 'U')
        {
            aAn = "an";
        }
      else 
         {
            aAn = "a";  
         }    
      return aAn;
   }
   /******************************************************
	 * method for creature with param animal inside creature
	 * @param args String animal
    * @return animal
	 ******************************************************/ 
   public String creature(String animal)
   {
      return animal;
   }
   /******************************************************
	 * method for clock with param time inside clock
	 * @param args String time
    * @return time
	 ******************************************************/ 
   public String clock(String time)
   {  
      
      return time;
        
   }
  /******************************************************
	 * method for noise with param sound inside noise
	 * @param args String sound
    * @return sound
	 ******************************************************/ 
   public String noise(String sound)
   {
      return sound; 
   }
   /******************************************************
	 * For this method, it takes in animal and age  and if age is in the range of 1-13,
      it will either put s,es,ies or leave the word as is
	 * @param args String animal, int age 
    * @return plural
	 ******************************************************/ 
   public String plural(String animal, int age)
   {  
      
      String plural = animal;
    
     if(age > 1 && age <= 13)
      {        
         if(plural.endsWith("s"))
         {
            plural = plural + "es";
         }
          else if(plural.endsWith("ey"))
         {  
            plural = plural +  "s";
         }  
          
         else if(plural.endsWith("y"))
         {            
           plural = plural.substring(0, plural.length() - 1) + "ies";//it will get rid of the y and put ies
                                                                         
         }       
         else
         {
            plural = plural + "s";
         }                
      }
     
         
          return plural; 
    } 
 /******************************************************
	 * method for action with param verb inside verb
	 * @param args String verb
    * @return verb
	 ******************************************************/  
   public String action(String verb)
   {   
      return verb; 
   }
 } //END Class MadLib 
  
  
   
