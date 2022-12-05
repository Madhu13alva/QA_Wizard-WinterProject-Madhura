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

 
  #Scenario: When the user selects a course from drop down list ,then details of that course should appear on the home page
    #Given user is in transfotech "<homepage>"
    #And user clicks on courses feature
    #
     #Examples: 
     #|homepage   |
     #|Transfotech|
    
   #Scenario: Checking Courses Feature link 
    #Given user is in transfotech "<homepage>"
    #And user clicks on courses feature
    #When user clicks on "<QAEngineering>"
    #Then user clicks on the "<BusinessAnalyst>"
    #And user further clicks on  "<MasterEthicalHacking>"
    #
    #Examples: 
     #|homepage   |QAEngineering                            |BusinessAnalyst                                                            |MasterEthicalHacking   |
     #|Transfotech |QA Engineer Training Certification Course|Business Analyst Certification Course & Training in NYC - BA Job Placement|Ethical Hacking Courses & Training|
    
   #Scenario: Submitting valid information to get details of courses  
    #Given user is in transfotech "<homepage>"
    #And user clicks on courses feature
    #When user clicks on "<QAEngineering>"
    #Then user fills the form providing all the valid information such as "<FirstName>", "<LastName>", "<Email>", "<CellPhone>", "<State>","<Message>"
    #And user clicks Submit button
    #And User should be refreshed back to "<HomePage>"
    #
    #Examples: 
     #|homepage   |QAEngineering                            |FirstName |LastName |Email            |CellPhone  |State |Message  |HomePage|
     #|Transfotech|QA Engineer Training Certification Course| TesterA  |TesterB  |tester@gmail.com |3456666666 |NJ    |Hi there |Transfotech  |          
     #
   #Scenario: Submitting invalid information to get details of courses  
    #Given user is in transfotech "<homepage>"
    #And user clicks on courses feature
    #When user clicks on "<QAEngineering>"
    #Then user fills the form providing all the invalid information such as "<invalidFirstName>", "<invalidLastName>", "<invaliEmail>", "<invalidCellPhone>", "<invalidState>","<Message>"
    #And user clicks Submit button
    #And error message should be seen
    #Examples: 
     #|homepage   |QAEngineering                            |invalidFirstName |invalidLastName |invaliEmail    |invalidCellPhone  |invalidState |Message  |
     #|Transfotech|QA Engineer Training Certification Course|                 |%^              |test.gmail.com |sfsfgsfgh         |             |Hi there |                                    
      
   #Scenario: Checking Courses Outline in QA Engineering course  
    #Given user is in transfotech "<homepage>"
    #And user clicks on courses feature
    #When user clicks on "<QAEngineering>"
    #Then user scrolls down the page of QA Engineer course 
    #And user clicks on Course objective of QA Engineer course
    #When user clicks on Course Duration of QA Engineer course
    #And user clicks on Class Schedule of QA Engineer course
  #
  #Examples: 
     #|homepage   |QAEngineering                            |
     #|Transfotech|QA Engineer Training Certification Course|
     #
  #Scenario: Checking Courses Outline in Master Ethical Hacking 
    #Given user is in transfotech "<homepage>"
    #And user clicks on courses feature
    #And user further clicks on  "<MasterEthicalHacking>"
    #Then user scrolls down the page of Master Ethical Hacking course
    #And user clicks on  Course objective of Master Ethical Hacking course
    #When user clicks on Course Duration of Master Ethical Hacking course
    #And user clicks on Class Schedule of Master Ethical Hacking course
    #
    #Examples: 
     #|homepage   |MasterEthicalHacking   |                            
     #|Transfotech|Ethical Hacking Courses & Training|
     
      Scenario: Checking Courses Outline in Master Ethical Hacking 
    Given user is in transfotech "<homepage>"
    And user clicks on courses feature
    Then user clicks on the "<BusinessAnalyst>"
    Then user scrolls down the page of Business Analyst course
    And user clicks on  Course objective Business Analyst course
    When user clicks on Course Duration of Business Analyst course
    And user clicks on Class Schedule of Business Analyst course
    
    Examples: 
     |homepage   |BusinessAnalyst   |                            
     |Transfotech|usiness Analyst Certification Course & Training in NYC - BA Job Placement|
    
    
    
    
    
    
    
    
    
    
     