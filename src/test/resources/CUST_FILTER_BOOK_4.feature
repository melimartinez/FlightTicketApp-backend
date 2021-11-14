Feature: Customer can search flights and book a ticket

  Scenario: Customer can search flights and be able to book a ticket
    Given Customer is on Customer Home Page
    When Customer fill in required information to filter flights 
    And Customer click on search button
    Then Customer should be on Ticket Page
    And Customer fills in ticket form 
    And Customer click on Book Ticket button
    Then Customer should be on Confirmed Page