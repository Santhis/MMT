/**
 * 
 */
package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

/**
 * @author Santhi
 *
 */
public  class Basetest  {
	
	private String className;
	
	public void open_browser()
	{
		
	}
	public void close_browser()
	{
		
	}

	public void dataopen() {
		
	}
	// @BeforeClass
     public void setupClassName(ITestContext context) {
         String testName = context.getCurrentXmlTest().getName();
         System.out.println("Before Class TestName"+testName);
         String suiteName = context.getCurrentXmlTest().getSuite().getName();
         System.out.println("Before Class SuiteName"+suiteName);
         //this.className = "[" + suiteName + "," + testName + "]";
     }
     
     @DataProvider(name = "test1")
     public Object[][] createData1(ITestContext ct) {
      return new Object[][] {
        { "Cedric", new Integer(36) },
        { "Anne", new Integer(37)},
      };
     }

	 private void addTest(Map<String, List<ITestResult>> tests, ITestResult t)
	 { 
		    List<ITestResult> l= tests.get(t.getMethod().getMethodName()); 
		    if(null == l) { 
		      l= new ArrayList<ITestResult>(); 
		      tests.put(t.getMethod().getMethodName(), l); 
		    } 
		    l.add(t); 
		  } 
	
}
