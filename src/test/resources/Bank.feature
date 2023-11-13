@Bank
Feature: To validate the icic bank application

@bank1
Scenario: To validate the login page of icic bank
When To launch the icic bank url
And To click the button
And To pass userid in userid field
And To pass pin in password field
And To hit the login button

@bank2
Scenario Outline:
When User has lauch the icic bank url
And User has hit the login button
And User to pass the date"<userid>" in userid field
And User to pass the data"<password>" in password field
And User click the login button

Examples:
|userid           |password     |
|rk@gmail.com     |123456789    |
|ranjith@gmail.com|wscvgumll    |
|ran100@gmail.com |qwertyuiooooo|
|kumar@gmail.com  |yhhujjikkooln|

