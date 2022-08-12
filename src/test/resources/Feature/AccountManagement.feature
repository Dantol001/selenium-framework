@AccountManagement
Feature: Account Management

  @CreateAccount-ValidEmail
  Scenario Outline: Create an account using a valid e-mail address
    Given User is on create an account page
    When User enters "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And User clicks on create an account
    Then My account page is displayed

    Examples:
      | firstname | lastname | email               | password    | confirmpassword |
      | Olu       | Bayo     | olubayo@hotmail.com | Olubayo2090 | Olubayo2090     |

  @CreateAccount-Duplicate
  Scenario Outline: Create an account - Duplicate account creation not allowed
    Given User is on create an account page
    When User enters "<firstname>" "<lastname>" "<email>" "<password>" "<confirmpassword>"
    And User clicks on create an account
    Then Error message should be displayed that account already exist

    Examples:
      | firstname | lastname | email               | password    | confirmpassword |
      | Olu       | Bayo     | olubayo@hotmail.com | Olubayo2090 | Olubayo2090     |






  @SignIn-AccountLogin
  Scenario Outline: Registered customer login with their username and password
    Given User is on sign in page
    When User enters "<email>" "<password>"
    And User clicks on sign in
    Then Home page is displayed and user is signed in successfully

    Examples:
      | email               | password    |
      | olubayo@hotmail.com | Olubayo2090 |

