/**
 * 
 */
package testcases;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
/**
 * @author Dhruv
 *
 */
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener,IExecutionListener {

	
	int endtime;
	int Starttime;
	@Override
	public void onFinish(ITestContext context) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Onstart" +context.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on test method " +  getTestMethodName(result) + " success");
	}

	private static String getTestMethodName(ITestResult result) {
		
		        return result.getMethod().getConstructorOrMethod().getName();
		
		    }

	@Override
	public void onExecutionFinish() {
		
		 endtime = (int) System.currentTimeMillis();
		 int duration = endtime - Starttime;
		 System.out.println("duration"+duration);
	}

	@Override
	public void onExecutionStart() {
		System.out.println("ExecutionStarttime"+System.currentTimeMillis());
		Starttime =(int) System.currentTimeMillis();
	}

}
