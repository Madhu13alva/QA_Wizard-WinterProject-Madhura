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

Feature: Blogs feature
  Feature will allow us to access all blogs posted here

  
  Scenario: User should be able to see the contents of the blogs when he clicks on any blogs posted
    Given User is in the Homepage of Transfotech Academy
    When user clicks on Blogs link
    Then User clicks on the read more button of any of article posted
    

 