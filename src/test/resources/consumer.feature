Feature: Home page works

  Scenario: Search for Customer works
    Given The Customer is on the home page
    When The Customer inputs search criteria
    Then The page should show flights fitting the criteria

  Scenario: Get upcoming flights works
    Given The Consumer is on the home page
    When The Customer clicks Upcoming Flights
    Then Customer should see all their upcoming flights

  Scenario: Get Past flights works
    Given The consumer is on the home page
    When The Customer clicks Get Past Flights
    Then The Customer should see their past flights

  Scenario: Login for Customer works
    Given Customer is on the login page
    When The Customer logs in
    Then The Customer should see the home page