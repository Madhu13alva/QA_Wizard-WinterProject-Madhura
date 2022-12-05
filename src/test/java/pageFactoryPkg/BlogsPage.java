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

		
	
}
