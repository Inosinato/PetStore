Feature: Verify find order endpoint

  Scenario: Verify get order by orderId
    Given I want to search an order by id
    When I perform order search by id with "orderId"
    Then the response status code should be 200

  Scenario: Verify get order by orderId with invalid orderId
    Given I want to search an order by id
    When I perform order search by id with "invalidOrderId"
    Then the response status code should be 400