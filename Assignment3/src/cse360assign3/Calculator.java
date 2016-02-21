
package cse360assign3;

/**
 * Class to perform basic calculator operations. Dividing by zero
 * results in zero, not error. Maintains a history of calculator
 * operations performed. Integer arithmetic is used.
 * 
 * @author Adam Charney PIN 213 for CSE360 Spring 2016
 * @version 1
 */

public class Calculator {

	/** integer to hold the total of all calculator operations */
	private int total;
	
	/** string to hold history of calculations, default value of 0 */
	private String history = "0";
	
	/** Creates a calculator object with total equal to 0 */
	public Calculator () {
		
		total = 0;  // not needed - included for clarity
	}
	
	/** Fetches the current total
	 * 
	 * @return total result of calculator operations
	 */
	
	public int getTotal () {
		
		return total;
	}
	
	/**
	 * Adds a parameter to the total and updates the history.
	 * 
	 * @param value value to be added to the total
	 */
	
	public void add (int value) {
		
		total += value;
		
		history += " + " + value;
	}
	
	/**
	 * Subtracts a parameter from the total and updates the history.
	 * 
	 * @param value value to be subtracted from the total
	 */
	
	public void subtract (int value) {
		
		total -= value;
		
		history += " - " + value;
	}
	
	/**
	 * Multiplies the total by a parameter and updates the history.
	 * 
	 * @param value value to be used for multiplication
	 */
	
	public void multiply (int value) {
		
		total *= value;
		
		history += " * " + value;
	}
	
	/**
	 * Divides the total by a parameter using integer division and updates the history.
	 * Division by zero results in zero.
	 * 
	 * @param value value to be used for division
	 */
	public void divide (int value) {
		
		history += " / " + value;
		
		if (value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
	}
	
	/**
	 * Fetches the history of calculator operations performed.
	 * 
	 * @return String of calculator operations performed.
	 */	
	public String getHistory () {
		return history;
	}
}