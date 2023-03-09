Feature:Login Page Functionality
  @FbLogin
  Scenario: Fb login Page
    Given user opens the browser and navigate to "https://www.google.com"
    Then user enters "facebook"
    Then user click on google search
    When user select or clicks  "Facebook - log in or sign up"
    Then user able to see the logo displayed
