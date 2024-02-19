Feature: To Test The Adactin Application

@smoketest
Scenario: Checks The Login Functionality

Given launch The Adactin Url Of The Application
When user Enters The Following Credentials In The Respective Field
#DataTable
|Username|Password|
|Java24|367Dinesh|
|Selenium|12734687|
#When user Enters The Username "<Username>" In The Respective Field
#And user Enters The Password "<Password>" In The Respective Field
Then user Clicks The Loginbutton and Its Navigates To The Search Hotel Page 

#Examples:
#
#	|Username|Password|
#	|Dinesh1993|811BWB|
#	|Kumar2655|3873GHE|
@smoketest1
Scenario: Checks The Serach Hotel Page

When user Select The Location In Dropdown 