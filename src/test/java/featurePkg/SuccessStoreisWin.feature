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

Feature: Success Stories
  User can see other students success stories

  
  Scenario: Success stories testing working 
    Given user types in websit URL and come to "<Homepage>"
    And user clicks on about us and gets drop down menu and clicks on success stories
    When user clicks on working success stories "<youtube"> link should open 
    
    
 Examples: 
      | Homepage    |youtube|
      | Transfotech |https://www.youtube.com/watch?v=JXrhkVwlmE8|