 Feature: TC_Customer_Login_functionality_with_Tables

Background:
When I navigate to microtech site
Then I click on Login Button

@smoke
Scenario Outline: Login with valid Id and password
Then I enter user Id as  "<User Id>"
And I enter password as "<Password>"
And Click on Customer Login Button
Then the Verify the "<Messages>"
Examples:
|User Id   			 |Password|
|testpilot@gmail.com |1234    |


#Scenario Outline: Login with Invalid Id and-or password
#Then I enter user Id as  "<User Id>"
#And I enter password as "<Password>"
#And Click on Login Button
#Then the Verify the "<Messages>"
#
#Examples:
#|User Id   						| Password|Messages |
#|testpilot@gmail.com | invalid ||
#|invalid@gmail.com 	| 123 		||
#|invalid@gmail.com 	| invalid ||
