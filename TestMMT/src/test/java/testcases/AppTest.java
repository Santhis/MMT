package testcases;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

/*import junit.framework.TestCase;
import junit.framework.TestSuite;*/

/**
 * Unit test for simple App.
 */
public class AppTest implements ITestListener,IExecutionListener
   // extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test caseprivate long startTime;
     */
/*    public AppTest( String testName )
    {
        //super( testName );
    }*/

    /**
     * @return the suite of tests being tested
     */
   /* public static Test suite()
    {
       // return new TestSuite( AppTest.class );
    }*/

    /**
     * Rigourous Test :-)
     */
	
	private long startTime;

	@Test
    public void testApp()
    {
       // assertTrue( true );
    }

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");
		
	}

	@Override
	public void onExecutionStart() {
		startTime = System.currentTimeMillis();
		        System.out.println("TestNG is going to start");    

		// TODO Auto-generated method stub
		
	}
}
