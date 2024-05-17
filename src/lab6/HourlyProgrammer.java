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
public class HourlyProgrammer extends Programmer {
	
	/**
	 * This line of code creates a variable called wage.
	 * This will hold the wage of a programmer.
	 */
	private double wage; // wage per hour
	
	/**
	 * This line of code creates a variable called hours.
	 * This will hold the number of hours worked by a programmer.
	 */
	private double hours; // hours worked for week
	
	/**
	 * This line of code creates a constructor for an HourlyProgrammer.
	 * This will be used to create instances of Programmer objects.
	 * @param firstName the first name of the programmer.
	 * @param lastName the last name of the programmer.
	 * @param socialSecurityNumber the social security number of the programmer.
	 * @param month the month.
	 * @param year the year.
	 * @param wage the programmers wage.
	 * @param hours the programmers hours.
	 */
	public HourlyProgrammer(String firstName, String lastName, String socialSecurityNumber, int month, int year, double wage, double hours) {
			super(firstName, lastName, socialSecurityNumber, month, year);
	
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
		
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
				  "Hours worked must be >= 0.0 and <= 168.0");
		}
		
		this.wage = wage;
		this.hours = hours;
	} 
	
	/** This line of code creates a method called setWage.
	 * This method will be used to set the wage of the programmer.
	 * @param wage 
	 * 
	 * @throws IllegalArgumentException
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
			"Hourly wage must be >= 0.0");
	}
	
		this.wage = wage;
	} 
	
	/** This line of code creates a method called getWage.
	 * This method will be used to retrieve the wage of the programmer.
	 * @return wage
	 */
	public double getWage() {
		return wage;
	} 
	
	/** This line of code creates a method called setHours.
	 * This method will be used to set the number of hours of the programmer.
	 * @param hours 
	 * 
	 * @throws IllegalArgumentException
	 */
	public void setHours(double hours) {
	if ((hours < 0.0) || (hours > 168.0)) { // validate hours
	  throw new IllegalArgumentException(
	     "Hours worked must be >= 0.0 and <= 168.0");
	}
	
	this.hours = hours;
	} 
	
	/** This line of code creates a method called getHours.
	 * This method will be used to retrieve the hours of the programmer.
	 * @return hours
	 */
	public double getHours() {
	return hours;
	} 
	
	
	/**
	 * This line of code overrides a method called getPaymentAmount.
	 * This will be used to calculates the earnings of a programmer.
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
	if (getHours() <= 40) { // no overtime                           
	  return getWage() * getHours();   
	}
	else {                                                             
	  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}
	}                                          
	
	/**
	 * This line of code overrides the getPaymentAmount method.
	 * When the getPaymentAmount method is called, it will return the result from earnings method.
	 
	@Override
	public double getPaymentAmount() {
		return earnings();
	}
	*/
	/**
	 * This line of code overrides the default toString method.
	 * This is done so that information about an HourlyProgrammer can be printed to the console.
	 */
	@Override
    public String toString() {
        return String.format("Hourly Programmer: %s\n%s: %.2f ; %s: %.2f\n%s: %.2f\n",
                super.toString(),
                "Hourly Wage", getWage(),
                "Hours Worked", getHours(),
                "Earnings", getPaymentAmount());
    }
	//END
	                     
}

