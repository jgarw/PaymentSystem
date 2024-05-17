/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: cst8284 Section 320
 * Professor: Sandra Iroakazi
 */
package lab6;
/**
 * This class is used to create a programmer that is paid hourly.
 * This HourlyProgrammer class will inherit from the Programmer superclass.
 */
public class SalariedProgrammer extends Programmer  {
	/**
	 * This line of code creates a variable called weeklySalary.
	 * This will hold the weekly salary of a programmer.
	 */
	private double weeklySalary;
	
	/**
	 * This line of code creates a constructor for an HourlyProgrammer.
	 * This will be used to create instances of Programmer objects.
	 * @param firstName the first name of the programmer.
	 * @param lastName the last name of the programmer.
	 * @param socialSecurityNumber the social security number of the programmer.
	 * @param month the month.
	 * @param year the year.
	 * @param weeklySalary the weekly salary
	 */
	public SalariedProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, int month, int year, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year); 
	
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
	
		this.weeklySalary = weeklySalary;
	} 
	
	/** This line of code creates a method called setSalary.
	 * This method will be used to set the salary of the programmer.
	 * @param weeklySalary 
	 * 
	 * @throws IllegalArgumentException
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
	}
	
		this.weeklySalary = weeklySalary;
	} 
	
	/** This line of code creates a method called getWeeklySalary.
	 * This method will be used to retrieve the salary of the programmer.
	 * @return salary
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 
	
	/**
	 * This line of code overrides the getPaymentAmount method.
	 * This will be used to calculates the earnings of a programmer.
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	} 
	
	/**
	 * This line of code overrides the default toString method.
	 * This is done so that information about an HourlyProgrammer can be printed to the console.
	 */
	@Override          
	public String toString() {
		return String.format("Salaried Programmer: %s\n%s: %.2f\n%s: %.2f\n", 
				super.toString(), 
				"Weekly Salary", getWeeklySalary(),
				"Payment Due", getPaymentAmount());
		}
	//END
}

