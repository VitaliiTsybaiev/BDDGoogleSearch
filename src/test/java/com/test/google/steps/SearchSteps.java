package com.test.google.steps;

import net.thucydides.core.annotations.Step;

import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.test.google.ResultsPage;
import com.test.google.SearchPage;

import java.util.List;

public class SearchSteps {

	SearchPage searchPage;
	ResultsPage resultsPage;

	@Step
	public void openGoogleSearchPage() {
		searchPage.open();
	}

	@Step
	public void searchFor(String searchRequest) {
		resultsPage = searchPage.searchFor(searchRequest);
	}

	@Step
	public void verifyResult(String searchResult, boolean presence) {
		List<String> results = resultsPage.getResultsList();
		if (presence)
			Assert.assertTrue("Result does not contain " + searchResult, results.contains(searchResult));
		else
			Assert.assertFalse("Result contains " + searchResult, results.contains(searchResult));
	}

}
