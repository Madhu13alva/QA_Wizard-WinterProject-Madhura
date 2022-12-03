package stepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class ErrorMessage extends MainClass{
	
	@FindBy(xpath="//input[@id='first_name']/following-sibling::div")
	WebElement FirstNameErrMsg;
	
	@FindBy(xpath="//div[@id=\"error-container\"]")
	WebElement CellPhoneErrMsg;
	
	@FindBy(xpath="//input[@name=\"email\"]/following-sibling::div")
	WebElement EmailErrMsg;
	
	public ErrorMessage() {
		PageFactory.initElements(driver,this);
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
