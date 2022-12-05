package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class LogInPage extends MainClass {

	@FindBy(xpath="(//div[@class=\"login-register\"])[2]")
	WebElement LogInLink;
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="rememberme")
	WebElement ChechBox;
	
	@FindBy(xpath="(//*[@type=\"submit\"])[2]")
	WebElement LogInBtn;
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void CickLogInlink() {
		LogInLink.click();	
	}
	
	public void EnterUserName(String username) {
		UserName.sendKeys(username);
	}
    
	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}
	
	public void CickremembermeChechBox() {
		ChechBox.click();	
	}
	
	public void CickLogInBtn() {
		LogInBtn.click();	
	}
	
}
