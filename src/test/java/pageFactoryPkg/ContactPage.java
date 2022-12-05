package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePkg.MainClass;



public class ContactPage extends MainClass {
	
	@FindBy(xpath="//button[@class=\"btn btn-dark\"]")
	WebElement SubmitBtn;
	
	@FindBy(linkText="Contact Us")
	WebElement ContactUsLink;

	@FindBy(id = "first_name")
	WebElement FirstName;

	@FindBy(id = "last_name")
	WebElement LastName;

	@FindBy(name = "email")
	WebElement EmailId;

	@FindBy(id = "phone")
	WebElement CellPhone;

	@FindBy(xpath = "//div[@aria-controls=\"iti-1__country-listbox\"]")
	WebElement DropDownArrowforCountries;
	
	@FindBy(xpath="//ul[@id=\"iti-1__country-listbox\"]/li[13]")
	WebElement CountrySelected;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(xpath = "//input[@value=\"Full-Stack QA Engineering\"]")
	WebElement Course1;
	
	@FindBy(xpath = "//input[@value=\"Business Analyst\"]")
	WebElement Course2;
	
	@FindBy(xpath = "//input[@value=\"Master Ethical Hacking\"]")
	WebElement Course3;
	
	@FindBy(xpath = "//input[@value=\"Salesforce Admin and Development\"]")
	WebElement Course4;
	
    @FindBy(xpath = "//input[@id=\"BJOvZQK6Tz4YgfzXTZZe\"]")
	WebElement Message;
    
    @FindBy(xpath="//input[@id='first_name']/following-sibling::div")
	WebElement FirstNameErrMsg;
	
	@FindBy(xpath="//div[@id=\"error-container\"]")
	WebElement CellPhoneErrMsg;
	
	@FindBy(xpath="//input[@name=\"email\"]/following-sibling::div")
	WebElement EmailErrMsg;
	
	

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ContactUsLink() {
		ContactUsLink.click();
		}
	
	public void SubmitBtn() {
		SubmitBtn.click();
		
	}

	public void EnterFirstName(String firstname) {
		FirstName.sendKeys(firstname);

	}

	public void EnterLastName(String lastname) {
		LastName.sendKeys(lastname);

	}

	public void EnterEmailId(String emailid) {
		EmailId.sendKeys(emailid);

	}

	public void EnterCellPhone(String cellphone) {
		CellPhone.sendKeys(cellphone);

	}

	public void EnterState(String state1) {
		State.sendKeys(state1);

	}
	
	

	public void SelectDropDownArrowforCountries() {
		DropDownArrowforCountries.click();
	}



	public boolean validateCountrySelected() {
		

		return CountrySelected.isDisplayed();
	}



	public void SelectCourse (){
		Course1.click();
		
	
	}

	public void EnterTextMessage(String message) {
		Message.sendKeys(message);

	}
	
	public void SelecteingaAllTheCourse() {
		Course1.click();
		Course2.click();
		Course3.click();
		Course4.click();
		
		
	}
	
public void SwitchingToIframes(){
		
		ContactUsLink();
		driver.switchTo().frame("xuTWKRgptnL4d4kHBm5l");
		
	}
	public void SwitchingToMainFrames(){
		driver.switchTo().defaultContent();
	}
	
public boolean validateFirstNameErrorMsg() {
		
		return FirstNameErrMsg.isDisplayed();
	}
 
 public boolean validateCellPhoneErrMsg() {
		
		return CellPhoneErrMsg.isDisplayed();
	}
 
 public boolean validateEmailErrMsg() {
		
		return EmailErrMsg.isDisplayed();
	}

}


