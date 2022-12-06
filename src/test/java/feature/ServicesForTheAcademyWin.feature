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

Feature: Service functionality
  It should provide details of service provided 

  
  Scenario: Title of your scenario
    Given user load application "<transfotech>"
    When user mouse hover service 
    Then user click first drop down Job Placement button and goes to "<JobPlacementPage>" 
    And user click It Training dropdown  button 
    

   Examples: 
      | transfotech |JobPlacementPage|
      | Transfotech |Job Placement|
