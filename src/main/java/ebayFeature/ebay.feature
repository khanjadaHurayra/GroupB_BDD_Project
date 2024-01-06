Feature: ebay HomePage WebTest

  @Important
  Scenario: Checking search bar Functionality
    Given User is an ebay HomePage
    And User Click on Search Field
    And User inputs "Shirt" on search bar field
    And User hits enter
    Then User landing on a search result page