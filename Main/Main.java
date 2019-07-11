import java.util.Scanner;

public class Main
{
   /*************************************************************
    * This function inputs player statistical information and
    * output key player performance measures.
    *************************************************************/
   public static void main (String args[])
   {
      final int SINGLE = 1;
      final int DOUBLE = 2;
      final int TRIPLE = 3;
      final int HOMER = 4;
      final int WALK = 5;
      final int OUT = 0;
      final int EOF = -1;

      BaseStat player;   // Player statistics object
      int      code;     // Code that was input
      Scanner  stdin;    // Input stream
      String   descript; // String describing the code

      stdin = new Scanner(System.in);
      System.out.printf("When player data is requested, "
       + "the following codes should be used:\n");
      System.out.printf("\t"
       + OUT + ":out, " 
       + SINGLE + ":single, "
       + DOUBLE + ":double, "
       + TRIPLE + ":triple, "
       + HOMER + ":home-run, "
       + WALK + ":walk\n");
      System.out.printf("\n");

      player = new BaseStat();
      code = Util139.readInt(stdin, "Enter data code (" + OUT
       + " to " + WALK + ") or " + EOF + " to terminate: ");
      while (code != EOF)      
      {
         if (code == OUT)
            descript = player.addOut();
         else if (code == SINGLE)
            descript = player.addSingle();
         else if (code == DOUBLE)
            descript = player.addDouble();
         else if (code == TRIPLE)
            descript = player.addTriple();
         else if (code == HOMER)
            descript = player.addHomer();
         else if (code == WALK)
            descript = player.addWalk();
         else
         {
            descript = "";
            System.out.printf("Unknown code %d was entered. Please try again.\n", code);
         }
         if (!descript.equals(""))
         {
            System.out.printf("Result %-8s BAVG=%03d, SAVG=%03d, OAVG=%03d, %s\n",
             descript + ":", player.getBatAvg(), player.getSlugAvg(),
             player.getOnBaseAvg(), player.toString());
         }
	code = Util139.readInt(stdin, "Enter data code (" + OUT
        + " to " + WALK + ") or " + EOF + " to terminate: ");

      }
     }
 }