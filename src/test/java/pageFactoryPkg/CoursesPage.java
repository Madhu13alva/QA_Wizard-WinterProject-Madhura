package pageFactoryPkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePkg.MainClass;

public class CoursesPage extends MainClass {

	@FindBy(xpath = "//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[3]")
	WebElement CoursesLink;

	@FindBy(xpath = "//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[3]/ul")
	WebElement DropDownValues;

	@FindBy(xpath = "//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[3]/ul/li[1]/a")
	WebElement QAEngineeringCourse;

	@FindBy(xpath = "//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[3]/ul/li[2]/a")
	WebElement BusinessAnalystCourse;

	@FindBy(xpath = "//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[3]/ul/li[3]")
	WebElement MasterEthicalHacking;

	@FindBy(xpath = "//input[@name=\"first_name\"]")
	WebElement firstName;

	@FindBy(xpath = "//input[@name=\"last_name\"]")
	WebElement lastName;

	@FindBy(xpath = "//input[@name=\"email\"]")
	WebElement email;

	@FindBy(xpath = "//input[@name=\"phone\"]")
	WebElement phone;

	@FindBy(xpath = "//input[@name=\"state\"]")
	WebElement state;

	@FindBy(xpath = "//input[@name=\"BJOvZQK6Tz4YgfzXTZZe\"]")
	WebElement message;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement SubmitBtn;
	
	@FindBy(xpath="//div[@id=\"error-container\"]")
	WebElement ErrMsg;
	
	@FindBy(xpath="//div[@data-id=\"c892869\"]")
	WebElement QACourseOutline;
	
	@FindBy(xpath="//div[@class=\"elementor-tab-title elementor-active\"]")
	WebElement CoursesOjective;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1471\"]")
	WebElement ContentsOfCoursesOjective;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1472\"]")
	WebElement CourseDuration;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1472\"]")
	WebElement ContentsOfCourseDuration;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1473\"]")
	WebElement ClassScdeule;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1473\"]")
	WebElement ContentsClassScdeule;
	
	@FindBy(xpath="//div[@data-id=\"96675fc\"]")
	WebElement MasterEthicalHackingCourseOutline;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1891\"]")
	WebElement MasterEthicalHackingCoursesOjective;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1891\"]")
	WebElement ContentsOfMasterEthicalHackingCoursesOjective;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1892\"]")
	WebElement MasterEthicalHackingCourseDuration;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1892\"]")
	WebElement ContentsOfMasterEthicalHackingCourseDuration;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1893\"]")
	WebElement MasterEthicalHackingClassScdeule;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1893\"]")
	WebElement ContentsOfMasterEthicalHackingClassScdeule;
	
	@FindBy(xpath="//div[@data-id=\"96675fc\"]")
	WebElement BusinessAnalystCourseOutline;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1251\"]")
	WebElement BusinessAnalystCoursesOjective;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1251\"]")
	WebElement ContentsOfBusinessAnalystCoursesOjective;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1252\"]")
	WebElement BusinessAnalystCourseDuration;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1252\"]")
	WebElement ContentsOfBusinessAnalystCourseDuration;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-title-1253\"]")
	WebElement BusinessAnalystClassScdeule;
	
	@FindBy(xpath="//div[@id=\"elementor-tab-content-1253\"]")
	WebElement ContentsOfBusinessAnalystClassScdeule;
	
	public CoursesPage() {
		PageFactory.initElements(driver, this);
	}

	public void CheckingCoursesLink() {

		CoursesLink.click();

		Assert.assertTrue(DropDownValues.getSize().height > 0);
	}

	public String ClickingOnQAEngineeringCourse() {
		QAEngineeringCourse.click();
		return driver.getTitle();

	}

	public String ClickingOnBusinessAnalystCourse() {
		CoursesLink.click();
		BusinessAnalystCourse.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();

	}

	public String ClickingOnMasterEthicalHacking() {
		CoursesLink.click();
		MasterEthicalHacking.click();
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();

	}

	public void SwitchingToIframes() {
		driver.switchTo().frame("aHkcZ5c8jXlGK4QG6FAs");

	}

	public void EnterFirstName(String Firstname) {
		firstName.sendKeys(Firstname);

	}

	public void EnterLastName(String Lastname) {
		lastName.sendKeys(Lastname);

	}

	public void EnterEmail(String Email) {
		email.sendKeys(Email);

	}

	public void EnterPhone(String Phoneno) {
		phone.sendKeys(Phoneno);

	}

	public void EnterState(String StateName) {
		state.sendKeys(StateName);

	}

	public void EnterMessage(String messagehere) {
		message.sendKeys(messagehere);

	}

	public void ClickSubmitBtn() {
		SubmitBtn.click();

	}
	
public boolean validateEmailErrMsg() {
		
		return ErrMsg.isDisplayed();
	}

public void ScrollDownThePageForMasterEthicalHacking() {
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
}

public boolean ClicksOnCoursesOjective() {
	CoursesOjective.click();
	return ContentsOfCoursesOjective.isDisplayed();
	
}

public boolean ClicksOnCourseDuration() {
	CourseDuration.click();
	return ContentsOfCourseDuration.isDisplayed();
	
}

public boolean ClicksOnClassScdeule() {
	ClassScdeule.click();
	return ContentsClassScdeule.isDisplayed();
	
}

public void ScrollDownThePage() {
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	
	
}

public boolean ClicksOnCoursesOjectiveMasterEthicalHacking() {
	MasterEthicalHackingCoursesOjective.click();
	return ContentsOfMasterEthicalHackingCoursesOjective.isDisplayed();
	
}

public boolean ClicksOnCourseDurationMasterEthicalHacking() {
	MasterEthicalHackingCourseDuration.click();
	return ContentsOfMasterEthicalHackingCourseDuration.isDisplayed();
	
}

public boolean ClicksOnClassScdeuleMasterEthicalHacking() {
	MasterEthicalHackingClassScdeule.click();
	return ContentsOfMasterEthicalHackingClassScdeule.isDisplayed();
	
}

public void ScrollDownThePageBusinessAnalyst() {
	Actions action = new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	
	
}

public boolean ClicksOnCoursesOjectiveBusinessAnalyst() {
	BusinessAnalystCoursesOjective.click();
	return ContentsOfBusinessAnalystCoursesOjective.isDisplayed();
	
}

public boolean ClicksOnCourseDurationBusinessAnalyst() {
	BusinessAnalystCourseDuration.click();
	return ContentsOfBusinessAnalystCourseDuration.isDisplayed();
	
}

public boolean ClicksOnClassScdeuleBusinessAnalyst() {
	BusinessAnalystClassScdeule.click();
	return ContentsOfBusinessAnalystClassScdeule.isDisplayed();
	
}

}
