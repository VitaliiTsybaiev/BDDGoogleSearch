package com.test.google;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ResultsPage extends PageObject {

	@FindBy(xpath = "//h3")
	private List<WebElement> linkTitlesList;

	@FindBy(id = "hdtb-msb")
	private WebElement navPanel;

	public ResultsPage(WebDriver driver) {
		super(driver);

	}

	@WhenPageOpens
	public void waitForPage() {
		element(navPanel).waitUntilVisible();
	}

	public List<String> getResultsList() {
		return linkTitlesList.stream().map(element -> element.getText()).collect(Collectors.toList());

	}

}
