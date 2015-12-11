Meta:
@ignore false
@tag component: Log in - Log out



Scenario: User logs in to Cosmos TP with valid credentials
Given Cosmos main page has been opened
When user fills login form with correct data (test0@test.com/test0)
And clicks "Login" button
Then user should be logged in