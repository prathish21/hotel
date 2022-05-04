Feature: Checking The Hotel Booking Functionality Of The Adactin Hotel Application
@login
Scenario Outline: Login Functionality
Given user Should Launch The Url
When user Enters "<username>" In The Username Field
And user Enters "<password>" In The Password Field
Then user Clicks The Login Button And It Navigates To The Search Hotel Page

Examples:
|username|password|
|prathish|546|
|jackson2022|jamjim|
|jackson2022|jimjam|

@search
Scenario: Search Hotel Functionality
When user Selects "Los Angeles" From Select Location Field
And user Selects "Hotel Hervey" From Select Hotel Field
And user Selects "Super Deluxe" From Select Room Type Field
And user Selects "1" From Select Number Of Rooms Field
And user Selects "2" From Select Adults Per Room Field
And user Selects "0" From Children Per Room Field
Then user Clicks Search Button And It Navigates To The Select Hotel Page

Scenario: Select Hotel Functionality
When user Clicks The Select Radio Button 
Then user Clicks The Continue Button And It Navigates To The Book A Hotel Page

Scenario: Book A Hotel Functionality
When user Enters "Prathish" In The Firstname Field
And user Enters "Kumar" In The Lastname Field
And user Enters "No-3, Vadhiyar Theru, LA" In The Billing Address Field
And user Enters "7896547896541235" In The Credit Card No Field
And user Selects "VISA" From Select Credit Card Type Field
And user Selects "6" From Date And "2022" From Select Year Field
And user Enters "563" In The CVV Number Field
Then user Clicks Book Now Button And It Navigates To Booking Confirmation Page
@logout
Scenario: Logout Functionality
Then user Clicks Logout Button And It Navigates To The Successfully Logged Out Page