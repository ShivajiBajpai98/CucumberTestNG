package com.atmecs.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/firstTest.feature",
        glue={"com/atmecs/stepdefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {
}
