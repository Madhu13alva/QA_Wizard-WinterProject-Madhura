package pageFactoryPkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class GoogleReviewPage extends MainClass {
	
	@FindBy(xpath="//span[text()=\"View Our All Review\"]")
	WebElement ViewAllReviews;
	
	@FindBy(xpath="//div[@class=\"ti-reviews-container-wrapper\"]/div[3]")
    WebElement Reveiw;
	
	@FindBy(xpath="//span[text()=\"44 reviews\"]")
	WebElement GoogleMapReveiw;
	
	@FindBy(xpath="//div[@class=\"TIHn2\"]")
	WebElement Googlelocation;
			
	
	public GoogleReviewPage() {
		PageFactory.initElements(driver, this);
	}

	public void ScrollDownHomePage() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
	
	public void ClickingOnViewALLReviews()  {
		ViewAllReviews.click();
		
	}
	
	public void checkingReveiw()  {
		Reveiw.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).build().perform();
		
	}
	
	public void CheckGoogleMapReveiw() {
		
		
		GoogleMapReveiw.click();
		driver.close();
		
		
		
	}
	
	
}
