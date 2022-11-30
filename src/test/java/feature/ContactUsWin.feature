#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Contact Us feature
  Feature will help user to contact the admin by providing required credentials.

 
  Scenario: Providing all the valid information on the information form
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user gives valid First Name
    And user gives valid Last Name
    And user gives valid Email ID
    Then user gives valid Cell phone no with respect to countries in the drop down
    And user gives valid state
    And user selects the required course from the check box
    And user can type their message in the message text box
    Then user clicks submit button
    And the details should be Submitted


 
  
