package pageFactoryPkg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class SearchResultPage extends MainClass{
	@FindBy(xpath="//div[@class = 'a-row']/span[1]")
	WebElement noResultErrMsg;

	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateVisibilityOfNoResultErrorMsg() {
		return noResultErrMsg.isDisplayed();
	}
	 public String searchResultPageTitle() {
		 return driver.getTitle();
	 }
}

