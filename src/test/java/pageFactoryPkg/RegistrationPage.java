package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class RegistrationPage extends MainClass {
	
	@FindBy(xpath="//div[@class=\"gva-user  text-center\"]/div/a")
    WebElement RegistrationLink;
	
	@FindBy(id="reg_email")
	WebElement EmailAddress;
	
	@FindBy(id="reg_username")
	WebElement Username;
	
	@FindBy(id="reg_password")
	WebElement Password;
	
	@FindBy(id="reg_password2")
	WebElement ConfirmPassword;
	
	@FindBy(id="reg_first_name")
	WebElement FirstName;
	
	@FindBy(id="reg_last_name")
	WebElement LastName;
	
	@FindBy(id="reg_display_name")
	WebElement DisplayName;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")
	WebElement RegisterButton;
	
	
	
	
	
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickingOnRegistrationLink()  {
		RegistrationLink.click();
	}
	
	public void EnteringEmailAddress(String emailaddress1) {
		EmailAddress.sendKeys(emailaddress1);
	}
	
	public void EnteringUsername (String username1) {
		Username.sendKeys(username1);
	}
	
	public void EnteringPassword (String password1) {
		Password.sendKeys(password1);
	}
	
	public void EnteringConfirmPassword (String confirmpassword1) {
		ConfirmPassword.sendKeys(confirmpassword1);
	}
	
	public void EnteringFirstName (String firstname1) {
		FirstName.sendKeys(firstname1);
	}
	
	public void EnteringLastName (String lastname1) {
		LastName.sendKeys(lastname1);
	}
	
	public void EnteringDisplayName (String displayname1) {
		DisplayName.sendKeys(displayname1);
	}
	
	public void ClickingOnRegisterButton()  {
		RegisterButton.click();
	
	}
	public String ValidateRegistration() {
		return driver.getTitle();
	}
	
	
	
	
	

}
