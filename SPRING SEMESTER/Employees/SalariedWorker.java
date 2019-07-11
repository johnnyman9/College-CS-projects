/** SalariedWorker - A class to represent workers paid on a salaried basis)
 *
 * @author - Nancy Harris and YOUR NAME HERE
 * @version - V1 - YOUR UPDATE DATE HERE
 */
 
 public class SalariedWorker
 {
 	// declare the instance variables of the class
	
	private String name; 		// the name of the worker
	private String SSN;  		// the SSN of the worker
	private int exemptions;	// the number of tax exemptions for this worker
	private double wage; 		// the payment amount for this salaried worker
   private String homeDepartment;
	
	private double hours;		// will be 80 for all salaried workers
	
	/** explicit value constructor
	 * 
	 * @param name 	The name of the worker
	 * @param SSN  	The SSN of the worker
	 * @param exempt	The number of payroll exemptions
	 & @param rate 	The salaried rate for this employee
	 */
	public SalariedWorker(String name, String SSN, String homeDepartment, int exempt, double rate)
	{
		this.name = name;
		this.SSN = SSN;
		this.exemptions = exempt;
		this.wage = rate;
       this.homeDepartment = homeDepartment;
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
		this.hours = hours;  // informational only
		
		// Your code goes here
		
		
		return wage;
	}
	
	/** toString produces a single line for each employee
	 *
	 *  format is Name\tSSN\texemptions\thours\trate\n
	 *
	 * @return The line representing the employee
	 */
	 public String toString()
	 {
	 	return ("Name: " + name + " SSN: " + SSN + " homeDepartment: " + homeDepartment + " Tax: " + exemptions + " Rate: " + wage);
	 }
}