package com.Step_Definition;

import com.baseclass.Base_Class;
import com.pomclass.Pom_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Step_Definition extends Base_Class {

	Pom_Class p = new Pom_Class(driver);

	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {

	}

	@When("User enters {string} in name field")
	public void user_enters_in_name_field(String string) {
		VisibilityWait(p.name);
		sendkeys(p.name, string);

	}

	@When("User enters {string} in email field")
	public void user_enters_in_email_field(String string) {
		VisibilityWait(p.email);
		sendkeys(p.email, string);

	}

	@When("User clicks Signup button")
	public void user_clicks_signup_button() {
		ClickableWait(p.signupBTN);
		// String text = p.newAccountInfo.getText();
		// System.out.println(text);

		click(p.signupBTN);

		// Assert.assertEquals("Enter Account Information", text);
	}

	@Then("User navigates to Account Information page")
	public void user_navigates_to_account_information_page() {

	}

//ACCOUNT INFORMATION-----------------------------------------------------
	@Given("User clicks the title")
	public void user_clicks_the_title() {
		click(p.titleMr);
	}

	@When("User enters {string} in password field")
	public void user_enters_in_password_field(String string) {
		sendkeys(p.password, string);
	}

	@When("User Selects {string} in the day field")
	public void user_selects_in_the_day_field(String string) {
		click(p.day);
		VisibilityWait(p.day);
		dropDownIndex(p.day, Integer.parseInt(string));
	}

	@When("User Selects {string}  in the month field")
	public void user_selects_in_the_month_field(String string) {
		click(p.month);
		VisibilityWait(p.month);
		dropDownText(p.month, string);

	}

	@Then("User Selects {string} in the year field")
	public void user_selects_in_the_year_field(String string) {
		click(p.year);
		VisibilityWait(p.year);
		dropDownText(p.year, string);

	}

//---------------------------------------------------------------

	@Given("User enters {string} in first name field")
	public void user_enters_in_first_name_field(String string) {
		sendkeys(p.firstname, string);

	}

	@When("User enters {string} in second name field")
	public void user_enters_in_second_name_field(String string) {
		sendkeys(p.lastname, string);
	}

	@When("User enters {string} in company field")
	public void user_enters_in_company_field(String string) {
		sendkeys(p.company, string);
	}

	@When("User enters {string} in address field")
	public void user_enters_in_address_field(String string) {
		sendkeys(p.address, string);

	}

	@When("User Selects {string} in country field")
	public void user_selects_in_country_field(String string) {
		ClickableWait(p.country);
		click(p.country);
		VisibilityWait(p.country);
		dropDownText(p.country, string);
	}

	@When("User enters {string} in state field")
	public void user_enters_in_state_field(String string) {
		sendkeys(p.state, string);
	}

	@When("User enters {string} in city field")
	public void user_enters_in_city_field(String string) {
		sendkeys(p.city, string);
	}

	@When("User enters {string} in zip code field")
	public void user_enters_in_zip_code_field(String string) {
		sendkeys(p.zipcode, string);

	}

	@When("User enters {string} in mobile number field")
	public void user_enters_in_mobile_number_field(String string) {
		sendkeys(p.mobileNumber, string);
	}

	@Then("User Clicks Create Account button")
	public void user_clicks_create_account_button() {
		click(p.createACCBTN);

	}

	// ACCOUNT CREATED PAGE-------------------------------------------
	@Given("User is on the Account created page")
	public void user_is_on_the_account_created_page() {
		String s = p.created.getText();
		System.out.println(s);

	}

	@When("User clicks Continue button")
	public void user_clicks_continue_button() {
		ClickableWait(p.continueBTN);
		click(p.continueBTN);
	}

	@When("User clicks the Logout button")
	public void user_clicks_the_logout_button() {
		ClickableWait(p.logoutBTN);
		click(p.logoutBTN);
	}

	// LOGIN PAGE FUNCTIONALITY-----------------------------------------------
	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
		
	}

	@When("User enters {string} in the email field")
	public void user_enters_in_the_email_field(String string) {
	
	}

	@When("User enters {string} in the password field")
	public void user_enters_in_the_password_field(String string) {
		
	}

	@When("User clicks the Login button")
	public void user_clicks_the_login_button() {
	
	}

	@Then("User is on the Home Page")
	public void user_is_on_the_home_page() {
		
	}

	// PRODUCT SECTION-----------------------------------------------------
	@Given("User clicks the Products")
	public void user_clicks_the_products() {
		
	}

	@When("User Clicks {string} Category")
	public void user_clicks_category(String string) {
	
	}

	@When("User clicks {string} in category section")
	public void user_clicks_in_category_section(String string) {
		
	}

	@When("User clicks Add to cart")
	public void user_clicks_add_to_cart() {
		
	}

	@Then("the product is successfully added")
	public void the_product_is_successfully_added() {
		
	}

}
