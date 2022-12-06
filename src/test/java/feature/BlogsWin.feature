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

  
  #Scenario: Blogs feature Testing
    #Given user is on transfotech "<homepage>"
    #When user clicks on the "<blogs>" link
    #Then User clicks on the read more button of any of article posted
    #
     #Examples: 
     #|homepage   |blogs|
     #|Transfotech|Blogs|
     #
  Scenario: Testing Comments and Ratings option on  Blogs when user has Already Logged in
    Given user is on transfotech "<homepage>"
    And user clicks on login on top right of homepage
    When user types in a "<username>" and "<password>"
    And clicks the login
    When user clicks on the "<blogs>" link
    Then User clicks on the read more button of any of article posted
    And User scrolls down the page to see Rate and Comment option
    And user is allowed to give star Rating and "<comment>" 
    Then user clicks on post comments button and page refreshed and comments are posted
    
     Examples: 
     |homepage   |username | password  |blogs|comment|
     |Transfotech|testerA| Tester@2022|Blogs|nice|
 
 
  #Scenario: Testing Comments and Ratings option on Blogs when user providing valid details
    #Given user is on transfotech "<homepage>"
    #When user clicks on the "<blogs>" link
    #Then User clicks on the read more button of any of article posted
    #And User scrolls down the page to see Rate and Comment option
    #And user is allowed to give star Rating and "<comment>"
    #Then user enter required information like "<name>" and "<email>"
    #Then user clicks on post comments button and page refreshed and comments are posted
    #
    #Examples: 
     #|homepage   |blogs|comment|name    |email          |
     #|Transfotech|Blogs| article|tester133 |test8@gmail.com |
     
   #Scenario: Testing Comments and Ratings option on Blogs when user leaves required field blank
    #Given user is on transfotech "<homepage>"
    #When user clicks on the "<blogs>" link
    #Then User clicks on the read more button of any of article posted
    #And User scrolls down the page to see Rate and Comment option
    #And user is allowed to give star Rating and "<comment>"
    #Then user leaves details required field like "<name>" and "<email>" blank
    #Then user clicks on post comments button and error message is displayed
    #
    #Examples: 
     #|homepage   |blogs|comment|name|email|
     #|Transfotech|Blogs|informative article|||
    #

 