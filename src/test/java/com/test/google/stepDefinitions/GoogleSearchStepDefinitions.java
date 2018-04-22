package com.test.google.stepDefinitions;

import com.test.google.steps.SearchSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleSearchStepDefinitions {

	@Steps
	SearchSteps googleSearchSteps;

	@Given("I want to search in Google")
	public void iWantToSearchInGoogle() throws Throwable {
		googleSearchSteps.openGoogleSearchPage();
	}

	@When("I search for '(.*)'")
	public void iSearchFor(String searchRequest) throws Throwable {
		googleSearchSteps.searchFor(searchRequest);
	}

	@Then("I should see link to '(.*)'")
	public void iShouldSeeLinkTo(String searchResult) throws Throwable {
		googleSearchSteps.verifyResult(searchResult, true);
	}

	@Then("I should not see link to '(.*)'")
	public void iShouldNotSeeLinkTo(String searchResult) throws Throwable {
		googleSearchSteps.verifyResult(searchResult, false);
	}
}
