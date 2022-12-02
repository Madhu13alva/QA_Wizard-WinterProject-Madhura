package stepDefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePkg.MainClass;

public class ErrorMessage extends MainClass{
	
	@FindBy(xpath="//div[@id=\"error-container\"]")
	WebElement FirstNameErrMsg;

 public Boolean validateFirstNameErrorMsg() {
		
		return FirstNameErrMsg.isDisplayed();
	}
}
