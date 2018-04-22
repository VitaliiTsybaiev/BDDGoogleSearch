package com.test.google.Tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features" },
        glue = { "com.test.google.stepDefinitions" })
public class SearchTests {
}
