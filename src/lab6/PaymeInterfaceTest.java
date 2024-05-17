/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: cst8284 Section 320
 * Professor: Sandra Iroakazi
 */
package lab6;

/**
 * This class is called PaymeInterfaceTest. It is created to test the functionality of the previously created Programmer classes.
 */
public class PaymeInterfaceTest  {

	/**
	 * This is the main method which will drive the program.
	 * @param args no command line args
	 */
	public static void main(String[] args) {
		
		/**
		 * This line of code creates an array of Payme objects.
		 * This array will be used to print out information about programmers.
		 */
		Payme[] paymeObjects = new Payme[6];
		
		/**
		 * These lines of code populate the paymeObjects array with items and programmers.
		 */
		paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.00);
		paymeObjects[1] = new Invoice("33442", "gear", 5, 90.00);
		paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 6, 12, 320.00);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 4, 2, 18.95, 40.00);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 6, 12, 16500.00, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Esther", "Patel", "102-34-5888", 6, 12, 1200.00, 0.04, 720.00);
		 
		
		 System.out.println(
		    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
		
		 // generically process each element in array paymeObjects
		 
		 for (Payme currentPayme : paymeObjects) {
		    // output currentPayme and its appropriate payment amount
		    System.out.printf("%s \n", currentPayme.toString()); 
		       
		    if (currentPayme instanceof BasePlusCommissionProgrammer) {
		       // downcast Payme reference to 
		       // BasePlusCommissioProgrammer reference
		       BasePlusCommissionProgrammer programmer = 
		          (BasePlusCommissionProgrammer) currentPayme;
		
		       double oldBaseSalary = programmer.getBaseSalary();
		       programmer.setBaseSalary(1.05 * oldBaseSalary);
		       System.out.printf(
		          "new base salary with 5%% increase is: $%,.2f\n%s: %.2f",
		          programmer.getBaseSalary(),
		          "Payment Due", programmer.getPaymentAmount());
		    } 
		
		}
	}
}


