package pageFactoryPkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class HomePage extends MainClass{
	
	
	
	@FindBy(xpath="//button[@class=\"btn btn-dark\"]")
	WebElement SubmitBtn;
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public void hittingEnterKey() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).build().perform();
		
	}
	
	public String returnHomePageTitle() {
		return driver.getTitle();
		
	}
	
	
	
	public void SubmitBtn() {
		SubmitBtn.click();
		
	}
	
	
	
	}




