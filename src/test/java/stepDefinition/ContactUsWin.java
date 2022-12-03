package stepDefinition;



import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.HomePage;

public class ContactUsWin extends MainClass {
	String firstName = "TesterA";
	String lastName = "TesterB";
	String emailId = "tester@gmail.com";
	String cellPhone = "3456666666L";
	String state = "NJ";
	String courses = "Full-Stack QA Engineering";
	String partialHomePageTitle = "Transfotech ";
	String message = "Hi there";
	String firstName_Blank = "";
	String invalidCellPhoneNumber = "gfg53436776";
	String invalidEmailId = "hjkfhrfj8@#56hh";
	String EmailId_Blank = "";
	String CellPhone_Space = "       ";

	HomePage hp = new HomePage();
	ContactPage cp = new ContactPage();
	SwitchingBetweenframe sbf = new SwitchingBetweenframe();
	ErrorMessage em = new ErrorMessage();

	@Given("user is in the Transfotech Homepage")
	public void user_is_in_the_transfotech_homepage() {
		Assert.assertTrue(hp.returnHomePageTitle().contains(partialHomePageTitle));

	}

	@And("user clicks on Contact Us Link")
	public void user_clicks_on_contact_us_link() {

		sbf.SwitchingToIframes();

	}

	@When("user gives valid First Name")
	public void user_gives_valid_first_name() {
		cp.EnterFirstName(firstName);

	}

	@And("user gives valid Last Name")
	public void user_gives_valid_last_name() {
		cp.EnterLastName(lastName);

	}

	@And("user gives valid Email ID")
	public void user_gives_valid_email_id() {
		cp.EnterEmailId(emailId);

	}

	@Then("user gives valid Cell phone no with respect to countries in the drop down")
	public void user_gives_valid_cell_phone_no_with_respect_to_countries_in_the_drop_down() {
		cp.EnterCellPhone(cellPhone);

	}

	@And("user gives valid state")
	public void user_gives_valid_state() {
		cp.EnterState(state);

	}

	@And("user selects the required course from the check box")
	public void user_selects_the_required_course_from_the_check_box() {
		cp.EnterCourse(courses);

	}

	@And("user can type their message in the message text box")
	public void user_can_type_their_message_in_the_message_text_box() {
		cp.EnterTextMessage(message);

	}

	@Then("user clicks submit button")
	public void user_clicks_submit_button() {
		hp.SubmitBtn();

	}

	@And("the details should be Submitted")
	public void the_details_should_be_submitted() {

		Assert.assertTrue(hp.returnHomePageTitle().contains(partialHomePageTitle));

	}

	@When("user leaves First Name text box blank")
	public void user_leaves_first_name_text_box_blank() {
		cp.EnterFirstName(firstName_Blank);
	}

	@Then("a error message should be displayed below First Name field")
	public void a_error_message_should_be_displayed_below_first_name_text_box() {
		Assert.assertTrue(em.validateFirstNameErrorMsg());
	}

	@Then("user gives invalid Cell phone no with respect to countries in the drop down")
	public void user_gives_invalid_cell_phone_no_with_respect_to_countries_in_the_drop_down() {
		cp.EnterCellPhone(invalidCellPhoneNumber);

	}

	@Then("a error message should be displayed below Cell Phone field")
	public void a_error_message_should_be_displayed_below_cell_phone_field() {

		Assert.assertTrue(em.validateCellPhoneErrMsg());

	}

	@When("user gives invalid Email ID")
	public void user_gives_invalid_email_id() {
		cp.EnterEmailId(invalidCellPhoneNumber);

	}

	@Then("a error message should be displayed below Email ID field")
	public void a_error_message_should_be_displayed_below_email_id_field() {

		Assert.assertTrue(em.validateEmailErrMsg());

	}

	@When("user leave Email ID blank")
	public void user_leave_email_id_blank() {
		cp.EnterEmailId(EmailId_Blank);

	}
	
	@Then("user gives space in Cell phone field")
		public void user_gives_space_in_cell_phone_field() {
		cp.EnterCellPhone(CellPhone_Space);

		    
		}

}
