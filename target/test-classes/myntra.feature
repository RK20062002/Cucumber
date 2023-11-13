@flipkart
Feature: To validate the flipkart application

Background: 
Given To launch the browser

@tc1
Scenario: To validate the home page

When To launch url of flipkart
And To search from the searchbar
And To take screenshot
Then close the browser

@tc2
Scenario Outline:
When User launch the url
And User search product"<products>" in searchbar
And User takes screenshot"<products>"
Then User close the browser

Examples:
|products|
|Shoes	 |
|Watch	 |
|Cap     |
|5g Phone|
|Tshirt  |

