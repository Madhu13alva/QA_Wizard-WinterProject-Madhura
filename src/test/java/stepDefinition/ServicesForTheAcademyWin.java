package stepDefinition;

import org.junit.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.ServiceProvidedPage;

public class ServicesForTheAcademyWin extends MainClass {
	
	HomePage hp = new HomePage();
	ServiceProvidedPage sp = new ServiceProvidedPage();
	
	@Given("user load application {string}")
	public void user_load_application(String transfotech) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(transfotech));
	    
	}

	@When("user mouse hover service")
	public void user_mouse_hover_service() {
		sp.HoverinMouseOnServiceProvided();
		sp.validateDropDownValues();
	    
	}

	@Then("user click first drop down Job Placement button and goes to {string}")
	public void user_click_first_drop_down_job_placement_button_goes_to(String JobPlacementPage) {
	     Assert.assertTrue(sp.ClickingOnJobPlacement().contains(JobPlacementPage));
	    
	}

	@And("user click It Training dropdown  button")
	public void user_click_it_training_dropdown_button() {
		sp.HoverinMouseOnServiceProvided();
		
	   
	}


}
