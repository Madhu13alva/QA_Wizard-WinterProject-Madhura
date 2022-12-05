package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class SuccessStoriesPage extends MainClass{
	
	@FindBy(xpath ="(//a[text()='About Us'])[2]")
    WebElement AboutUs;

	@FindBy(xpath="(//a[text()='Success Stories'])[2]")
	WebElement SuccessStories;
	
	@FindBy(xpath="(//div[@class=\"elementor-image-box-wrapper\"])[1]")
	WebElement LinkOfUserSuccessStory;
	
	
	public SuccessStoriesPage() {
		PageFactory.initElements(driver, this);
	}
	public void HoverinMouseOnAboutUS() {

		Actions action = new Actions(driver);
	    action.moveToElement(AboutUs).perform();
	}	
	    
	public void ClickingOnAbotUsSuccessStories() {
		
		SuccessStories.click();
		
	}
	
	public void ClickingOnLinkOfUserSuccessStory() {
		LinkOfUserSuccessStory.click();
		

		
	}
	
	public String ValidateYoutube() {
		return driver.getTitle();
	}

}
