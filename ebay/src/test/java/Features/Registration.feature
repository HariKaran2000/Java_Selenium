Feature: Register Functionality
Scenario Outline: To verify user is able to Register For Personal account
Given  User is in the home page
When  User clicks on the register
And  User enter the account details <fname> and <lname> and <mail> and <pass>
And  User clicks on the Register button
Then  Account is Registered
Examples:
	|fname|lname|mail|pass|
	|zack|jazze|zackentie@gmail.com|jackie@!3366|
	|znyder|pene|znyderpiee34@gmail.com|treate@338877|


	
Scenario: To verify user is able to Register for Business account
Given  User is in the home page
When  User clicks on the register
And  User enter the Business account details
And  click on Register button
Then  Business account is Registered
	