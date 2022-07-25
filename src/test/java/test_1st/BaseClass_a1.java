package test_1st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_a1 {
	WebDriver driver;
	
	@BeforeMethod 
	public void bf() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
	}
	
	@AfterMethod
	public void af() {
		
	//	driver.close();
	}
}
