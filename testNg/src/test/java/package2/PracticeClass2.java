package package2;


import org.testng.annotations.Test;

public class PracticeClass2 {
	
	@Test(groups="regression")
	public void test21()
	{
		System.out.println("Inside Test21");
	}
	
	@Test(groups="regression")
	public void test22()
	{
		System.out.println("Inside Test22");
	}
	
	@Test(groups="sanity")
	public void test23()
	{
		System.out.println("Inside Test23");
	}

	@Test(groups="sanity")
	public void test24()
	{
		System.out.println("Inside Test24");
	}
	
}
