#Feature: Using get method in API
#
#  @Test
#  Scenario: Verify the products using get method
#    Given I hit the URL of get product in api
#    When I pass the URL in the request
#    Then I get the response code as 200
#
#  @Test
#    Scenario Outline: Verify the product details using get method
#      Given I hit the URL of get product in api
#      When I pass the URL in the request
#      Then I verify the rate of the first product is <category>
#      Examples:
##        | RateOfFirstProduct |
#        |category           |
#        | men's clothing    |
#
