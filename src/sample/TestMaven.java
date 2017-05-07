package sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMaven {
	/*public static void main(String[] args) {
		System.out.println("Run as -> clean and Run as -> Install");
	}*/
	
	@Test
	public void testMaven()
	{
		Reporter.log("Running the Maven Project using TestNg",true);
	}

}
