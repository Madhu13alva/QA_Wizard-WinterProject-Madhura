package stepDefinition;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;
import pageFactoryPkg.LogInPage;

public class LoginFunctionalityWin extends MainClass {
	
	HomePage hp = new HomePage();
	LogInPage lp = new LogInPage();
	
	@Given("user in Transfotech Academy {string}")
	public void user_in_transfotech_academy(String Homepage) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(Homepage));
	    
	}

	@And("user clicks on login\\/register on top right of homepage")
	public void user_clicks_on_login_register_on_top_right_of_homepage() {
		lp.CickLogInlink();
	    
	}

	@When("user types in {string} and {string}")
	public void user_types_in_and(String username, String password) {
		lp.EnterUserName(username);
		lp.EnterPassword(password);
		lp.CickremembermeChechBox();
		
	    
	}

	@And("clicks login")
	public void clicks_login() {
		lp.CickLogInBtn();
	   
	}

	@And("user exits out of browser")
	public void user_exits_out_of_browser() {
	    
	}


}
