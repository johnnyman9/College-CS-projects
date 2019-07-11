/** HourlyWorker - A class to represent workers paid on a salaried basis)
 *
 * @author - Nancy Harris and YOUR NAME HERE
 * @version - V1 - YOUR UPDATE DATE HERE
 */
 
 public class HourlyWorker
 {
 	// declare the instance variables of the class
	
	private String name; 		// the name of the worker
	private String SSN;  		// the SSN of the worker
	private int exemptions;	// the number of tax exemptions for this worker
	private double wage; 		// the hourly rate for this hourly worker
   private String homeDepartment;
	
	private double hours;
   		// the hours that this worker last worked
	
	/** explicit value constructor
	 * 
	 * @param name 	The name of the worker
	 * @param SSN  	The SSN of the worker
	 * @param exempt	The number of payroll exemptions
	 & @param rate 	The hourly rate for this employee
	 */
	public HourlyWorker(String name, String SSN, String homeDepartment, int exempt, double rate)
	{
		this.name = name;
		this.SSN = SSN;
		this.exemptions = exempt;
		this.wage = rate;
      this.homeDepartment = homeDepartment;
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
		this.hours = hours;  // stores the hours worked
      
       
       double pay;   
       
       if(hours <= 80)
       {
         pay = wage * hours;
       }
       else
       {
         pay = (wage*((hours - 80) * 1.5)) + (wage * 80);
       }
		
      
      // Your code goes here
		
		
		return pay;
	}
	
	/** toString produces a single line for each employee
	 *
	 *  format is Name\tSSN\texemptions\thours\trate\n
	 *
	 * @return The line representing the employee
	 */
	 public String toString()
	 {
	 	return ("Name: " + name + " SSN: " + SSN  + " homeDepartment: " + homeDepartment + " Tax: " + exemptions + " Rate: " + wage);
	 }
}