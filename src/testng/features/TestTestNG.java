package testng.features;

import org.testng.Assert;

import junit.features.Calculator;

public class TestTestNG {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int addResult = cal.addNumber(10, 8);
		Assert.assertEquals(addResult, 18);

	}

}
