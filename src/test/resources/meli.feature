Feature: Login page works

  # As a Vendor, I can login to manage and view flights
  Scenario: Vendor can log in
    Given The Vendor is on the log in page
    When The Vendor enters their correct username and password
    Then The vendor will be on the landing page

Feature: Customer interacting with their ticket

  # As a Customer, I can book tickets to purchase seats on a flight.
  # (actually reserving the flight)
  Scenario: Customer purchases a ticket
    Given The Customer is on page with all the flight's details
    When The customer clicks the "Pay" button
    Then The Customer will be on the Upcoming Flights page

  # As a Customer, I can select a flight so that I can decide to book flight or not
  # (viewing details)
  Scenario: Customer views flight details
    Given The Customer is viewing multiple flights
    When The Customer clicks on the "Select" button
    Then The customer will be on the Flight Details page

  # As a Customer, I can cancel my trip for personal reasons.
  Scenario: Customer cancels a ticket
    Given The Customer is viewing the details of one of their upcoming flights
    When  The Customer clicks the "Cancel" button
    Then The Customer will be on the Upcoming Flights page