package testcases;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.HomePage;

public class Gentest  extends Basetest
{
	  public static final String MY_ATTRIBUTE = "sumOfValues";
	    private List<Integer> sumValue;
	 
	    @AfterClass(alwaysRun = true)
	    public void insertValueIntoAttribute(ITestContext ctx) {
	        ctx.setAttribute(MY_ATTRIBUTE, sumValue);
	    }
	 
	    public Gentest() {
	        sumValue = new ArrayList<Integer>();
	    }
	
	//ITestContext ctx ;

	String username="san";
	String password ="pass";
	
	//ExcelTestNGRunner runner = new ExcelTestNGRunner("input.xls");
			
	@Test(groups = "cust",description="Search a customer")
	public void customerSearch()
	{
		// String testName = ctx.getCurrentXmlTest().getName();
        // System.out.println("TestName"+testName);
         //String suiteName = ctx.getCurrentXmlTest().getSuite().getName();
         //System.out.println("suiteName"+suiteName);
		HomePage hp = new HomePage(null);
		hp.verify_login(username,password);
		Assert.assertTrue(true, "User loggedin");
		//System.out.println("Check method name"+this.getClass().getEnclosingMethod());
		Method[] Meth = getClass().getMethods();
		//for (int i= 0 ;i < Meth.length;i++)
		//{
		
		//System.out.println("Inside create"+Thread.currentThread().getStackTrace()[1].getMethodName());
		//}
		//System.out.println("Inside create"+getCurrentMethodName());
	}
/*	public String getCurrentMethodName()
	{
	     StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
	     return stackTraceElements[1].toString();
	}*/
	@Test(groups = "sites")
	public void addProject(ITestContext ctx)
	{
		System.out.println(this.getClass().getFields()+"Inside add");
	}
	
	@Test(groups = "cust")
	public void addAcctmngr()
	{
		System.out.println(this.getClass().getName()+"Inside add");
	}
	
	@Test(groups = "sites")
	public void addSitesMenu(ITestContext ctx)
	{
		// TODO Auto-generated method stub
		
	}
	@Test(groups = "sites")
	public void addSites(ITestContext ctx)
	{
		// TODO Auto-generated method stub
		
	}
	
	@Test(groups = "New")
	public void AddNewNetwork()
	{
		// TODO Auto-generated method stub
		
	}
	

  
	@Test(groups = "sites",dataProvider = "generateNumbers")
	public void ServiceQualification(Integer a, Integer b)
	{
		// TODO Auto-generated method stub
		Assert.assertTrue(a != 0);
		Assert.assertTrue(b != 0);
	        sumValue.add(a + b);
	}
	
	   @DataProvider
	    public Object[][] generateNumbers() {
	        return new Object[][] { { 1, 2 }, { 3, 4 } };
	    }
	
}
	
