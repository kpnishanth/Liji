  Feature:My Account Functionality

    @Login @ALL
    Scenario Outline: Register and Login Account with Valid Credentials
      Given user open the browser and navigate to <url>
      Then user enter <search text>
      And user clicks on google search button
      Then user clicks <search text1>
      Then user clicks on my account

      Then user closes the ad window
      Then user enters valid email address for register <email>
      Then user enters password for register <password>
      And user clicks on register
      Then user enters login field with valid username <email1>
      And user enter password for login <password1>
      Then clicks on login
      Then user clicks on sign out
      Then user closes the browser window
      Examples:
        | url                      | search text                   | search text1               | email                     | password          | email1                    |password1        |
        | "https://www.google.com" | "practice automation testing" | "Automation Practice Site" | "arshunish18@gmail.com"   | "heeranishanth87" | "heera.arshu19@gmail.com" |"heeranishanth87"|
        | "https://www.google.com"   |"practice automation testing"  | "Automation Practice Site" | "heera.arshu19@gmail.com" | "heeranishanth87" | "heera.arshu19@gmail.com" |"heeranishanth87"|



