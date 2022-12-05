package stepDefinition;



import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.ContactPage;
import pageFactoryPkg.HomePage;

public class ContactUsWin extends MainClass {
	
	String partialHomePageTitle = "Transfotech ";


	HomePage hp = new HomePage();
	ContactPage cp = new ContactPage();
	

	@Given("user is in the Transfotech Homepage")
	public void user_is_in_the_transfotech_homepage() {
		Assert.assertTrue(hp.returnHomePageTitle().contains(partialHomePageTitle));

	}

	@And("user clicks on Contact Us Link")
	public void user_clicks_on_contact_us_link() {
      cp.SwitchingToIframes();

	}

	@When("user gives valid {string}")
	public void user_gives_valid(String FirstName) {
		cp.EnterFirstName(FirstName);
		

	}

	@And("user gives a valid {string}")
	public void user_gives_a_valid(String LastName) {
		cp.EnterLastName(LastName);

	}

	@And("user types in valid {string}")
	public void user_types_in_valid_email_id(String EmailID) {
		cp.EnterEmailId(EmailID);

	}

	@Then("user puts valid {string} no with respect to countries in the drop down")
	public void user_puts_valid_no_with_respect_to_countries_in_the_drop_down(String Cellphone) {
		cp.EnterCellPhone(Cellphone);

	}

	@And("user enters valid {string}")
	public void user_enters_valid(String State) {
		cp.EnterState(State);

	}

	@And("user selects the required Course from the check box")
	public void user_selects_the_required_course_from_the_check_box() {
		cp.SelectCourse();

	}

	@And("user can type their {string} in the message text box")
	public void user_can_type_their_in_the_message_text_box(String Message) {
		cp.EnterTextMessage(Message);

	}

	@Then("user clicks submit button")
	public void user_clicks_submit_button() {
		cp.SubmitBtn();

	}

	@And("the details should be Submitted")
	public void the_details_should_be_submitted() {

		Assert.assertTrue(hp.returnHomePageTitle().contains(partialHomePageTitle));

	}

	@When("user leaves {string} text box blank")
	public void user_leaves_text_box_blank(String FirstName) {
		cp.EnterFirstName(FirstName);
	}

	@Then("a error message should be displayed below First Name field")
	public void a_error_message_should_be_displayed_below_first_name_text_box() {
		Assert.assertTrue(cp.validateFirstNameErrorMsg());
	}

	@Then("user gives {string} no with respect to countries in the drop down")
	public void user_gives_no_with_respect_to_countries_in_the_drop_down(String invalidCellPhone) {
		cp.EnterCellPhone(invalidCellPhone);

	}

	@Then("a error message should be displayed below Cell Phone field")
	public void a_error_message_should_be_displayed_below_cell_phone_field() {

		Assert.assertTrue(cp.validateCellPhoneErrMsg());

	}

	@When("user types in {string}")
	public void user_types_in(String InvalidEmailID) {
		cp.EnterEmailId(InvalidEmailID);

	}

	@Then("a error message should be displayed below Email ID field")
	public void a_error_message_should_be_displayed_below_email_id_field() {
     Assert.assertTrue(cp.validateEmailErrMsg());

	}

	
	@Then("user clicks on the drop down text box in Cell phone")
	public void user_clicks_on_the_drop_down_text_box_in_cell_phone() {
		cp.SelectDropDownArrowforCountries();
		
	    
	}
	@And("user selects country of choice")
	public void user_selects_country_of_choice (){
	  Assert.assertTrue(cp.validateCountrySelected());

	
	}
	
	@Then("user selects all the course from the check box")
	public void user_selects_all_the_course_from_the_check_box() {
		cp.SelecteingaAllTheCourse();
	   
	}

}
