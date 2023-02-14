Feature: Login Functionalities

Background: 
Given I am in Chrome Browser
When I navigate to microtech site 
Then Landing Page will appear
Then I click on Login Button

@Reg
Scenario Outline: Login with valid Id and password
Then I enter User Id and Password from sheetname "<SheetName>" and rownumber <RowNumber>
And Click on Login Button
Then the Home Page will appear

Examples:
|SheetName |RowNumber|
|loginAuth |0 	     |


#  


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
