Feature: Verify place order endpoint

  Scenario: Verify get pet by status with valid status
    Given I want to place an order
    And with orderId as ""
    And with petId as ""
    And with quantity as ""
    When I attempt to place an order
    Then the response status code should be 200
