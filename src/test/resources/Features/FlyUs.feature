Feature: FlyUs feature for flight seat booking

Background:
Given User launches chrome and navigate to url

@FlyUs
Scenario Outline: FlyUs flight ticket booking
When User enters the required information
|from  |to  |
|<From>|<To>|
When User selects flight 
When User enters passengers info
|first|last|dob|
|<Fname>|<Lname>|<Date>|
When User selects seat
Then Print the price

Examples:
|From                                               |To                                                 |Fname   |Lname   |Date      |
|New York City, United States - All Airports (NYC)  |Los Angeles, United States - LAX (LAX)             |Priyanka|Anbarasu|05/30/1993|
|Los Angeles, United States - LAX (LAX)             |New York City, United States - All Airports (NYC)  |Priyanka|Anbarasu|05/30/1993|

