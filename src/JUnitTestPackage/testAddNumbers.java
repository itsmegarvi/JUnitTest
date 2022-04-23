package JUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunctions JUnit=new JUnitFunctions();
		int result = JUnit.AddNumbers(100, 200);
		assertEquals(300, result);
	}

}
