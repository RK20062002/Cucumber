@Feature1
Feature: To validate the account creation of fb application

@tc5
Scenario: To create new account
Given To launch the browser and maximise the window
When To launch the url of fb application
And To click the create new account button

And To pass firstname in firstname txt box
# |Rk|Ranjith|Kumar|Priya|  -------->>>> 1D list
# 1D map below data
|firstname1|ranjith|
|firstname2|Priya|
|firstname3|Swetha|

And To pass secondname in secondname txt box
And To pass mobileno or email in email txt box
# |rk@gmail.com|r@gmail.com|  --------->>> 2D list
# |djlfjie@gmail.com|9715435855|
# |9344390575|9791466262|

#2D map below data
|password1|password2|password3|
|rk20062002|1234567890|asdfghjkl;|
|zxcvbnm,.|qwertyuiop|qazxvyyjm,|



And To create new password in new password txt box
Then To close the edge browser

