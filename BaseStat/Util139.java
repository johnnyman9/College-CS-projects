
import java.util.Random;
import java.util.Scanner;

/*********************************************************************
 * This class implements some functions needed in cs139.
 *********************************************************************/
public class Util139
{
   private Util139() {} // To indicate this class only contains functions.

   private static Random randy = null;       // The Random objected used by nextRandomInt and setRandomSeed
   private static int    progDebugLevel = 0; // The program's debug level used by "printDebug"

   /*************************************************************
    * This function sets the seed for the random
    * number generator implemented in this class.
    *************************************************************/
   public static void setRandomSeed(long seed)
   {
      Util139.randy = new Random(seed);
   }
   /*************************************************************
    * This function returns a random integer in the range 
    * 0 to <code>range</code>-1.
    * 
    * @param range Specifies the range of the random number.
    * @return      A random integer between 0 and <code>range</code>-1.
    *************************************************************/
   public static int nextRandomInt(int range)
   {
      if (Util139.randy == null)
         Util139.randy = new Random();
      return Util139.randy.nextInt(range);
   }


   /************************************************************
    * This function outputs a prompt to standard output, reads
    * the next line of input from <code>stream</code>, outputs
    * a newline character, and then returns the int value
    * on the line (any input on the line after the int value
    * is ignored).
    * @param stream A <code>Scanner</code> object input is read from
    * @param prompt The prompt string.
    * @return       The value you read
    *****************************************************************/
   public static int readInt(Scanner stream, String prompt)
   {
      int   inputVal;   // The value input

      System.out.printf(prompt);
      inputVal = stream.nextInt();
      System.out.printf("\n");
      return inputVal;
   }
   /************************************************************
    * This function outputs a prompt to standard output, reads
    * the next line of input from <code>stream</code>, outputs
    * a newline character, and then returns the double value
    * on the line (any input on the line after the double value
    * is ignored).
    * @param stream A <code>Scanner</code> object input is read from
    * @param prompt The prompt string.
    * @return       The value you read
    *****************************************************************/
   public static double readDouble(Scanner stream, String prompt)
   {
      double   inputVal;   // The value input

      System.out.printf(prompt);
      inputVal = stream.nextDouble();
      System.out.printf("\n");
      return inputVal;
   }
   /************************************************************
    * This function outputs a prompt to standard output, reads
    * the next line of input from <code>stream</code>, outputs
    * a newline character, and then returns the String value
    * on the line (any input on the line after the String value
    * is ignored).
    * @param stream A <code>Scanner</code> object input is read from
    * @param prompt The prompt string.
    * @return       The value you read
    *****************************************************************/
   public static String readString(Scanner stream, String prompt)
   {
      String   inputVal;   // The value input

      System.out.printf(prompt);
      inputVal = stream.nextLine();
      System.out.printf("\n");
      return inputVal;
   }
   /*************************************************************
    * Method purpose: this function prompts the user for a yes
    * or no input and returns true if the user responds affirmatively,
    * and return false if the user responds negatively.  A response 
    * of "yes" or "y" (case ignored) as an affirmative response, a
    * response of "no" or "n" (case ignored) as a negative response.
    * Any other response will cause the function to ask the
    * question again.
    * 
    * @param stream Input stream the input is to be read from.
    * @param prompt The prompt output before trying to read.
    * @return       A boolean indicating if the user responded affirmatively.
    *************************************************************/
   public static boolean readYesNo(Scanner stream, String prompt)
   {
      String ans;

      ans = Util139.readString(stream, prompt);
      while (!(ans.equalsIgnoreCase("yes") 
       || ans.equalsIgnoreCase("y") 
       || ans.equalsIgnoreCase("no") 
       || ans.equalsIgnoreCase("n")))
      {
         System.out.print("Please answer with \"yes\", \"y\", \"no\", \"n\".\n");
         ans = Util139.readString(stream, prompt);
      }
      return ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y");
   }

   
   /************************************************************
    * This function sets the program's debug level as used by printDebug
    * @param level Value the program's debug level gets set to
    *****************************************************************/
   public static void setProgDebugLevel(int level)
   {
      Util139.progDebugLevel = level;
   }
   /*****************************************************************
    * This function outputs a debugging message if <code>doDebug</code>
    * is true.
    * The debugging message indicates the location in the program where
    * this method was called, following by the output generated
    * from the "printf" format string and the arguments that following
    * it.  If the format string is just "\n", just the program
    * location is printed.
    * @param doDebug Boolean indicating whether or not to print the debug statements
    * @param format  The printf style format string
    * @param args    The arguments used by the format string
    *****************************************************************/
   public static void printDebug (boolean doDebug, String format, Object ... args)
   {
      if (doDebug)
      {
         System.out.printf("DEBUG[true] %s: ", 
          getProgLoc(1));
         System.out.printf(format, args);
      }
   }
   /*****************************************************************
    * This function outputs a debugging message if the program's debug
    * is greater than or equal to <code>stsmtDebugLevel</code>.
    * The debugging message indicate the location in the program where
    * this method was called, following by the output generated
    * from the "printf" format string and the arguments that following
    * it.  If the format string is just "\n", just the program
    * location is printed.
    * @param stmtDebugLevel The debugging of level of this print statement
    * @param format         The printf style format string
    * @param args           The arguments used by the format string
    *****************************************************************/
   public static void printDebug (int stmtDebugLevel, String format, Object ... args)
   {
      if (stmtDebugLevel <= progDebugLevel)
      {
         System.out.printf("DEBUG[%d,%d] %s: ", 
          stmtDebugLevel, Util139.progDebugLevel,
          getProgLoc(1));
         System.out.printf(format, args);
      }
   }
   /*****************************************************************
    * This function returns a string indicating the file, method,
    * and line number of the place <code>adjustLevel</code> method calls
    * prior to where this method was called.
    * @param levelAdjust An integer indicating how far up the stack to find the location
    * @return A string indicating the location in the program where
    *         this function was called from.
    *****************************************************************/
   public static String getProgLoc(int levelAdjust)
   {
      StackTraceElement stack[];   // Execution calling stack
      int               level;     // Stack level to return

      stack = Thread.currentThread().getStackTrace();
      level = levelAdjust + 3;
      if (level >= stack.length)
         level = stack.length - 1;
      return stack[level].toString();
   }
   /*****************************************************************
    * This function returns a string indicating the file, method,
    * and line number of where this method was called.
    * @return A string indicating the location in the program where
    *         this function was called from.
    *****************************************************************/
   public static String getProgLoc()
   {
      return getProgLoc(0);
   }
}