@smoke
Feature: User is able to login with valid username & password

Description: "User login to zoopla wbsite and verify login"

Scenario: User login with valid username and verify page title

Given User can open any browser
And User is able to enter "https://www.zoopla.co.uk/" url
When User clicks on the Login in button
And User enters email "huque.mir@gmail.com" and password "123456"
And User clicks on Sign in button
Then User is able to verify successful login & verify page title





