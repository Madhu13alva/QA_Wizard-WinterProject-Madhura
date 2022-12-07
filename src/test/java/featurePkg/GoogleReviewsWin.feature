
Feature: Google Reiviews
  User can check google reviews for the Website


#Scenario: Google reviews tab link
    #Given user types in website URL of "<Transfotech>"
    #And user scrolls down homepage to google reviews tab
    #Then user clicks on view all our reviews tab for google reviews
    #
    #Examples: 
      #|Transfotech|
      #|Transfotech|
  #
  #Scenario: Google reviews scroll feature
    #Given user types in website URL of "<Transfotech>"
    #And user scrolls down homepage to google reviews tab
    #Then user uses google reviews scroll option for various reviews
    #
    #Examples: 
      #|Transfotech|
      #|Transfotech|
    

  Scenario: Routing from google reviews tab to google maps and reviews section. 
    Given user types in website URL of "<Transfotech>"
    And user scrolls down homepage to google reviews tab
    Then user clicks on view all our reviews tab for google reviews
    And user clicks user views from google maps section
    
    Examples: 
      |Transfotech|
      |Transfotech|
    
    
    
    
    
