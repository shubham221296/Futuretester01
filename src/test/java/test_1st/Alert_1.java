package test_1st;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Alert_1  extends BaseClass_a1{

	@Test
	public void t1 () {
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt1=driver.switchTo().alert();
		alt1.getText();
		System.out.println(alt1.getText());
		
		
	//	https://demo.guru99.com/test/delete_customer.php
		
		alt1.accept();
		alt1.accept();
		
	}
	
}
