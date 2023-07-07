Feature: Login to account

  @logout
  Scenario Outline: Login with valid credentials
    Given Juan is in BStacks homepage
    When He goes to the sign in page
    And He goes to sign in with his credentials username "<user>" and password "<pass>"
    Then He should successfully log in to "<user>"

    Examples:
      | user                   | pass           |
      | demouser               | testingisfun99 |
      | image_not_loading_user | testingisfun99 |
      | existing_orders_user   | testingisfun99 |
      | fav_user               | testingisfun99 |

  Scenario Outline: Login with invalid credentials
    Given Juan is in BStacks homepage
    When He goes to the sign in page
    And He goes to sign in with wrong credentials username "<user>" and password "<pass>"
    Then He should see an invalid credentials error

    Examples:
      | user        | pass           |
      | demouser    | wrongpass      |
      | locked_user | testingisfun99 |
      | wronguser   | testingisfun99 |
      | locked_user |                |