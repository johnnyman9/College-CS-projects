import java.util.Scanner; 
//Johnny Haizel-cobbina
public class Piglatin
{
    public static void main(String[] args) 
    {   
      String sentence = " ";
      String latin = " "; 
      
    Scanner kb = new Scanner(System.in); 
    System.out.print("Enter sentence: ");
    sentence = kb.nextLine();

    PigLatin(sentence, latin); 

}

public static void PigLatin(String sentence, String latin) 
{   
   String[] words;
   String[] arr;
    
    words = sentence.split(" ");
    arr = new String[words.length];       

// Convert English sentence into Pig Latin 
    for (int i = 0; i < words.length; i++)
    {
       String str = words[i];
        String str1 = str.substring(0, 1);//First letter 
        String str2 = str.substring(1, str.length());//last letter 
        str2 = str2.concat(str1);//adds the first letter 
        str2 = str2.concat("ay");//add ay to that
        arr[i] = str2;  
        latin = latin.concat(str2 + " ");//do the same with every word after the space 
       
    }

    // Display pig latin verison
    System.out.println("\nNew sentence:" + latin.toLowerCase()); 
    }

}