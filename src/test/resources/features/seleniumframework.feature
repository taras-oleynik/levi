Feature: Access to ebay web site
  Use selenium java with cucumber-jvm and navigate to website

  Scenario: Navigate to landing page
    When I open finance website
    Then I validate title and URL
