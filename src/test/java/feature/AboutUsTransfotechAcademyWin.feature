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

Feature: About Us Transfotech Academy
  We are able see information 

 
  Scenario: About Us feature functionality
    Given user load the "<Application>"
    When user mouse hover the About us 
    Then user move to success stories and click on "<SuccessStories>"
    
   Examples: 
      |Application  |SuccessStories|
      |Transfotech  |Success Stories |
    