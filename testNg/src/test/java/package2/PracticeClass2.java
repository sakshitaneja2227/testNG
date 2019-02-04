package package2;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeClass2 {
	
	@Test(groups= {"broken1", "functional"}, dataProvider="dp1")
	public void test21(String str1, String str2)
	{
		System.out.println("Inside Test21 *** "+ str1 + " "+ str2);
	}
	
	@Parameters({"parameter1"})
	@Test(groups= {"broken2", "functional"})
	public void test22(String param1)
	{
		System.out.println("Inside Test22 " + param1 );
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
	
	
	@DataProvider(name="dp1")
	public Object[][] dataproviderMethod()
	{
		 Object [][] data = new Object [2][2];
		 
		 data [0][0] = "FirstUid";
		 data [0][1] = "FirstPWD";
		 
		 data[1][0] = "SecondUid";
		 data[1][1] = "SecondPWD";
		 
		 return data;
	}
}
