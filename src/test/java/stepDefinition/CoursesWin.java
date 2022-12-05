package stepDefinition;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactoryPkg.CoursesPage;
import pageFactoryPkg.HomePage;

public class CoursesWin extends MainClass {

	HomePage hp = new HomePage();
	CoursesPage cp = new CoursesPage();

	@Given("user is in transfotech {string}")
	public void user_is_in_transfotech(String homepage) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(homepage));

	}

	@And("user clicks on courses feature")
	public void user_clicks_on_courses_feature() {
		cp.CheckingCoursesLink();

	}

	@When("user clicks on {string}")
	public void user_clicks_on(String QAEngineering) {
		Assert.assertTrue(cp.ClickingOnQAEngineeringCourse().contains(QAEngineering));
	}

	@Then("user clicks on the {string}")
	public void user_clicks_on_the(String BusinessAnalyst) {
		Assert.assertTrue(cp.ClickingOnBusinessAnalystCourse().contains(BusinessAnalyst));
	}

	@And("user further clicks on  {string}")
	public void user_further_clicks_on(String MasterEthicalHacking) {
		Assert.assertTrue(cp.ClickingOnMasterEthicalHacking().contains(MasterEthicalHacking));
	}

	@Then("user fills the form providing all the valid information such as {string}, {string}, {string}, {string}, {string},{string}")
	public void user_fills_the_form_providing_all_the_valid_information_such_as(String FirstName, String LastName,
			String Email, String CellPhone, String State, String Message) {
		cp.SwitchingToIframes();
		cp.EnterFirstName(FirstName);
		cp.EnterLastName(LastName);
		cp.EnterEmail(Email);
		cp.EnterPhone(CellPhone);
		cp.EnterState(State);
		cp.EnterMessage(Message);
	}

	@Then("user clicks Submit button")
	public void user_clicks_submit_button() {
		cp.ClickSubmitBtn();

	}

	@And("User should be refreshed back to {string}")
	public void user_should_refreshed_back_to(String HomePage) {
		Assert.assertTrue(hp.returnHomePageTitle().contains(HomePage));

	}

	@Then("user fills the form providing all the invalid information such as {string}, {string}, {string}, {string}, {string},{string}")
	public void user_fills_the_form_providing_all_the_invalid_information_such_as(String invalidFirstName,
			String invalidLastName, String invaliEmail, String invalidCellPhone, String invalidState, String Message) {
		cp.SwitchingToIframes();
		cp.EnterFirstName(invalidFirstName);
		cp.EnterLastName(invalidLastName);
		cp.EnterEmail(invaliEmail);
		cp.EnterPhone(invalidCellPhone);
		cp.EnterState(invalidState);
		cp.EnterMessage(Message);
	}

	@And("error message should be seen")
	public void error_message_should_be_seen() {
		Assert.assertTrue(cp.validateEmailErrMsg());

	}

	@Then("user scrolls down the page of QA Engineer course")
	public void user_scrolls_down_the_page_of_QA_Engineer_course() {
		cp.ScrollDownThePage();

	}

	@Then("user clicks on Course objective of QA Engineer course")
	public void user_clicks_on_course_objective_of_QA_Engineer_course() {
		cp.ClicksOnCoursesOjective();

	}

	@When("user clicks on Course Duration of QA Engineer course")
	public void user_clicks_on_course_duration_of_QA_Engineer_course() {
		cp.ClicksOnCourseDuration();

	}

	@When("user clicks on Class Schedule of QA Engineer course")
	public void user_clicks_on_class_schedule_of_QA_Engineer_course() {
		cp.ClicksOnClassScdeule();

	}
	
	

	@Then("user scrolls down the page of Master Ethical Hacking course")
	public void user_scrolls_down_the_page_of_master_ethical_hacking_course() {
	    cp.ScrollDownThePageForMasterEthicalHacking();
		
	}

	@And("user clicks on  Course objective of Master Ethical Hacking course")
	public void user_clicks_on_course_objective_of_master_ethical_hacking_course() {
	    cp.ClicksOnCoursesOjectiveMasterEthicalHacking();
	}

	@When("user clicks on Course Duration of Master Ethical Hacking course")
	public void user_clicks_on_course_duration_of_master_ethical_hacking_course() {
		cp.ClicksOnCourseDurationMasterEthicalHacking();
	    
	}

	@And("user clicks on Class Schedule of Master Ethical Hacking course")
	public void user_clicks_on_class_schedule_of_master_ethical_hacking_course() {
		cp.ClicksOnClassScdeuleMasterEthicalHacking();
	    
	}
	
	@Then("user scrolls down the page of Business Analyst course")
	public void user_scrolls_down_the_page_of_business_analyst_course() {
		cp.ScrollDownThePageBusinessAnalyst();
	    
	}

	@Then("user clicks on  Course objective Business Analyst course")
	public void user_clicks_on_course_objective_business_analyst_course() {
		cp.ClicksOnCoursesOjectiveBusinessAnalyst();
	    
	}

	@When("user clicks on Course Duration of Business Analyst course")
	public void user_clicks_on_course_duration_of_business_analyst_course() {
		cp.ClicksOnCourseDurationBusinessAnalyst();
		
	    
	}

	@When("user clicks on Class Schedule of Business Analyst course")
	public void user_clicks_on_class_schedule_of_business_analyst_course() {
		cp.ClicksOnClassScdeuleBusinessAnalyst();
	    
	}


}
