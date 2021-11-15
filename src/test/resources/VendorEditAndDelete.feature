Feature: Vendor can edit or delete a Flight
  Background:
    Given A Vendor is logged in and on the home page
  And clicked view flight

Scenario: The edit flight functionality works
  When The Vendor clicks on Edit flight and changes elements
And clicks submit
Then The Vendor will be taken to VendorHome to view changes

Scenario: The Cancel Flight functionality works
When clicks on delete Flight
Then The flight will be cancelled and removed from all flights