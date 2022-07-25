package test_1st;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import net.bytebuddy.utility.RandomString;

public class childWindow_han extends BaseClass_a1{

	// https://demo.guru99.com/popup.php
	@Test
	public void t2() throws IOException {
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		String parentadd=driver.getWindowHandle();
		System.out.println(parentadd);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		Set<String> alladd=driver.getWindowHandles();
		System.out.println(alladd);
		Iterator<String> it=alladd.iterator();
		while (it.hasNext()) {
			String childadd=it.next();
			System.out.println(childadd);
			
			if(!parentadd.equals(childadd)) {

				driver.switchTo().window(childadd);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("1233455455454");
				ssMethod.Screenshot(driver);
				driver.close();
			}
		}
		driver.switchTo().window(parentadd);
		driver.quit();
	
	}
	
	
	
	
	
}
