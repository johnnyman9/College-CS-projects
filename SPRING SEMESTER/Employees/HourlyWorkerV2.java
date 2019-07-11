/** HourlyWorker - A class to represent workers paid on a salaried basis)
 *
 * @author - Nancy Harris and Johnny Haizel-Cobbina
 * @version - V2 - 1/7/16
 */
 
 public class HourlyWorkerV2 extends Employee
 {
 	
	/** explicit value constructor
	 * 
	 * @param name 	The name of the worker
	 * @param SSN  	The SSN of the worker
	 * @param exempt	The number of payroll exemptions
	 & @param rate 	The hourly rate for this employee
	 */
	public HourlyWorkerV2(String name, String SSN, String homeDepartment, int exempt, double rate)
	{
		// so how do we get this into the Employee class?
      super(name,SSN, homeDepartment,exempt,rate);
	}
	
	/** pay produces the pay amount for this employee
	 *  pay the rate * hours.  (we are disregarding overtime at this time)
	 *
	 * @param hours The number of hours for this hourly worker
	 *
	 * @return The amount to pay this employee
	 */
	public double pay(double hours)
	{
		// store the hours worked
		// Your code goes here
      
       double pay;   
       
       if(hours <= 80)
       {
         pay = wage * hours;
       }
       else
       {
         pay = (wage*((hours - 80) * 1.5)) + (wage * 80);
       }

      super.pay = pay;				
      
		return pay;
	}
}