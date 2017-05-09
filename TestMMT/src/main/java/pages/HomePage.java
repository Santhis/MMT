package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public HomePage verify_login(String username,String password)
	{
		String str="";
		System.out.println("Inside Homepage verify_login");
		return this;
	}
	
	public HomePage set_customer(String cust_name)
	{
		System.out.println("Inside Homepage set customer");
		return this;
	}

	private MainPage create_project(String project_name)
	{
		System.out.println("Inside Homepage create_project");
		return new MainPage(driver);
	
	}
	
}
