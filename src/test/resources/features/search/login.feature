Feature: Login to account

  Scenario: Login with valid credentials
    Given Juan is in BStacks homepage
    When He goes to the sign in page
    And He goes to sign in with his credentials username "demouser" and password "testingisfun99"
    Then He should successfully log in to "demouser"

  Scenario: Login with invalid credentials
    Given Juan is in BStacks homepage
    When He goes to the sign in page
    And He goes to sign in with wrong credentials username "demouser" and password "wrong"
    Then He should see an invalid credentials error