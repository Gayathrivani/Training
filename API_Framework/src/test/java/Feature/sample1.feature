Feature: Verify products using api methods

@Test
  Scenario: verify the url with status code
    Given I hit the URL of get product in api
    When I pass the URL in the request
    Then I get the response code as 200
@Test
  Scenario: create the new post using api method
    Given I try to create a body
    When I hit the URL and post the body
    Then Verify the response body

@Test
    Scenario: Update and delete the post
    Given I try to update the post using put method
    When I hit the URL and Update the body
    And Verify the updated body
    Then I delete the post and verify the status code

