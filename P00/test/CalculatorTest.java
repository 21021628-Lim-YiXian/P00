import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		//Arrange --> Set pre-requisite and object to be tested
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		
		//Act --> Perform the test using the set values and objects
		int actual = cal.add(a, b);
		
		//Assert --> Check that the output is as intended based on input given
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiple() {
		int a = 1111;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 11110;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 5555;
		assertEquals(expected, actual);
	}

}