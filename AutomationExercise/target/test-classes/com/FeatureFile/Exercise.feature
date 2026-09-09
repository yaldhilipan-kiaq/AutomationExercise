Feature: Automation Exercise website Functionality

  # Scenario: New User Signup
  # Given User is on the Login page
  # When User enters "Yaldhilipan" in name field
  # And User enters "techspider111@gmail.com" in email field
  # And User clicks Signup button
  # Then User navigates to Account Information page
  
  # Scenario: Enter Account Information fields
  # Given User clicks the title
  # When User enters "techspider111" in password field
  # And User Selects "2" in the day field
  # And User Selects "February"  in the month field
  # Then User Selects "2000" in the year field
  
  # Scenario: Enter Address Information fields
  # Given User enters "Yal" in first name field
  # When User enters "Dhilipan" in second name field
  # And User enters "AbcTech" in company field
  # And User enters "Chennai" in address field
  # And User Selects "Australia" in country field
  # And User enters "Sydney" in state field
  # And User enters "Wales" in city field
  # And User enters "0000000" in zip code field
  # And User enters "60000007" in mobile number field
  # Then User Clicks Create Account button
  
  # Scenario: Account Created Page
  # Given User is on the Account created page
  # When User clicks Continue button
  # Then  User clicks the Logout button
  
  Scenario: Login Page Functionality
    Given User is on LoginPage
    When User enters "techspider111@gmail.com" in the email field
    And User enters "techspider111" in the password field
    And User clicks the Login button
    Then User is on the Home Page

  Scenario: Products section
    Given User clicks the Products
    When User Clicks "Mens" Category
    And User clicks "Jeans " in category section
    And User clicks Add to cart
    Then the product is successfully added
