
Feature: Registering a new User
  User will be Registered after providing valid information

 
 
  Scenario Outline: Registration for new user
    Given user load "<Application>"
    When user click Login button
    And user type user "<emailaddress>"
    Then user types user "<name>"
    And user type "<password>"
    Then user type confirm "<password1>"
    And user type in  "<firstname>"
    Then type their "<lastname>"
    And user then type "<displayname>"
    Then user click Register button 
    And "<profile>" page should be displayed

    Examples: 
     |Application    | emailaddress     | name   | password  | password1  |firstname|lastname|displayname|profile|
     |Transfotech | test12@gmail.com |test123 |123@test   |123@test   |test1    |test2   |testtest2  |Profile|
      
    
    Scenario Outline: User try to register with entering wrong mandatory character
    Given user load "<Application>"
    When user click Login button
    And user type user "<emailaddress>"
    Then user types user "<name>"
    And user type "<password>"
    Then user type confirm "<password1>"
    And user type in  "<firstname>"
    Then type their "<lastname>"
    And user then type "<displayname>"
    Then user click Register button 
    And It should get error message confirm password doesnt match

    Examples: 
      |Application  | emailaddress     | name   | password  | password1  |firstname|lastname|displayname|
      |Transfotech| test12@gmail.com |test12  |test@123   |test123   |Test    |Tester   |Automation  |
      
    Scenario Outline: New user try to registration missing some mandatory field
     Given user load "<Application>"
    When user click Login button
    And user type user "<emailaddress>"
    Then user types user "<name>"
    And user type "<password>"
    Then user type confirm "<password1>"
    And user type in  "<firstname>"
    Then type their "<lastname>"
    And user then type "<displayname>"
    Then user click Register button 
    And It should a get massage required field must filled up

    Examples: 
      |Application  | emailaddress     | name   | password  | password1  |firstname|lastname|displayname|
      |Transfotech| test12@gmail.com |  |test@123   |  |    |   |  |
     

      
      
      