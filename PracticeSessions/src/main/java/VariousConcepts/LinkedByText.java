package VariousConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedByText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementByLinkText("Gmail");
		System.out.println("Gmail Selected Successfully");
		driver.close();
		System.out.println("Browser closed successfully");
	}

}
