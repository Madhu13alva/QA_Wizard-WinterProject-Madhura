package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePkg.MainClass;

public class ServiceProvidedPage extends MainClass {
	
	@FindBy(xpath="(//a[text()=\"Service\"])[2]")
	WebElement ServiceProvided;
	
	@FindBy(xpath="//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[2]/ul[1]")
	WebElement DropDownValues;
	
	@FindBy(xpath="(//a[text()=\"Job Placement\"])[2]")
	WebElement JobPlacement;
	
	@FindBy(xpath="(//a[text()=\"IT Training\"])[2]")
	WebElement ITTraining;
	
  public ServiceProvidedPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void HoverinMouseOnServiceProvided() {

		Actions action = new Actions(driver);
	    action.moveToElement(ServiceProvided).perform();
	}
	    
	public void validateDropDownValues() {
	    Assert.assertTrue(DropDownValues.getSize().height > 0);
	}
	
	public String ClickingOnJobPlacement() {
		JobPlacement.click();
		return driver.getTitle();
	}
	
	public String ClickingOnITTraining() {
		ITTraining.click();
		return driver.getTitle();
		
	}

}
