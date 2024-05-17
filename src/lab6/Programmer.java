/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: cst8284 Section 320
 * Professor: Sandra Iroakazi
 */
package lab6;

/**
 * This is an abstract superclass that IMPLEMENTS the Payme interface.
 */
public abstract class Programmer implements Payme{

	/**
	 * This line of code creates a variable called firstName.
	 * This will hold the first name of the programmer.
	 */
	private String firstName;
	/**
	 * This line of code creates a variable called lastName.
	 * This will hold the last name of the programmer.
	 */
	private String lastName;
	/**
	 * This line of code creates a variable called socialSecurityNumber.
	 * This will hold the social security number of the programmer.
	 */
	private String socialSecurityNumber;
	/**
	 * This line of code creates a variable called month.
	 */
	private int month;
	/**
	 * This line of code creates a variable called year.
	 */
	private int year;
	
	/**
	 * This line of code creates a constructor for a Programmer.
	 * This will be used to create instances of Programmer objects.
	 * @param first the first name of the programmer.
	 * @param last the last name of the programmer.
	 * @param ssn the social security number of the programmer.
	 * @param month the month
	 * @param year the year
	 */
	public Programmer(String first, String last, String ssn, int month, int year) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		this.month = month;
		this.year = year;
	}
	
	/** This line of code creates a method called getFirstname.
	 * This method will be used to retrieve the first name of the programmer.
	 * @return firstName
	 */
	String getFirstName() {
		return firstName;
	}
	
	/** This line of code creates a method called getLastname.
	 * This method will be used to retrieve the last name of the programmer.
	 * @return lastName
	 */
	String getLastName() {
		return lastName;
	}
	
	/** This line of code creates a method called getSocialSecurityNumber.
	 * This method will be used to retrieve the social security number name of the programmer.
	 * @return socialSecurityNumber
	 */
	String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	/**
	 * This line of code overrides the default toString method.
	 * This is done so that information about a Programmer can be printed to the console.
	 */
	@Override
	public String toString() {
		return String.format("%s %s\nSocial Security Number:%s", 
		getFirstName(), getLastName(), getSocialSecurityNumber());
	} 
	
	/**
	 * Create abstract method getPaymentAmount.
	 * This method is created with no body.
	 * This method is created so that the Programmer class' subclasses can use and override this method to calculate the payment due to each programmer.
	 */
	public abstract double getPaymentAmount(); 

} 


