package stepDefinition;

import org.junit.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.SuccessStoriesPage;

public class SuccessStoreisWin extends MainClass {

	SuccessStoriesPage sp = new SuccessStoriesPage();
	HomePage hp = new HomePage();
	
	@Given("user types in websit URL and come to {string}")
	public void user_types_in_websit_url_and_come_to(String Homepage) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(Homepage));
	    
	}

	@And("user clicks on about us and gets drop down menu and clicks on success stories")
	public void user_clicks_on_about_us_and_gets_drop_down_menu_and_clicks_on_success_stories() {
		sp.HoverinMouseOnAboutUS();
		sp.ClickingOnAbotUsSuccessStories();
	    
	}
     
	@When("user clicks on working success stories")
	public void user_clicks_on_working_success_stories() {
	    sp.ClickingOnLinkOfUserSuccessStory(); 
	}

	

	
	
	

	
}
