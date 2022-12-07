package stepDefinition;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.LocationMapViewerPage;

public class LocationMapCanviewLargerWin extends MainClass {
	
	HomePage hp = new HomePage();
	LocationMapViewerPage lvp = new LocationMapViewerPage();
	
	@Given("user load application browser and he is in {string}")
	public void user_load_application_browser_and_he_is_in(String Transfotech) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(Transfotech));
	    
	}

	

	@When("user click TransfoTech Academy logo User should in {string} homepage")
	public void user_click_transfo_tech_academy_logo_user_should_in_homepage(String Transfotech) {
		Assert.assertTrue(lvp.ClickingOnPageLogo().contains(Transfotech));
	    
	}

	@Then("user scroll down to the bottom of the page")
	public void user_scroll_down_to_the_bottom_of_the_page() {
		lvp.ScrollDownHomePage();
	    
	}

	@And("user click view large map on the top of small map")
	public void user_click_view_large_map_on_the_top_of_small_map() {
		lvp.SwitchingToIframes();
	    
	}


}
