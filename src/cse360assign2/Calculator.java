/*
 * Assignment 2 - CSE360
 * Author - Ross Hill
 * ClassID - 405
 * Description - This file contains methods to act
 * as a calculator.
 */
package cse360assign2;

/**
 * This class has a methods to add, subtract, multiply,
 * and divide. It can also return the total integer
 * calculated and the history of operations.
 * @see Calculator
 * @see getTotal
 * @see add
 * @see subtract
 * @see multiply
 * @see divide
 * @see getHistory
 */
public class Calculator {
	/*
	 * Parameter for total.
	 */
	private int total;
	
	/**
	 * Constructor that initializes total to size 0.
	 */
	public Calculator() {
		total = 0;
	}
	
	/**
	 * Gets the total value from private variable and
	 * returns it.
	 * @return total value calculated
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Adds parameter value to the total value.
	 * @param value used in addition operation
	 */
	public void add(int value) {
		total += value;
	}
	
	/**
	 * Subtracts parameter value from the total value.
	 * @param value used in subtraction operation
	 */
	public void subtract(int value) {
		total -= value;
	}
	
	/**
	 * Multiplies parameter value by the total value.
	 * @param value used in multiplication operation
	 */
	public void multiply(int value) {
		total *= value;
	}
	
	/**
	 * Divides parameter value by the total value.
	 * @param value used in division operation
	 */
	public void divide(int value) {
		if(value == 0) total = 0;
		else total /= value;
	}
	
	/**
	 * Gets the history of previous operations.
	 * @return all previous operations as a string
	 */
	public String getHistory() {
		return "";
	}
}