package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator myCalc = new Calculator();
		assertNotNull(myCalc);
	}
	
	@Test
	public void testGetTotalDefault() {
		Calculator myCalc = new Calculator();
		assertEquals(0, myCalc.getTotal());
	}

	@Test
	public void testGetTotalNonZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		assertEquals(9, myCalc.getTotal());
	}
	
	@Test
	public void testAdd() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		assertEquals(9, myCalc.getTotal());
	}
	
	@Test
	public void testAddZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(0);
		assertEquals(0, myCalc.getTotal());
	}

	@Test
	public void testAddNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(-6);
		assertEquals(-6, myCalc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		assertEquals(-9, myCalc.getTotal());
	}

	@Test
	public void testSubtractZero() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(0);
		assertEquals(0, myCalc.getTotal());
	}

	@Test
	public void testSubtractNeg() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(-9);
		assertEquals(9, myCalc.getTotal());
	}

	@Test
	public void testMultiply() {
		Calculator myCalc = new Calculator();
		myCalc.add(2);
		myCalc.multiply(4);
		assertEquals(8, myCalc.getTotal());
	}

	@Test
	public void testMultiplyZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(2);
		myCalc.multiply(0);
		assertEquals(0, myCalc.getTotal());
	}

	@Test
	public void testMultiplyNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(2);
		myCalc.multiply(-4);
		assertEquals(-8, myCalc.getTotal());
	}

	@Test
	public void testMultiplyDoubleNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(-2);
		myCalc.multiply(-4);
		assertEquals(8, myCalc.getTotal());
	}

	@Test
	public void testDivideDefault() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(3);
		assertEquals(3, myCalc.getTotal());
	}

	@Test
	public void testDivideInt() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(4);
		assertEquals(2, myCalc.getTotal());
	}

	@Test
	public void testDivideNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(-3);
		assertEquals(-3, myCalc.getTotal());
	}

	@Test
	public void testDivideDoubleNeg() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		myCalc.divide(-3);
		assertEquals(3, myCalc.getTotal());
	}

	@Test
	public void testDivideZero() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.divide(0);
		assertEquals(0, myCalc.getTotal());
	}

	@Test
	public void testGetHistory() {
		fail("Not yet implemented");
	}
	

}
