Feature: Refine Functionality

  @Ref @ALL
  Scenario Outline: Refine by Product Category
    Given user opens browser and navigate to <url>
    Then user entering <searchText>
    Then user  clicks on google search button
    Then user clicks  <searchLink>
    Then user clicks shop
    Then user close the ad
    When user clicks Javascript under product category
    Then it should display only Javascript products
    And user close the browser
    Examples:
      | url                      | searchText                        | searchLink                    |
      | "https://www.google.com" | "practice automation testing" | "Automation Practice Site" |

