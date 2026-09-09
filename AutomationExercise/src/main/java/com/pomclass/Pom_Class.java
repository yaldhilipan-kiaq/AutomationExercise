package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Class {
	WebDriver driver;

	public Pom_Class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// SIGNUP PAGE----------------------------------------------------------

	@FindBy(xpath = "//input[@data-qa='signup-name']")
	public WebElement name;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	public WebElement email;

	@FindBy(xpath = "//button[@data-qa='signup-button']")
	public WebElement signupBTN;

	@FindBy(xpath = "//b[text()='Enter Account Information']")
	public WebElement newAccountInfo;

	// ACCOUNT INFORMATION PAGE--------------------------------------------------

	@FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement titleMr;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;

	@FindBy(xpath = "//select[@id='days']")
	public WebElement day;

	@FindBy(xpath = "//select[@id='months']")
	public WebElement month;

	@FindBy(xpath = "//select[@id='years']")
	public WebElement year;

	// ADDRESS INFORMATION FIELDS----------------------------------------------

	@FindBy(xpath = "//input[@id='first_name']")
	public WebElement firstname;

	@FindBy(xpath = "//input[@id='last_name']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@id='company']")
	public WebElement company;

	@FindBy(xpath = "//input[@id='address1']")
	public WebElement address;

	@FindBy(xpath = "//select[@id='country']")
	public WebElement country;

	@FindBy(xpath = "//input[@id='state']")
	public WebElement state;

	@FindBy(xpath = "//input[@id='city']")
	public WebElement city;

	@FindBy(xpath = "//input[@id='zipcode']")
	public WebElement zipcode;

	@FindBy(xpath = "//input[@id='mobile_number']")
	public WebElement mobileNumber;

	@FindBy(xpath = "//button[text()='Create Account']")
	public WebElement createACCBTN;

	// ACCOUNT CREATED PAGE--------------------------------------------------------

	@FindBy(xpath = "//b[text()='Account Created!']")
	public WebElement created;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	public WebElement continueBTN;

	@FindBy(xpath = "//i[@class='fa fa-home']")
	public WebElement homeText;

	@FindBy(xpath = "//a[text()=' Logout']")
	public WebElement logoutBTN;

	// PRODUCTS SECTION-------------------------------------------------------------

	@FindBy(xpath = "//i[@class='material-icons card_travel']")
	public WebElement products;

	@FindBy(xpath = "//input[@id='search_product']")
	public WebElement searchProduct;

	@FindBy(xpath = "//button[@id='submit_search']")
	public WebElement searchBTN;

	@FindBy(xpath = "(//a[@data-toggle=\"collapse\"])[2]")
	public WebElement men;

	@FindBy(xpath = "//a[text()='Jeans ']")
	public WebElement Jeans;

	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[1]")
	public WebElement addtoCart;

	// button[text()='Continue Shopping']
	
	//LOGIN PAGE FUNCTIONALITY-----------------------------------------
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	public WebElement loginMail;
	
	@FindBy(xpath = "//input[@data-qa='login-password']")
	public WebElement loginPass;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	public WebElement loginBTN;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
