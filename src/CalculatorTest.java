import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {
	
	private static Calculator calculator = new Calculator();
	
	@Test
	public void testAdd(){
		calculator.add(7);
		calculator.add(8);
		assertEquals(15, calculator.getReuslt());
	}
}