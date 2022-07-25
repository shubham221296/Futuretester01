package test_1st;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.utility.RandomString;

public class ssMethod {
	
	
	public static void Screenshot(WebDriver driver) throws IOException {
	String rm=RandomString.make(5);
	String path="C:\\Users\\shubh\\eclipse-workspace\\Semi_finalMav\\ScreenShot";
	TakesScreenshot ts1=(TakesScreenshot) driver;
	File From=ts1.getScreenshotAs(OutputType.FILE);
	File Where=new File(path+"\\"+rm+".png");
	FileUtils.copyFile(From, Where);
	}
}
