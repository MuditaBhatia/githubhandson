package VariousConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBasedActions {

	public static void main(String[] args) {
		//setting the property for driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Indicate the URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
	
		//Key in the Login ID
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Key in the password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//click on login
		driver.findElementByClassName("decorativeSubmit").click();
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
