Feature: Verify delete order endpoint

  Scenario: Verify delete order endpoint with valid orderId
    Given I want to delete an order
    When I attempt to delete the order "orderId"
    Then the response status code should be 200

  Scenario: Verify delete order endpoint with invalid orderId
    Given I want to delete an order
    When I attempt to delete the order "invalidOrderId"
    Then the response status code should be 400