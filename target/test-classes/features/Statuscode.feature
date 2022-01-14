
@secondUser
Feature: GET Reqres second user status code
Description: This feature tests second user

 
 
  Scenario: Getting second user and checking status code
    
    Given I create a get second user request
    When I create a get call for second user endpoint
    Then I validate that the status code for getting user is 200
    

