package test.testmaven;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTest{

	@Test
	public void test1()
	{
		System.out.println("Appium test case1");
	}

	@Test(groups={"Shahid"})
	public void test2()
	{
		System.out.println("Appium test case2");
	}
	
	@BeforeTest
	public void message()
	{
		System.out.println("Before test message");
	}
	@Test(groups={"Shahid"})
	public void test3()
	{
		System.out.println("checking groups");
	}


}
