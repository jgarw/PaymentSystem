/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: cst8284 Section 320
 * Professor: Sandra Iroakazi
 */
package lab6;

/**
 * This class is used to create a programmer that is paid a salary and commission.
 * This BasePlusCommissionProgrammer class will inherit from the CommissionProgrammer superclass.
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

	/**
	 * This line of code creates a variable called baseSalary.
	 * This will hold the base salary of a Programmer.
	 */
	private double baseSalary;
	
	/**
	 * This line of code creates a constructor for a BasePlusCommissionerProgrammer.
	 * This will be used to create instances of Programmer objects.
	 * @param firstName the first name of the programmer.
	 * @param lastName the last name of the programmer.
	 * @param socialSecurityNumber the social security number of the programmer.
	 * @param month the month
	 * @param year the year
	 * @param grossSales the gross sales
	 * @param commissionRate the commission rate
	 * @param baseSalary the base salary
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, int month, int year, 
	double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, month, year, grossSales, commissionRate);
	
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;                
	}
	
	
	
	/** 
	 * This line of code creates a method called setBaseSalary.
	 * This method will be used to set the base salary of the programmer.
	 * @param baseSalary 
	 * 
	 * @throws IllegalArgumentException
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		
		this.baseSalary = baseSalary;                
	} 
	
	/** This line of code creates a method called getBaseSalary.
	 * This method will be used to retrieve the base salary of the programmer.
	 * @return baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	
	/**
	 * This line of code overrides a method called getPaymentAmount.
	 * This will be used to calculates the earnings of the programmer.
	 * 
	 * This line of code multiplies the baseSalary of the basePlusCommissionProgrammer by 1.05% to get the baseSalary with extra 5%.
	 */
	@Override                                                            
	public double getPaymentAmount() {                                             
		return (getBaseSalary()  + super.getPaymentAmount());                        
	} 
	
	/**
	 * This line of code overrides the default toString method.
	 * This is done so that information about an HourlyProgrammer can be printed to the console.
	 */
	@Override 
	public String toString() {
	    return String.format("Base-Plus Commission Programmer: %s %s\n%s: %s\n%s: %.2f; %s: %.2f; %s: %.2f",
	    		super.getFirstName(), super.getLastName(),
	    		"Social Security Number", super.getSocialSecurityNumber(),
	    		"Gross Sales", getGrossSales(),
				"Commission Rate", getCommissionRate(), 
	            "Base Salary", getBaseSalary());
	}

}



