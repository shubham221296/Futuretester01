package test_1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_downSelect {
	
	@Test
	public void t1() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();

	WebElement count=driver.findElement(By.xpath("//select[@name='country']"));
	Select sel1=new Select(count);
	System.out.println(sel1.getFirstSelectedOption().getText());
	
	sel1.selectByVisibleText("CAMEROON");
	sel1.selectByValue("CANADA");
	sel1.selectByVisibleText("CAPE VERDE");
	
	List<WebElement> lst=sel1.getOptions();
	
	 for(int i=0;i<=lst.size();i++) {
		String value=lst.get(i).getText();
		System.out.println(value);
		
		if(value.equals("ARUBA")) {
			sel1.selectByVisibleText("ARUBA");
			break;
			
		}
	}
	
	
	}
}
