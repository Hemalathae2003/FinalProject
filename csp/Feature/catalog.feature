Feature: Catalog API

  Scenario: Retrieving the catalog
    Given the Catalog API is available
    When I send a GET request to "/api/catalog"
    Then the response status code should be 200
    And the response should contain a JSON array

  Scenario: Adding an item to the catalog
    Given the Catalog API is available
    And I have an item payload with name "Product A" and price "19.99"
    When I send a POST request to "/api/catalog" with the payload
    Then the response status code should be 201
    And the response should contain the added item details

  # Add more scenarios for other endpoints (PUT, DELETE, etc.)

