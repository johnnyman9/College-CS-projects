/** SalariedWorker - A class to represent workers paid on a salaried basis)
 *
 * @author - Nancy Harris and Johnny Haizel-Cobbina
 * @version - V2 - 2/7/16
 */
 
 public class SalariedWorkerV2 extends Employee
 {
	/** explicit value constructor
	 * 
	 * @param name 	The name of the worker
	 * @param SSN  	The SSN of the worker
	 * @param exempt	The number of payroll exemptions
	 & @param rate 	The salaried rate for this employee
	 */
	public SalariedWorkerV2(String name, String SSN, String homeDepartment, int exempt, double rate)
	{
		// so how do you pass these values to the parent?
      super(name,SSN, homeDepartment,exempt,rate);
	}
	
	/** pay produces the pay amount for this employee
	 *  pay is simply the return of the wage value
	 *
	 * @param hours For salaried workers, this is informational only
	 *
	 * @return The amount to pay this employee
	 */
	public double pay(double hours)
	{
		
		// Your code goes here
		// hours must be set in the parent
		// the pay must be calculated	
		super.pay = wage;
		return wage;
	}
	
}