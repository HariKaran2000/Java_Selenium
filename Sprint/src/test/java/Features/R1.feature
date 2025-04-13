Feature: Register Functionality
Scenario: To verify user is able to Register For Personal account
Given  User is in the home page
When  User clicks on the register
And  User enter the account details
And  User clicks on the Register button
Then  Account is Registered

Scenario: To verify user is able to Register for Business account
Given  User is in the home page
When  User clicks on the register
And  User enter the Business account details
And  click on Register button
Then  Business account is Registered
