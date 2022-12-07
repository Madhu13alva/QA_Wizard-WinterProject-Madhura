
Feature: Contact Us feature
  Feature will help user to contact the admin by providing required credentials.

 
  Scenario: Providing all the valid information on the information form
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user gives valid "<FirstName>"
    And user gives a valid "<LastName>"
    And user types in valid "<EmailID>"
    Then user puts valid "<Cellphone>" no with respect to countries in the drop down
    And user enters valid "<State>"
    And user selects the required Course from the check box
    And user can type their "<Message>" in the message text box
    Then user clicks submit button
    
    Examples: 
      |FirstName |LastName |EmailID          |Cellphone  |State |Message  |
      | TesterA  |TesterB  |tester@gmail.com |3456666666 |NJ    |Hi there |
    
   Scenario: Providing Contact information leaving Blank on the First name Text Box
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user leaves "<FirstName>" text box blank
    And user gives a valid "<LastName>"
    And user types in valid "<EmailID>"
    Then user puts valid "<Cellphone>" no with respect to countries in the drop down
    And user enters valid "<State>"
    And user selects the required Course from the check box
    And user can type their "<Message>" in the message text box
    Then user clicks submit button
    And a error message should be displayed below First Name field
     Examples: 
      |FirstName |LastName |EmailID          |Cellphone  |State |Message  |
      ||TesterB  |tester@gmail.com |3456666666 |NJ    |Hi there |
    
   Scenario: Providing Contact information with invalid Cell phone number
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user gives valid "<FirstName>"
    And user gives a valid "<LastName>"
    And user types in valid "<EmailID>"
    Then user gives "<invalidCellPhone>" no with respect to countries in the drop down
    And user enters valid "<State>"
    And user selects the required Course from the check box
    And user can type their "<Message>" in the message text box
    Then user clicks submit button
    And a error message should be displayed below Cell Phone field
    
    Examples: 
      |FirstName |LastName |EmailID          |invalidCellPhone  |State |Message  |
      | TesterA  |TesterB  |tester@gmail.com |hhgjfhjfjh        |NJ    |Hi there |
    
   Scenario: Providing Contact information with invalid Email
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user gives valid "<FirstName>"
    And user gives a valid "<LastName>"
    And user types in "<InvalidEmailID>"
    Then user puts valid "<Cellphone>" no with respect to countries in the drop down
    And user enters valid "<State>"
    And user selects the required Course from the check box
    And user can type their "<Message>" in the message text box
    Then user clicks submit button
    And a error message should be displayed below Email ID field
    
    Examples: 
      |FirstName |LastName |InvalidEmailID          |Cellphone  |State |Message  |
      | TesterA  |TesterB  |test.gmail.com          |3456666666 |NJ    |Hi there |
    
   Scenario: Providing Contact information with Blank spaces in Email
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user gives valid "<FirstName>"
    And user gives a valid "<LastName>"
    And user types in "<BlankSpacesEmailID>"
    Then user puts valid "<Cellphone>" no with respect to countries in the drop down
    And user enters valid "<State>"
    And user selects the required Course from the check box
    And user can type their "<Message>" in the message text box
    Then user clicks submit button
    And a error message should be displayed below Email ID field
    
    Examples: 
      |FirstName |LastName |BlankSpacesEmailID          |Cellphone  |State |Message  |
      | TesterA  |TesterB  ||3456666666 |NJ    |Hi there |
    
   Scenario: Providing spaces  in Cell Phone
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user gives valid "<FirstName>"
    And user gives a valid "<LastName>"
    And user types in valid "<EmailID>"
    Then user gives "<SpacesCellPhone>" no with respect to countries in the drop down
    And user enters valid "<State>"
    And user selects the required Course from the check box
    And user can type their "<Message>" in the message text box
    Then user clicks submit button
    And a error message should be displayed below Cell Phone field
    
    Examples: 
      |FirstName |LastName |EmailID          |SpacesCellPhone  |State |Message  |
      | TesterA  |TesterB  |tester@gmail.com |                  |NJ    |Hi there |
      
   Scenario: Hovering through  countries in cell phone drop down text field
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    Then user clicks on the drop down text box in Cell phone
    And user selects country of choice
    
   
    Scenario: Selecting all courses provided in the check box
    Given user is in the Transfotech Homepage
    And user clicks on Contact Us Link
    When user gives valid "<FirstName>"
    And user gives a valid "<LastName>"
    And user types in valid "<EmailID>"
    Then user puts valid "<Cellphone>" no with respect to countries in the drop down
    And user enters valid "<State>"
    And user selects all the course from the check box
    And user can type their "<Message>" in the message text box
    Then user clicks submit button
    
    Examples: 
      |FirstName |LastName |EmailID          |Cellphone  |State |Message  |
      | TesterA  |TesterB  |tester@gmail.com |3456666666 |NJ    |Hi there |


 
  
