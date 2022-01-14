package com.stepsdefinition;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SecondUserAPI {
	
	
	RequestSpecification secondUserRequest;
	Response secondUserResponse;
	
	@Given("I create a get second user request")
	public void i_create_a_get_second_user_request() {
		RestAssured.baseURI = "https://reqres.in";
		secondUserRequest = RestAssured.given();
	}
	
	@When("I create a get call for second user endpoint")
	public void i_create_a_get_call_for_second_user_endpoint() {
		secondUserResponse = secondUserRequest.when().get("/api/users/2");
		
		secondUserResponse.prettyPeek();
		
	}
	@Then("I validate that the status code for getting user is {int}")
	public void i_validate_that_the_status_code_for_getting_user_is(Integer status) {
		secondUserResponse.then().assertThat().statusCode(status);
		
	}
}
