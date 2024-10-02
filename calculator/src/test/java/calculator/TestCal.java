package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCal {
	MyCalculator obj = new MyCalculator();
	
	

	@Test
	public void test() {

		assertEquals(30, obj.sum(20,10));
		assertEquals(10, obj.diff(20,10));

	}

}
