package junit.features;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {
	Calculator cal = new Calculator();
	int result = 0;
	@Before
	public void setUp() throws Exception {
		result = cal.addNumber(10, 8);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		 Assert.assertEquals(18, result);
	}

}
