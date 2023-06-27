 Feature: TC_Customer_Login_functionality_with_Tables

Background:
When I navigate to microtech site
Then I click on Login Button

   @smake
   Scenario Outline: Login with valid Id and password
     Then I enter User Id and Password from sheetname "<SheetName>" and rownumber <RowNumber>
     And Click on Login Button
     Then the Home Page will appear

     Examples:
       |SheetName |RowNumber|
       |loginAuth |0 	     |

