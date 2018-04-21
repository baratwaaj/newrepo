Feature: Create Lead
@Smoke 
Scenario Outline: Creating a new lead +ve
Given Enter the username as DemoSalesManager
And Enter the password as crmsfa
And Click Login button
And click CRM/SFA button
And Click Create lead button
And Enter CompanyName as <cName>
And Enter FirstName as <fName>
And Enter LastName as <lName>
When Click create lead button
Then Lead is created successfully
Examples:
|cName|fName|lName|
|amazon|dhanya|N|
|Amazon|BARATWAAJ|VP|

@Sanity
Scenario: Creating a new lead -ve
Given Enter the username as DemoSalesManager
And Enter the password as crmsfa1
When Click Login button
But Login failed
