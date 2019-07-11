/**********************************************************************
 * A set of functions to test if their two parameters are the same 
 * value and output appropriate diagnostics, including the location of
 * the Check function call.
 *
 * @author  Johnny Haizel-Cobbina
 * @version March 3, 2016
 *********************************************************************/
public class Check
{
    /*************************************************************
     * Whether or not passed tests should be reported. 
     * Default: false. 
     * Public visibility because the ability to have users set it
     * to either value at any time is desirable.
     *************************************************************/
    public static boolean reportPass = false;
    /*************************************************************
     * Whether or not the program should be aborted if a test fails.
     * Default: true. 
     * Public visibility because the ability to have users set it
     * to either value at any time is desirable.
     *************************************************************/
    public static boolean stopOnFail = true;

    /*************************************************************
     * Check if the two objects have the same value and output
     * appropriate diagnostics.  
     *
     * @param value1    The first object
     * @param value2    The second object
     * @param quotes    Whether or not the object's value should be output enclosed in quotes
     * @param level     Level in stack trace to print in diagnostic
     *************************************************************/
    private static void expect(Object value1, Object value2, boolean quotes, int level)
    {
        String  detail;
        String  s1 = value1.toString();
        String  s2 = value2.toString();
        boolean pass;
        if (quotes)
        {
            detail =  "  Actual value:   \"" + s1 + "\"\n";
            detail += "  Expected value: \"" + s2 + "\"";
        }
        else
        {
            detail =  "  Actual value:   " + s1 + "\n";
            detail += "  Expected value: " + s2;
        }
        if (s1.equals(s2))
            pass = true;
        else
            pass = false;
    
        if (reportPass || !pass)
        {
            try
            {
                throw new Exception(pass?"PASS":"FAIL");
            }
            catch (Exception e)
            {
                String ss;
                int ii;
                StackTraceElement ste[];
                ste = (e.getStackTrace());
                ss = ste[level].toString();
                ii = ss.indexOf("(");
                if (ii > 0)
                    ss = ss.substring(ii);
                System.err.printf("%s: check at %s.\n",
                  e.getMessage(), ss);
                System.err.printf("%s\n", detail);
            }
            if (!pass && stopOnFail)
                System.exit(1);
        }
    }

    /*************************************************************
     * Check if the two parameters have the same value and output
     * appropriate diagnostics.  
     *
     * @param value1    The first value
     * @param value2    The second value
     *************************************************************/
    public static void expect(Object value1, Object value2)
    {
        expect(value1, value2, true, 2);
    }
    public static void expect(int value1, int value2)
    {
        String  s1 = "" + value1;
        String  s2 = "" + value2;
        expect(s1, s2, false, 2);
    }
    public static void expect(long value1, long value2)
    {
        String  s1 = "" + value1;
        String  s2 = "" + value2;
        expect(s1, s2, false, 2);
    }
    public static void expect(float value1, float value2)
    {
        Float   s1 = new Float(value1);
        Float   s2 = new Float(value2);
        expect(s1, s2, false, 2);
    }
    public static void expect(double value1, double value2)
    {
        Double  s1 = new Double(value1);
        Double  s2 = new Double(value2);
        expect(s1, s2, false, 2);
    }
    public static void expect(float value1, float value2, double precision)
    {
        Double d1 = new Double(value1);
        Double d2 = new Double(value2);
        expect(d1,d2,precision,2);
    }
    public static void expect(Float value1, Float value2, double precision)
    {
        Double d1 = new Double(value1);
        Double d2 = new Double(value2);
        expect(d1,d2,precision,2);
    }
    public static void expect(double value1, double value2, double precision)
    {
        Double d1 = new Double(value1);
        Double d2 = new Double(value2);
        expect(d1,d2,precision,2);
    }
    public static void expect(Double value1, Double value2, double precision)
    {
        Double d1 = new Double(value1);
        Double d2 = new Double(value2);
        expect(d1,d2,precision, 2);
    }
    private static void expect(Double value1, Double value2, double precision, int cnt)
    {
        Double bound1 = value1 + precision;
        Double bound2 = value1 - precision;
        if (bound1 > bound2)
        {
            bound1 = value1 - precision;
            bound2 = value1 + precision;
        }
        if (value2 >= bound1 && value2 <= bound2) 
            value2 = value1;
        expect(value1, value2, false, cnt+1);
    }
    public static void expect(boolean value1, boolean value2)
    {
        String  s1 = Boolean.toString(value1);
        String  s2 = Boolean.toString(value2);
        expect(s1, s2, false, 2);
    }
    public static void expect(char value1, char value2)
    {
        String  s1 = Character.toString(value1);
        String  s2 = Character.toString(value2);
        expect(s1, s2, true, 2);
    }
}