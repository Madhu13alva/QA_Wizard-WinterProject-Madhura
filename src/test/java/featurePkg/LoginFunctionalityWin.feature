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

Feature: Login In feature
 We can login to the Website
  
  Scenario: Intial login phase testing
    Given user in Transfotech Academy "<Homepage>"
    And user clicks on login/register on top right of homepage
    When user types in "<username>" and "<password>"
    And clicks login
    
   
    Examples: 
      | Homepage    |username | password  |
      | Transfotech |tester133| tester13AB |
      

 
  Scenario: Log out functionality by closing browser
    Given user in Transfotech Academy "<Homepage>"
    And user clicks on login/register on top right of homepage
    When user types in "<username>" and "<password>"
    And user exits out of browser
    
     Examples: 
      | Homepage    |username | password  |
      | Transfotech |tester133| tester13AB |

 

    
      
