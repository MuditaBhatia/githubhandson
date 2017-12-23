package VariousConcepts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCSignUp {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.findElementByLinkText("Sign up").click();
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("UserNameForTest");
		driver.findElementById("userRegistrationForm:password").sendKeys("testpassword");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("testpassword");
		driver.findElementById("userRegistrationForm:securityQ").click();
		driver.findElementByXPath("//*[@id='userRegistrationForm:securityQ']/option[3]").click();
		Select securityquestion = new Select(driver.findElementById("userRegistrationForm:securityQ"));
		List<WebElement> listofsecques = securityquestion.getOptions();
		System.out.println(listofsecques.size());
		for(WebElement element: listofsecques){
			System.out.println(element.getText());
		}
		Select language = new Select(driver.findElementById("userRegistrationForm:prelan"));
		List<WebElement> preflang = language.getOptions();
		for(WebElement element: preflang){
			System.out.println(element.getText());
		}
		driver.findElementByName("userRegistrationForm:securityAnswer").sendKeys("answer");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("FirstName");
		driver.findElementByName("userRegistrationForm:lastName").sendKeys("LastName");
		driver.findElementById("userRegistrationForm:gender:2").click();
		driver.findElementByName("userRegistrationForm:maritalStatus").click();
		driver.findElementByXPath("//*[@id='userRegistrationForm:occupation']/option[2]").click();
		
		WebElement mycountry = driver.findElementById("userRegistrationForm:countries");
		Select dropdowncountry = new Select(mycountry);
		dropdowncountry.selectByVisibleText("India");
		List<WebElement> listofcountries = dropdowncountry.getOptions();
		for(WebElement element:listofcountries){
			System.out.println(element.getText());
		}
		 
		
		driver.findElementById("userRegistrationForm:email").sendKeys("abs@domain.com");
		driver.findElementByName("userRegistrationForm:mobile").sendKeys("1234567891");
		
		WebElement mycountry2 = driver.findElementById("userRegistrationForm:nationalityId");
		Select dropdowncountry1 = new Select(mycountry2);
		dropdowncountry1.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("address line 1");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600062",Keys.TAB);
		Thread.sleep(3000);
		Select city = new Select(driver.findElementById("userRegistrationForm:cityName"));
		city.selectByIndex(1);
		Thread.sleep(3000);
		
		Select postoffice = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		postoffice.selectByIndex(1);
		List <WebElement> po = postoffice.getOptions();
		for(WebElement element:po){
			System.out.println(element.getText());
		}
		
		driver.findElementByName("userRegistrationForm:landline").sendKeys("9840703381");
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		File imagefile = new File("./Screenshots/CreatedLead.jpg");
		FileUtils.copyFile(srcFile, imagefile);
	
		driver.close();
		driver.quit();
		
	}

}
