package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {
	
	
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	WebDriver driver ;

}
