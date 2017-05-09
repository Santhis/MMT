package testcases;

 
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Sequencing {
 
		@AfterClass
 
		public void afterClass() {
 
			System.out.println("This will execute after the Class");
 
		}
 
		@AfterSuite
 
		public void afterSuite() {
 
			System.out.println("This will execute after the Test Suite");
 
		}
 
		@AfterTest
 
		public void afterTest() {
 
			System.out.println("This will execute after the Test");
 
		}
 
	/*	@AfterMethod
 
		public void afterMethod() {
 
			System.out.println("This will execute after every Method");
 
		}*/
 
		@BeforeClass
 
		public void beforeClass() {
 
			System.out.println("This will execute before the Class");
 
		}
 
		@BeforeMethod
 
		public void beforeMethod() {
 
			System.out.println("This will execute before every Method");
 
		}
 
		@BeforeSuite
 
		public void beforeSuite() {
 
			System.out.println("This will execute before the Test Suite");
 
		}
 
		@BeforeTest
 
		public void beforeTest() {
 
			System.out.println("This will execute before the Test");
 
		}
 
		@Test
 
		public void testCase1() {
 
			System.out.println("This is the Test Case 1");
 
		}
 
		@Test
 
		public void testCase2() {
 
			System.out.println("This is the Test Case 2");
 
		}
 
	}

