Feature: User is able to login with valid username & password

Description: "User login to zoopla wbsite and verify login"
@regression
Scenario Outline: User login with valid username and verify page title

Given User can open any browser
And User is able to enter "https://www.zoopla.co.uk/" url
When User clicks on the Login in button
And User enters email "<username>" and password "<password>"
And User clicks on Sign in button
Then User is able to verify successful login & verify page title

Examples:
| username          | password  |
|huque.mir@gmail.com|  1234567  |
|huque.mir@gmail.com|  12345678 |
|huque.mir@gmail.com|  123456789|
|huque.mir@gmail.com|  123456789ABCDE|
|huque.mir@gmail.com|  123456789ABCDEF|
|huque.mir@gmail.com|  123456789ABCDEFG|
