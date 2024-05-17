/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: cst8284 Section 320
 * Professor: Sandra Iroakazi
 */
package lab6;

/**
 * This class is created to represent a programmer who is paid on commission.
 * This class inherits from the Programmer superclass.
 */
public class CommissionProgrammer extends Programmer { 

	/**
	 * This line of code creates a variable called grossSales.
	 * This will hold the gross sales of a programmer.
	 */
	private double grossSales; // gross weekly sales
	
	/**
	 * This line of code creates a variable called commissionRate.
	 * This will hold the commission rate of a programmer.
	 */
	private double commissionRate; // commission percentage
	
	/**
	 * This line of code creates a constructor for a Programmer.
	 * This will be used to create instances of Programmer objects.
	 * @param firstName the first name of the programmer.
	 * @param lastName the last name of the programmer.
	 * @param socialSecurityNumber the social security number of the programmer.
	 * @param month the month
	 * @param year the year
	 * @param grossSales the gross sales
	 * @param commissionRate the commission rate
	 */
	public CommissionProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, int month, int year, 
	double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);
		
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
		
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 
	
	/**
	 * This line of code creates a method called setGrossSales.
	 * Thiss will be used to set the gross sales amount based on a programmers apps.
	 * @param grossSales
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
	
		this.grossSales = grossSales;
	} 
	
	/**
	 * This line of code creates a method called getGrossSales.
	 * This will be used to retrieve the gross sales amount of a programmer.
	 * @return grossSales
	 */
	public double getGrossSales() {
		return grossSales;
	} 
	
	 /** This line of code creates a method called setGrossSales.
	 * This will be used to set the commission rate of a programmer.
	 * @param commissionRate
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
	
		this.commissionRate = commissionRate;
	} 
	
	/**
	 * This line of code creates a method called getCommissionRate.
	 * This will be used to retrieve the commission rate of a programmer.
	 * @return commissionRate
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 
	
	/**
	 * This line of code overrides the getPaymentAmount method.
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                   
	
	/**
	 * This line of code overrides the default toString method.
	 * This is done so that information about a CommissionProgrammer can be printed to the console.
	 */
	@Override      
	public String toString() {
	return String.format("Commission Programmer: %s\n%s: %.2f ; %s: %.2f\n%s: %.2f\n",
            super.toString(),
            "Gross Sales", getGrossSales(),
			"Commission Rate", getCommissionRate(),
			"Payment Due", getPaymentAmount());
	//END
	}
}

