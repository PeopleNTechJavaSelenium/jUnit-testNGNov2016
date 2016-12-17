package testng.features;

import org.testng.annotations.Test;

import junit.features.Calculator;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;

public class TestTestngFace extends TestNG{
	
Calculator cal = new Calculator();
int addResult = 0;
	
  @Test
  public void f() {
	  Assert.assertEquals(addResult, 18);
  }
  @BeforeMethod
  public void beforeMethod() {
	  addResult = cal.addNumber(10, 8);
  }

  @AfterMethod
  public void afterMethod() {
	  addResult = 0;
  }

}
