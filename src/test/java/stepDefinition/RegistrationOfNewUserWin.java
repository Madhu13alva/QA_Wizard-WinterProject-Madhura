package stepDefinition;

import org.junit.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.RegistrationPage;

public class RegistrationOfNewUserWin extends MainClass{
	
	HomePage hp = new HomePage();
	RegistrationPage rp = new RegistrationPage();
	
	@Given("user load {string}")
	public void user_load_(String Application) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(Application));
	    
	}

	@When("user click Login button")
	public void user_click_login_register_button() {
		rp.ClickingOnRegistrationLink();
	    
	}

	@And("user type user {string}")
	public void user_type_user(String emailaddress) {
		rp.EnteringEmailAddress(emailaddress);
	    
	}

	@Then("user types user {string}")
	public void user_types_user(String name) {
		rp.EnteringUsername(name);
	   
	}

	@And("user type {string}")
	public void user_type(String password) {
		rp.EnteringPassword(password);
	    
	}

	@Then("user type confirm {string}")
	public void user_type_confirm(String password1) {
		rp.EnteringConfirmPassword(password1);
	   
	}

	@And("user type in  {string}")
	public void user_type_in(String firstname) {
		rp.EnteringFirstName(firstname);
	    
	}

	@Then("type their {string}")
	public void type_their(String lastname) {
		rp.EnteringLastName(lastname);
	    
	}

	@And("user then type {string}")
	public void user_then_type(String displayname) {
		rp.EnteringDisplayName(displayname);
	    
	}

	@Then("user click Register button")
	public void user_click_register_button() {
		rp.ClickingOnRegisterButton();
		
	   
	}
	
	@And("{string} page should be displayed")
	public void page_should_be_displayed(String profile) {
		Assert.assertTrue(rp.ValidateRegistration().contains(profile));
	}
	
	@And("It should get error message confirm password doesnt match")
	public void it_should_get_error_message_confirm_password_doesnt_match() {
	    
	}
	
	@And("It should a get massage required field must filled up")
	public void it_should_a_get_massage_required_field_must_filled_up() {
	    
	}

}
