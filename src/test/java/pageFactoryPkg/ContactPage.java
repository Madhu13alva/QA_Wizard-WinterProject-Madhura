package pageFactoryPkg;

//import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

import basePkg.MainClass;

public class ContactPage extends MainClass{

	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="last_name")
	WebElement LastName;
	
	@FindBy(name="email")
	WebElement EmailId;
	
	@FindBy(id="phone")
	WebElement CellPhone;
	
	@FindBy(xpath="//li[@tabindex='-1']")
	WebElement Country;
	
	@FindBy(name="state")
	WebElement State;
	
     @FindBy(xpath="//input[@value=\"Full-Stack QA Engineering\"]")
    WebElement Courses;
     
     @FindBy(xpath="//input[@id=\"BJOvZQK6Tz4YgfzXTZZe\"]")
     WebElement Message;
     
	
	public ContactPage( ) {
	PageFactory.initElements(driver, this);
	}
	
	public void EnterFirstName(String firstname) {
		FirstName.sendKeys(firstname);
		
	}
	
	public void EnterLastName(String lastname) {
		LastName.sendKeys(lastname);
		
	}
	
	public void EnterEmailId(String emailid) {
		EmailId.sendKeys(emailid);
		
	}
	
	public void EnterCellPhone(String cellphone) {
		CellPhone.sendKeys(cellphone);
		
	}
	 
	public void EnterState(String state1) {
		State.sendKeys(state1);
		
	}
	
//	public void getDropdownOption_Country() {
//		Select cdw = new Select(Country);
//		List<WebElement> list_webElement_Country = cdw.getOptions();
//	
//		
//	}
//	
//	public void selectCheckboxes(List<WebElement> element, String checks) {
//		String[] checksArray = checks.split(",");
//		for(String str : checksArray) {
//		for(WebElement ele : element) {
//		if(ele.getText().equalsIgnoreCase(str))	{
//			ele.click();
//			break;
//		}
//		}
//		}
		
		public void EnterCourse(String courses) {
			Courses.sendKeys(courses);
			
		}
		
	
	
	
	 public void EnterTextMessage(String message) {
		 Message.sendKeys(message);
		 
	 }
	
	}
	


