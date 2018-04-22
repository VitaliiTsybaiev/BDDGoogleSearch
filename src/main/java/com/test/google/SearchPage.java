package com.test.google;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.test.google.ResultsPage;

@DefaultUrl("https://google.com")
public class SearchPage extends PageObject {

	@FindBy(id = "lst-ib")
	private WebElement searchInputField;
	@FindBy(id = "hplogo")
	private WebElement logo;

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	@WhenPageOpens
	public void waitUntilGoogleLogoAppears() {
		element(logo).waitUntilVisible();
	}

	public ResultsPage searchFor(String searchRequest) {
		element(searchInputField).clear();
		element(searchInputField).typeAndEnter(searchRequest);
		return new ResultsPage(getDriver());
	}

}
