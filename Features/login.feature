Feature: Test Feature
   
   @tag0
  Scenario: signup for new user
    Given user on the home page
    When user click on signup
     And user enter email as "Thanus523567@gmail.com" 
    And user enter mobile number as "9624796312" 
    And user click on the signup button 
    And user create the password and click on startLearning button 
    Then user should be signup successfully
   @tag1
  Scenario: Successful login with valid credintials
    Given user on the home page
    When user click on login1
     And user enter valid login name as "chintalatanusha@gmail.com" 
    And user enter valid password as "Thanusha@" 
    And user click on the login button 
    Then user should be logged in successfully
    
    @tag2
  Scenario: Unsuccessful login with invalid credentials
    Given user on the home page
    When user click on login2 
    And user enter valid login name
    And user enter invalid password
    And user click on the login button 
    Then user should see an error message indicating invalid credentials
    @tag2
  Scenario: Unsuccessful login with invalid credentials
    Given user on the home page
    When user click on login5 
    And user enter invalid login name
    And user enter valid password
    And user click on the login button 
    Then user should see an error message indicating invalid msg
    
    #@tag3
   #Scenario: Forget password functionality
    #Given user on the home page
    #And user click on the forget password button
    #And user enter my email address
    #And user click on send code
    #And user enter verification code and new password
    #And user click on reset password button
    #Then user redirected to login page    
    @tag5
  Scenario Outline: Handling different user roles
    Given user on the home page
    When user click on login4 
    And user enter <username> and <password> 
    And user click on the login button 
    Then I should be logged in successfully
    Examples: 
      | username | password | 
      |"chintalatanusha@gmail.com"|"Thanusha@"|
      |"srijajasti22@gmail.com"|"Jasti@455"|
      
      
  
  
  