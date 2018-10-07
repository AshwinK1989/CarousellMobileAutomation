Feature: UI Functional Test

  Scenario: To test the listing functionality
    Given Clicked on Login Button
    When Logged Into Application
    And Click on Sell button
    And Upload Photo
    And Select the Category
    And List the product
    And filter the product
    And Click on popup button
    And Select Recent filter
    And Scroll to listed Product
    Then Verify whether the product is present