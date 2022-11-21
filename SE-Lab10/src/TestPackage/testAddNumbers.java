package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitTesting j = new JUnitTesting();
		int result = j.addNumbers(1, 1);
		assertEquals(result, 2);
	}

}
