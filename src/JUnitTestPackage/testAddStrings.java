package JUnitTestPackage;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunctions JUnit=new JUnitFunctions();
		String result = JUnit.AddStrings("Garvit","Shubham");
		assertEquals("Garvit Shubham", result);
	}

}
