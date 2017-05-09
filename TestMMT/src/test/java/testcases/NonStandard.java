package testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NonStandard {
	 private static final String CLASS_NAME = "test.sample.Sample2"; 
	 private List<Integer> allTheValues;
	  @BeforeClass(alwaysRun=true)
	    @SuppressWarnings("unchecked")
	    public void fetchData(ITestContext ctx) {
	        allTheValues = (List<Integer>) ctx.getAttribute(Gentest.MY_ATTRIBUTE);
	        System.out.println("allTheValues in NonStandard class"+allTheValues);
	    }
	  @Test(groups = { "sites" }) 
	  public void includeMethodsOnly() 
	  {
		 Assert.assertEquals(allTheValues.contains(3), true,"pass");
		 Assert.assertEquals(allTheValues.contains(7), true,"pass");
	 /*   addClass(CLASS_NAME); 
	    assert 1 == getTest().getXmlClasses().size(); 
	    addIncludedMethod(CLASS_NAME, ".*method2"); 
	    run(); */
	    String[] passed = { 
	      "method2", 
	    }; 
	    String[] failed = { 
	    }; 
	    //verifyTests("Passed", passed, getPassedTests()); 
	    //verifyTests("Failed", failed, getFailedTests()); 
	  } 
	   
/*

	@Test(groups = { "current" }) 
	  public void excludeMethodsOnly() { 
	    addClass(CLASS_NAME); 
	    assert 1 == getTest().getXmlClasses().size(); 
	    addExcludedMethod(CLASS_NAME, ".*method2"); 
	    run(); 
	    String[] passed = { 
	      "method1", "method3" 
	    }; 
	    String[] failed = { 
	    }; 
	    verifyTests("Passed", passed, getPassedTests()); 
	    verifyTests("Failed", failed, getFailedTests()); 
	  } 
	   
	  @Test 
	  public void excludePackage() { 
	    addClass(CLASS_NAME); 
	    assert 1 == getTest().getXmlClasses().size(); 
	    addExcludedMethod(CLASS_NAME, ".*"); 
	    run(); 
	    String[] passed = { 
	    }; 
	    String[] failed = { 
	    }; 
	    verifyTests("Passed", passed, getPassedTests()); 
	    verifyTests("Failed", failed, getFailedTests()); 
	  } */
}
