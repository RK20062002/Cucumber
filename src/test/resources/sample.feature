@Feature2
Feature: To validate the fb application

Background:
Given To launch the edge browser and maximize window

@Smoke
Scenario: To validate the login page
When The url is launch
And To pass email in email field
And To pass password in password field
And To click the login button


@r2
Scenario Outline:
When User has to hit the facebook url
And User has to pass the data"<emaildatas>" in email field
And User has to pass the data"<passworddatas>" in password field
And User has to click the login button


Examples:
|emaildatasd      |passworddatas|
|rk@gmail.com     |123456789    |
|ranjith@gmail.com|wscvgumll    |
|ran100@gmail.com |qwertyuiooooo|
|kumar@gmail.com  |yhhujjikkooln|