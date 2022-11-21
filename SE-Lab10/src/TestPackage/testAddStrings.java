package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitTesting j = new JUnitTesting();
		String result = j.addStrings("Hello", "World");
		assertEquals(result, "HelloWorld");
		
	}

}
