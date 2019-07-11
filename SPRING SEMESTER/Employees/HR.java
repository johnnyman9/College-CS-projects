/** HR is a driver to test the SalariedWorker and HourlyWorker classes
 *
 * @author Nancy Harris, Adopted by V. Capaccio and YOUR NAME HERE
 * @version V1 - YOUR UPDATE DATE HERE
 */
public class HR
{
	public static void main(String [] args)
	{
		SalariedWorker amy, jeff;
		HourlyWorker sam, mary;
		
		amy = new SalariedWorker ("amy", "123-45-6789","Clothing", 1, 1500);
		jeff = new SalariedWorker ("jeff", "555-12-1212","Hardware", 3, 1250);
		sam = new HourlyWorker("sam", "999-99-9999","Electronics", 2, 15.50);
		mary = new HourlyWorker("mary", "888-88-8888","Food", 2, 12.25);
		
		System.out.println("Test pay methods");
		System.out.println("amy " + amy.pay(80));
		System.out.println("jeff " + jeff.pay(80));
		System.out.println("sam " + sam.pay(70));
		System.out.println("mary " + mary.pay(80));
		
		System.out.println("\nTest toString()");
		System.out.println(amy);
		System.out.println(jeff);
		System.out.println(sam);
		System.out.println(mary);
		
	}
}
		
	