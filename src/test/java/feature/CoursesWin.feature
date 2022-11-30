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

Feature: Courses feature
  Feature will provide with information regarding All the courses offered.

 
  Scenario: When the user selects a course from drop down list ,then details of that course should appear on the home page
    Given user is in transfotech homepage
    And user hover his cursor on courses feature
    When user hovers over courses link and clicks on QA Engineering
    When user hovers over courses link and clicks on Business Analyst
    When user hovers over courses link and clicks on Master Ethical Hacking
    
    
    
  
 