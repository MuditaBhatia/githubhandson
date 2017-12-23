package VariousConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElementByPartialLinkText("mail").click();
		Thread.sleep(3000);
		System.out.println("Gmail selected successfully");
		driver.findElementsByName("password");
		driver.manage().window().maximize();
		System.out.println("Window maximised");
		System.out.println("Driver is quit successfully");
	}

}
