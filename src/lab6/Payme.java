/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: cst8284 Section 320
 * Professor: Sandra Iroakazi
 */
package lab6;

/**
 * This class creates an interface called Payme. This interface will be implemented by other classes.
 */
public interface Payme {
	
	/**
	 * This method is used to calculate the payment amount for a programmer.
	 * This will be used by other classes where it will be overridden.
	 */
	double getPaymentAmount();

}
