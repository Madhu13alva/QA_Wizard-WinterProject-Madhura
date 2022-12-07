package stepDefinition;

import org.junit.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.BlogsPage;
import pageFactoryPkg.HomePage;

public class BlogsWin extends MainClass {
	
	HomePage hp = new HomePage();
	BlogsPage bp = new BlogsPage();
	
	@Given("user is on transfotech {string}")
	public void user_is_on_transfotech(String homepage) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(homepage));
	    
	}

	@When("user clicks on the {string} link")
	public void user_clicks_on_the_link(String blogs) {
		Assert.assertTrue(bp.ClickingOnBlogsLink().contains(blogs));
	    
	}

	@Then("User clicks on the read more button of any of article posted")
	public void user_clicks_on_the_read_more_button_of_any_of_article_posted() {
		bp.ClickingOnReadMore();
	    
	}
	
	@And("User scrolls down the page to see Rate and Comment option")
	public void user_scrolls_down_the_page_to_see_rate_and_comment_option() {
		bp.ScrollDownTheBlog();
	    
	}

	@And("user is allowed to give star Rating and {string}")
	public void user_is_allowed_to_give_star_rating_and_(String comment) {
	    bp.LeavingStarRating();
	    bp.LeavingComment(comment);
		
	}

	@Then("user leaves details required field like {string} and {string} blank")
	public void user_leaves_details_required_field_like_and_blank(String name, String email) {
		bp.EnteringName(name);
		bp.EnteringEmail(email);
	   
		
	}
	
	@Then("user clicks on post comments button and page refreshed and comments are posted")
	public void user_clicks_on_post_comments_button_and_page_refreshed_and_comments_are_posted() {
		bp.PostingCommentBtn();
		bp.CommentsPostedAppear();
		
	}

	@Then("user clicks on post comments button and error message is displayed")
	public void user_clicks_on_post_comments_button_and_error_message_is_displayed() {
		bp.PostingCommentBtn();
		Assert.assertTrue(bp.validateErrMsg());
	    

	}
   
	@Then("user enter required information like {string} and {string}")
	public void user_enter_required_information_like_and(String name, String email) {
		bp.EnteringName(name);
		bp.EnteringEmail(email);
	}
	
	@And("user clicks on login on top right of homepage")
	public void user_clicks_on_login_register_on_top_right_of_homepage() {
		bp.CickLogInlink();
	    
	}

	@When("user types in a {string} and {string}")
	public void user_types_in_a_and(String username, String password) {
		bp.EnterUserName(username);
		bp.EnterPassword(password);
		bp.CickremembermeChechBox();
		
	    
	}

	@And("clicks the login")
	public void clicks_the_login() throws InterruptedException {
		bp.CickLogInBtn();
		
		
		
	   
	}
	
	
	
}
