package stepDefinition;

import org.junit.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.AboutUsPage;
import pageFactoryPkg.HomePage;

public class AboutUsWin extends MainClass{
	
	AboutUsPage ap = new AboutUsPage();
	HomePage hp = new HomePage();
	
	@Given("user load the {string}")
	public void user_load_(String Application) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(Application));
	    
	}

	@When("user mouse hover the About us")
	public void user_mouse_hover_the_about_us() {
		ap.HoverinMouseOnAboutUS();
		
	    
	}

	@Then("user move to success stories and click on {string}")
	public void user_move_to_success_stories_and_click_on(String SuccessStories) {
		
		Assert.assertTrue(ap.ClickingOnSucessstories().contains(SuccessStories));
		
	   
	}

}
