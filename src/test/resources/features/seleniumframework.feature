Feature: Access to Feature: Access to finance web site


  Scenario: Navigate to landing page
    When I open finance website
    Then I validate sale price is greater than buy for USD
    Then I validate sale price is greater than buy for EUR
    Then I validate sale price is greater than buy for RUB

