  Feature:My Account Functionality

    @Login @ALL
    Scenario Outline: Register and Login Account with Valid Credentials
      Given user open the browser and navigate to "https://www.google.com"
      Then user enter "practice automation testing"
      And user clicks on google search button
      Then user clicks "Automation Practice Site"
      Then user clicks on my account
      Then user closes the ad window
      Then user enters valid email address for register "arshunish18@gmail.com"
      Then user enters password for register "heeranishanth87"
      And user clicks on register
      Then user enters login field with valid username "heera.arshu19@gmail.com"
      And user enter password for login "heeranishanth87"
      Then clicks on login
      Then user clicks on sign out
      Then user closes the browser window

