/*
 * Student Name: Joseph Garwood
 * Student Number: 041085246
 * Course: cst8284 Section 320
 * Professor: Sandra Iroakazi
 */
package lab6;

/**
 * The Invoice class implements Payme interface.
 */
public class Invoice implements Payme {

	/**
	 * This variable creates a String to hold the part number
	 */
	private String partNumber; 
	/**
	 * This variable creates a String to hold the part description
	 */
	private String partDescription;
	/**
	 * This variable creates an integer to hold the part quantity
	 */
	private int quantity;
	/**
	 * This variable creates a double to hold the part price
	 */
	private double pricePerItem;

/**
 * This line of code creates a constructor for an invoice object.
 * @param part
 * @param description
 * @param count
 * @param price
 */
public Invoice(String part, String description, int count, 
	double price) {
	partNumber = part;
	partDescription = description;
	setQuantity(count); // validate and store quantity
	setPricePerItem(price); // validate and store price per item
}

/** This line of code creates a method called setPartNumber.
 * This method will be used to set the part number of a part.
 * @param part the part number
 */
public void setPartNumber(String part) {
	partNumber = part; // should validate
}

/** This line of code creates a method called getPartNumber.
 * This method will be used to retrieve the part number of a aprt.
 * @return partNumber the part number
 */
public String getPartNumber() {
	return partNumber;
}

/** This line of code creates a method called setDescription
 * This method will be used to set the description of a part.
 * @param description the description
 */
public void setPartDescription(String description) {
	partDescription = description; // should validate
}

/** This line of code creates a method called getPartDescription.
 * This method will be used to retrieve the description of a part.
 * @return partDescription the part description
 */
public String getPartDescription() {
	return partDescription;
}

/** This line of code creates a method called setQuantity.
 * This method will be used to set the number of parts.
 * @param count the quantity count 
 */
public void setQuantity(int count) {
	quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

/** This line of code creates a method called getQuantity.
 * This method will be used to retrieve the quantity of a part.
 * @return quantity the quantity of a part.
 */
public int getQuantity() {
	return quantity;
}

/** This line of code creates a method called setPricePerItem.
 * This method will be used to set the price of a part.
 * @param price the price
 */
public void setPricePerItem(double price) {
	pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

/** This line of code creates a method called getPricePerItem.
 * This method will be used to retrieve the the price of a part.
 * @return pricePerItem the price of a part
 */
public double getPricePerItem() {
	return pricePerItem;
}

/**
 * This line of code overrides the default toString method.
 * This is done so that information about an invoice can be printed to the console.
 */
@Override
public String toString() {
	return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f\n", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

/**
 * This line of code overrides the getPaymentAmount method.
 * When the getPaymentAmount method is called, it will return the cost of an invoice item.
 */
@Override
public double getPaymentAmount() {
	return getQuantity() * getPricePerItem(); // calculate total cost
}
}


