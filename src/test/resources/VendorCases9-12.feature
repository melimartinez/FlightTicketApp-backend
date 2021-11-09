# Not exhaustive, will conglomerate with other feature files for complete feature file
Feature: Vendor has Create,Read, Update, Delete operations for flights that work

  Scenario: The Create Flight functionality works
    Given The Vendor is on the Home Page
    When The Vendor clicks on 'Create Flight'
    Then The Vendor should be prompted to fill out new flight form.

  Scenario: The 'View All Flights' functionality works
    Given The Vendor is on the Home Page
    When the Vendor clicks on 'View All Flights'
    Then the homepage will be populated with all of their flights

  Scenario: The edit flight functionality works
    Given the Vendor is on the home page, populated with all flights
    When the Vendor clicks on 'edit flight' for particular flight
    Then populated flight form will open for editing

  Scenario: The Cancel Flight functionality works
    Given The Vendor is on the home page, populated with all flights
    When The Vendor clicks on 'Cancel Flight'
    Then The flight will be cancelled and removed from all flights