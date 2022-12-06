package pageFactoryPkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class BlogsPage extends MainClass{
	
	@FindBy(xpath="//ul[@class=\"gva-nav-menu gva-main-menu\"]/li[6]")
	WebElement BlogsLink;
	
	@FindBy(xpath="//article[@id=\"post-12352\"]/div[2]/div[2]/a")
	WebElement ReadMoreBtn;
	
	@FindBy(xpath="//h1[@class=\"entry-title\"]")
	WebElement Articledetails;
	
	@FindBy(xpath="//a[@title=\"Very good - 4 stars\"]")
	WebElement StarRating;
	
	@FindBy(xpath="//textarea[@id=\"comment\"]")
	WebElement Comment;	
	
	@FindBy(xpath="//input[@id=\"author\"]")
	WebElement Name;
	
	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement Email;
	
	@FindBy(xpath="//input[@value=\"Post Comment\"]")
	WebElement PostCommentBtn;
	
	@FindBy(xpath="//div[@class=\"wp-die-message\"]")
	WebElement ErrMsg;
	
	@FindBy(xpath="//div[@class=\"comment-box media-comment-body\"]")
	WebElement CommentsPosted;
	
	@FindBy(xpath="(//div[@class=\"login-register\"])[2]")
	WebElement LogInLink;
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(name="rememberme")
	WebElement ChechBox;
	
	@FindBy(xpath="(//*[@type=\"submit\"])[2]")
	WebElement LogInBtn;
	
    
	public  BlogsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String ClickingOnBlogsLink() {

         BlogsLink.click();
         return driver.getTitle();
	}
	
	public boolean ClickingOnReadMore() {
		ReadMoreBtn.click();
		return Articledetails.isDisplayed();
		
	}
	
	public void ScrollDownTheBlog() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
	
	public void LeavingStarRating() {
		StarRating.click();
	}
	
	public void LeavingComment(String Comments) {
		Comment.sendKeys(Comments);
	
}
	
	public void EnteringName(String name) {
		Name.sendKeys(name);
		
	}	
	
	public void EnteringEmail(String email) {
		Email.sendKeys(email);
		
	}
	
	public void PostingCommentBtn() {
		PostCommentBtn.click();
		
	}
	
	public boolean CommentsPostedAppear() {
		return CommentsPosted.isDisplayed();
		
	}
	
public boolean validateErrMsg() {
		
		return ErrMsg.isDisplayed();
	}
public void CickLogInlink() {
	LogInLink.click();	
}

public void EnterUserName(String username) {
	UserName.sendKeys(username);
}

public void EnterPassword(String password) {
	Password.sendKeys(password);
}

public void CickremembermeChechBox() {
	ChechBox.click();	
}

public void CickLogInBtn() {
	LogInBtn.click();	
}
		
	
}
