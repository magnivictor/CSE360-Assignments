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
	 * Parameter for total integer and operation history string.
	 */
	private int total;
	private String history = "0";
	
	/**
	 * Constructor that initializes total to size 0.
	 */
	public Calculator() {
		total = 0;
	}
	
	/**
	 * Gets the total value from private variable and returns it.
	 * @return total value calculated
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * Adds operation to history. Then adds parameter value to the total value. 
	 * @param value used in addition operation
	 */
	public void add(int value) {
		history += " + " + value;
		total += value;
	}
	
	/**
	 * Adds operation to history. Then subtracts parameter value from the total value.
	 * @param value used in subtraction operation
	 */
	public void subtract(int value) {
		history += " - " + value;
		total -= value;
	}
	
	/**
	 * Adds operation to history. Then multiplies parameter value by the total value.
	 * @param value used in multiplication operation
	 */
	public void multiply(int value) {
		history += " * " + value;
		total *= value;
	}
	
	/**
	 * Adds operation to history. Then divides parameter value by the total value.
	 * @param value used in division operation
	 */
	public void divide(int value) {
		history += " / " + value;
		if(value == 0) total = 0;
		else total /= value;
	}
	
	/**
	 * Gets the history of previous operations.
	 * @return all previous operations as a string
	 */
	public String getHistory() {
		history += " = " + total;
		return history;
	}
}