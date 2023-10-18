package com.fasset.automation.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.fasset.automation"},
        plugin = {"json:target/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","com.fasset.automation.Hooks.CustomHooks"},
        features = {"src/test/resources/Features"}
)
public class JunitRunnerTest {

}