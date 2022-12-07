package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePkg.MainClass;

public class AboutUsPage extends MainClass{
	
	@FindBy(xpath ="(//a[text()='About Us'])[2]")
    WebElement AboutUs;
	
    @FindBy(xpath="//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[1]/ul")
    WebElement DropDownValues;
	
	@FindBy(xpath="(//a[text()='Success Stories'])[2]")
	WebElement SuccessStories;
	
	
	public AboutUsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void HoverinMouseOnAboutUS() {

	Actions action = new Actions(driver);
    action.moveToElement(AboutUs).perform();
    Assert.assertTrue(DropDownValues.getSize().height > 0);
}
	public String ClickingOnSucessstories() {
		SuccessStories.click();
		return driver.getTitle();		
				
		
	}
	
	
}
