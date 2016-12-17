package junit.features;

import org.junit.Assert;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int result = cal.addNumber(10, 8);
		try{
		   Assert.assertEquals(18, result);
		   System.out.println("Test cases passed");
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		int subtractResult = cal.subtractNumber(10, 8);
		try{
			   Assert.assertEquals(2, subtractResult);
			   System.out.println("Test cases passed");
			}catch(Exception ex){
				ex.printStackTrace();
			}
	}

}
