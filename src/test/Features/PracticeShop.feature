Feature: Practice Automation Site Functionality

  @Shop @ALL
  Scenario Outline: Shop Field Functionality
    Given user opens the browser and navigate to <url>
    Then user enters <text>
    Then user user clicks on google search button
    Then user clicks on <search link>
    Then user clicks on shop
    Then user closes the ad
    Then user clicks on <item>
    Then user clicks on add to basket for the item
    Then user clicks on cart
    Then user reach the cart page and scroll down
    Then user clicks on proceed to checkout button
    Then user enters billing details field
    Then user scroll the page
    And user place the order
    Then user closes the browser
    Examples:
      | url                      | text                          | search link                     | item                 |
      | "https://www.google.com" | "practice automation testing" | "Automation Practice Site" | "mastering java script" |










