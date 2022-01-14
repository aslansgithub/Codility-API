package com.stepsdefinition;

import static org.hamcrest.Matchers.containsString;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqresAPISteps {
	RequestSpecification allUsersRequest;
	Response allUsersResponse;
	
	

@Given("I create a get all users request")
public void i_create_a_get_all_users_request() {
	RestAssured.baseURI = "https://reqres.in";
	allUsersRequest = RestAssured.given();
	
}

@When("I make a call Get for all users")
public void i_make_a_call_get_for_all_users() {
	allUsersResponse = allUsersRequest.when().get("\n"
			+ "/api/users");
	
	allUsersResponse.prettyPeek();
}


@Then("I verify response has {string}")
public void i_verify_response_has(String name) {
	allUsersResponse.then().body("first_name", containsString(name));
}
}
