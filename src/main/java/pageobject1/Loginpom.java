package pageobject1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	
	@FindBy(how=How.XPATH,using="//a[text()='Forgotten account?']")private WebElement lk_forgetp;
	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement txt_email;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")private WebElement txt_passw;
	@FindBy(how=How.XPATH,using="//button[@name='login']")private WebElement btn_login;
	@FindBy(how=How.XPATH,using="//a[text()='Sign up for Facebook']")private WebElement lk_signupp;
	public WebElement getLk_forgetp() {
		return lk_forgetp;
	}
	
	public WebElement getTxt_email() {
		return txt_email;
	}
	
	public WebElement getTxt_passw() {
		return txt_passw;
	}
	
	public WebElement getBtn_login() {
		return btn_login;
	}
	
	public WebElement getLk_signupp() {
		return lk_signupp;
	}
	
}
