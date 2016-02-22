package cse360assign3;

//Adam Charney PIN 213 for CSE360 Spring 2016 Assignment 3

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	//Default constructor test
	@Test
	public void testCalculator() {
		Calculator myCalc = new Calculator();
		assertNotNull(myCalc);
	}
	
	//get total with no operation performed
	@Test
	public void testGetTotalDefault() {
		Calculator myCalc = new Calculator();
		assertEquals(0, myCalc.getTotal());
	}

	//get total with an operation performed
	@Test
	public void testGetTotalNonZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		assertEquals(9, myCalc.getTotal());
	}
	
	//add a single integer
	@Test
	public void testAdd() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		assertEquals(9, myCalc.getTotal());
	}

	//adding several integers
	@Test
	public void testAddSeveral() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.add(5);
		myCalc.add(3);
		assertEquals(17, myCalc.getTotal());
	}
	
	//add zero
	@Test
	public void testAddZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(0);
		assertEquals(0, myCalc.getTotal());
	}

	//add a negative number
	@Test
	public void testAddNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(-6);
		assertEquals(-6, myCalc.getTotal());
	}

	//add two negative numbers consecutively
	@Test
	public void testAddDoubleNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(-6);
		myCalc.add(-5);
		assertEquals(-11, myCalc.getTotal());
	}

	//add a mix of positive and negative integers
	@Test
	public void testAddMixed() {
		Calculator myCalc = new Calculator();
		myCalc.add(-6);
		myCalc.add(8);
		myCalc.add(-5);
		assertEquals(-3, myCalc.getTotal());
	}

	//subtract a single integer
	@Test
	public void testSubtract() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		assertEquals(-9, myCalc.getTotal());
	}

	//subtract several integers
	@Test
	public void testSubtractSeveral() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		myCalc.subtract(6);
		myCalc.subtract(2);
		assertEquals(-17, myCalc.getTotal());
	}

	//subtract zero
	@Test
	public void testSubtractZero() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(0);
		assertEquals(0, myCalc.getTotal());
	}

	//subtract a negative integer
	@Test
	public void testSubtractNeg() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(-9);
		assertEquals(9, myCalc.getTotal());
	}

	//subtract several negative integers
	@Test
	public void testSubtractSeveralNeg() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(-9);
		myCalc.subtract(-3);
		myCalc.subtract(-1);
		assertEquals(13, myCalc.getTotal());
	}

	//subtract a mix of positive and negative integers
	@Test
	public void testSubtractMixed() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		myCalc.subtract(-3);
		myCalc.subtract(-1);
		myCalc.subtract(2);
		assertEquals(-7, myCalc.getTotal());
	}

	//multiply an integer
	@Test
	public void testMultiply() {
		Calculator myCalc = new Calculator();
		myCalc.add(2);
		myCalc.multiply(4);
		assertEquals(8, myCalc.getTotal());
	}

	//multiply by zero
	@Test
	public void testMultiplyZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(2);
		myCalc.multiply(0);
		assertEquals(0, myCalc.getTotal());
	}

	//multiply by a negative integer
	@Test
	public void testMultiplyNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(2);
		myCalc.multiply(-4);
		assertEquals(-8, myCalc.getTotal());
	}

	//multiply negative integer by negative integer
	@Test
	public void testMultiplyDoubleNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(-2);
		myCalc.multiply(-4);
		assertEquals(8, myCalc.getTotal());
	}

	//divide by an integer
	@Test
	public void testDivideDefault() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(3);
		assertEquals(3, myCalc.getTotal());
	}

	//divide by an integer with remainder
	@Test
	public void testDivideInt() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(4);
		assertEquals(2, myCalc.getTotal());
	}

	//divide by  negative integer
	@Test
	public void testDivideNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(-3);
		assertEquals(-3, myCalc.getTotal());
	}

	//divide negative integer by negative integer
	@Test
	public void testDivideDoubleNeg() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		myCalc.divide(-3);
		assertEquals(3, myCalc.getTotal());
	}

	//divide by zero
	@Test
	public void testDivideZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(0);
		assertEquals(0, myCalc.getTotal());
	}

	//simple history
	@Test
	public void testGetHistory() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		assertEquals("0 + 9", myCalc.getHistory());;
	}
	
	//complex history
	@Test
	public void testGetHistoryLong() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.multiply(4);
		myCalc.divide(12);
		myCalc.subtract(10);
		assertEquals("0 + 9 * 4 / 12 - 10", myCalc.getHistory());;
	}
	
	//history from assignment document
	@Test
	public void testGetHistoryAssignExample() {
		Calculator myCalc = new Calculator();
		myCalc.add(4);
		myCalc.subtract(2);
		myCalc.multiply(2);
		myCalc.add(5);
		assertEquals("0 + 4 - 2 * 2 + 5", myCalc.getHistory());;
	}
	
}
