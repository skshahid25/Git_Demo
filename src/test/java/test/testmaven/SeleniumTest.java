package test.testmaven;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class SeleniumTest {


	@Test
	public void test1()
	{
		System.out.println("Selenium test case1");
	}

	@Test
	public void test2()
	{
		System.out.println("Selenium test case2");
	}
	
	@AfterSuite
	public void suitetest()
	{
		System.out.println("test after all suite");
	}
}
