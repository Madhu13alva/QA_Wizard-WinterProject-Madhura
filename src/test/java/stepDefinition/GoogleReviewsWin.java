package stepDefinition;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageFactoryPkg.GoogleReviewPage;
import pageFactoryPkg.HomePage;

public class GoogleReviewsWin extends MainClass {
	
	HomePage hp = new HomePage();
	GoogleReviewPage gp = new GoogleReviewPage();
	
	@Given("user types in website URL of {string}")
	public void user_types_in_website_url_of(String Transfotech) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(Transfotech));
	    
	}

	@And("user scrolls down homepage to google reviews tab")
	public void user_scrolls_down_homepage_to_google_reviews_tab() {
		gp.ScrollDownHomePage();
	    
	}

	@Then("user clicks on view all our reviews tab for google reviews")
	public void user_clicks_on_view_all_our_reviews_tab_for_google_reviews() throws InterruptedException {
		gp.ClickingOnViewALLReviews();
		
	}

	@Then("user uses google reviews scroll option for various reviews")
	public void user_uses_google_reviews_scroll_option_for_various_reviews() {
		gp.checkingReveiw();
	    
	}

	@And("user clicks user views from google maps section")
	public void user_clicks_user_views_from_google_maps_section() {
		gp.CheckGoogleMapReveiw();
		
	    
	}

}
