
Feature: About Us Transfotech Academy
  We are able see information 

 
  Scenario: About Us feature functionality
    Given user load the "<Application>"
    When user mouse hover the About us 
    Then user move to success stories and click on "<SuccessStories>"
    
   Examples: 
      |Application  |SuccessStories|
      |Transfotech  |Success Stories |
    