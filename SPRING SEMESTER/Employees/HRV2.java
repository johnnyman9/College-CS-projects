/** HR is a driver to test the SalariedWorker and HourlyWorker classes
 *
 * @author Nancy Harris and Johnny Haizel-Cobbina
 * @version V2 - 2/7/16
 */
public class HRV2
{
	public static void main(String [] args)
	{
		SalariedWorkerV2 amy, jeff;
		HourlyWorkerV2 sam, mary;
		
		amy = new SalariedWorkerV2 ("amy", "123-45-6789","Clothing", 1, 1500);
		jeff = new SalariedWorkerV2 ("jeff", "555-12-1212","Electronics", 3, 1250);
		sam = new HourlyWorkerV2("sam", "999-99-9999","Food", 2, 15.50);
		mary = new HourlyWorkerV2("mary", "888-88-8888","Drinks", 2, 12.25);
		
		System.out.println("Test pay methods");
		System.out.println("amy " + amy.pay(80));
		System.out.println("jeff " + jeff.pay(80));
		System.out.println("sam " + sam.pay(70));
		System.out.println("mar y" + mary.pay(80));
		
		System.out.println("\nTest toString()");
		System.out.println(amy);
		System.out.println(jeff);
		System.out.println(sam);
		System.out.println(mary);
		
	}
}
		
	