/******************************************************
 * Tester is a class which will test the two methods
 * in RecurMath
 * @author  Johnny Haizel-Cobbina
 * @version March 3, 2016
 ******************************************************/
public class Labm1 
{
   public static void main(String args[])
   {
      IntArr   array;

      Check.stopOnFail = false;
      Check.expect(RecurMath.fact(5), 120);
      Check.expect(RecurMath.fact(0), 1);
      Check.expect(RecurMath.fact(1), 1);
      Check.expect(RecurMath.fact(10), 3628800);
   
      Check.expect(RecurMath.fib(5), 5);
      Check.expect(RecurMath.fib(2), 1);
      Check.expect(RecurMath.fib(1), 1);
      Check.expect(RecurMath.fib(10), 55);

      array = new IntArr(6);
      array.fill(5,2,4);
      Check.expect(array.toString(), "[0, 0, 5, 5, 5, 0]");
      array.fill(7,0,5);
      Check.expect(array.toString(), "[7, 7, 7, 7, 7, 7]");
   }

   /********************************************
    * indent provides a String that can be used to 
    * indent an output line based on the size passed in
    *
    * @param size The number of spaces to indent
    * @return a String of blanks of length size
    ********************************************/
   public static String indent (int size)
   {
      String ss;
      ss = String.format("%" + size + "s", "");
      return ss;
   }
}



































