package testc_A2;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageobject1.Loginpom;
import utility.Baseclass_p1;
import utility.Exceldata;
import utility.Library;

public class Verify_test extends Baseclass_p1 {
	
	@Test
	public void tc_001() throws Exception {
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
		Library.custom_senkeys(login.getTxt_email(), Exceldata.getstringdataE("Sheet1", 0, 0));
		Library.custom_senkeys(login.getTxt_passw(), Exceldata.getstringdataE("Sheet1", 0, 1));
	}

}
