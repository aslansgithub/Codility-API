
@allusers
Feature: GET Reqres user API
Description: This feature test Get all users

 
 
  Scenario: Getting all users and verifiying response list of users on JSON format
    Given I create a get all users request
    When I make a call Get for all users
    
