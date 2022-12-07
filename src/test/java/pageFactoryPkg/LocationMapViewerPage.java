package pageFactoryPkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class LocationMapViewerPage extends MainClass {
	
	@FindBy(xpath="//div[@data-id=\"45ce328f\"]")
	WebElement PageLogo;
	
	@FindBy(xpath="(//a[text()=\"google-maps-link\"])")
	WebElement LargeMapview;
	
	
	public LocationMapViewerPage() {
		PageFactory.initElements(driver, this);
	}

	
	public String ClickingOnPageLogo()  {
		PageLogo.click();
		return driver.getTitle();
	}
	
	public void ScrollDownHomePage() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
	
	public void SwitchingToIframes(){
		driver.switchTo().frame("iFrameResizer1");
		LargeMapview.click();
		
	}
	
	
	
}
