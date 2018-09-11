Feature: Google search
  As a Google user
  I want to be able to search by phrase
  So that I can find web pages related to provided phrase

  @smoke
  Scenario Outline: Google search
    Given I'm on google.co.uk main page
    When I enter search phrase <searchPhrase>
    And I click search
    Then Link <link> should be displayed as first one

    Examples:
      | searchPhrase   | link                        |
      | "google co uk" | "https://www.google.co.uk/" |

  @smoke2
  Scenario: PHP Travels
    Given I'm on https://www.phptravels.net/
    When Click on the 'Sign Up'  button located under 'My Account'
    And fill in the form with valid details.
    And Click Submit.

  @smoke3
  Scenario: PHP Log IN
    Given I am on PHP
    When I click on Log in
    And Fill in the form
    Then Your Name will be displayed

  @smoke4
  Scenario: Exercise 3
    Given I am on Home
    When I select book now
    And select a number of adults and children
    And I fill in guest form
    And I will fill in passport details
    Then Invoice will be displayed

  @smoke5
  Scenario: Exercise 4
    Given The homepage is visible
    When I select book flights
    And I select departure date
    And I select the class and passenger numbers
    And I fill in form
    Then Unpaid Invoice will be displayed

    @smoke6
    Scenario: Exercise 5
      Given I will be on Home
      When I click check  in and out




