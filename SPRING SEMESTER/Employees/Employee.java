/** Employee - A class to represent Employees
 *
 * @author - Nancy Harris and Johnny Haizel-Cobbina
 * @version - V1 - 2/7/16
 */
 
 public class Employee
 {
 	// declare the instance variables of the class
	
	protected String name; 		// the name of the worker
	protected String SSN;  		// the SSN of the worker
	protected int exemptions;		// the number of tax exemptions for this worker
	protected double wage; 		// the hourly rate for this worker
   protected String homeDepartment;
   protected double pay;
	
	protected double hours;		// the hours that this worker last worked
	
	/** default constructor...really has no meaning at this point
	 */
	public Employee(){}
	
	/** explicit value constructor
	 * 
	 * @param name 	The name of the worker
	 * @param SSN  	The SSN of the worker
	 * @param exempt	The number of payroll exemptions
	 & @param rate 	The pay rate for this employee
	 */
	public Employee(String name,String SSN, String homeDepartment, int exempt, double rate)
	{
		this.name = name;
		this.SSN = SSN;
		this.exemptions = exempt;
		this.wage = rate;
      this.homeDepartment = homeDepartment;
	}
	
		
	/** toString produces a single line for each employee
	 *  pay is the last amount paid based on rate and hours
	 *
	 *  format is Name\tSSN\texemptions\thours\trate\tpay\n
	 *
	 * @return The line representing the employee
	 */
	 public String toString()
	 {
	   return ("Name: " + name + "\t SSN: " + SSN  + "\t homeDepartment: " + homeDepartment + "\t\t Tax: " + exemptions + "\t Rate: " + wage + "\t pay: " + pay);
	 }
}