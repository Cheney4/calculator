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
	public void testAddSeveral() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.add(5);
		myCalc.add(3);
		assertEquals(17, myCalc.getTotal());
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
	public void testAddDoubleNeg() {
		Calculator myCalc = new Calculator();
		myCalc.add(-6);
		myCalc.add(-5);
		assertEquals(-11, myCalc.getTotal());
	}

	@Test
	public void testAddMixed() {
		Calculator myCalc = new Calculator();
		myCalc.add(-6);
		myCalc.add(8);
		myCalc.add(-5);
		assertEquals(-3, myCalc.getTotal());
	}

	@Test
	public void testSubtract() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		assertEquals(-9, myCalc.getTotal());
	}

	@Test
	public void testSubtractSeveral() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		myCalc.subtract(6);
		myCalc.subtract(2);
		assertEquals(-17, myCalc.getTotal());
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
	public void testSubtractSeveralNeg() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(-9);
		myCalc.subtract(-3);
		myCalc.subtract(-1);
		assertEquals(13, myCalc.getTotal());
	}

	@Test
	public void testSubtractMixed() {
		Calculator myCalc = new Calculator();
		myCalc.subtract(9);
		myCalc.subtract(-3);
		myCalc.subtract(-1);
		myCalc.subtract(2);
		assertEquals(-7, myCalc.getTotal());
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
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		assertEquals("0 + 9", myCalc.getHistory());;
	}
	
	@Test
	public void testGetHistoryLong() {
		Calculator myCalc = new Calculator();
		myCalc.add(9);
		myCalc.multiply(4);
		myCalc.divide(12);
		myCalc.subtract(10);
		assertEquals("0 + 9 * 4 / 12 - 10", myCalc.getHistory());;
	}
	
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
