

import org.testng.annotations.Test;

public class PracticeClass {
	
	@Test(groups="regression")
	public void test1()
	{
		System.out.println("Inside Test1");
	}
	
	@Test(groups="regression")
	public void test2()
	{
		System.out.println("Inside Test2");
	}
	
	@Test(groups="sanity")
	public void test3()
	{
		System.out.println("Inside Test3");
	}

	@Test(groups="sanity")
	public void test41()
	{
		System.out.println("Inside Test41");
	}
	
}
