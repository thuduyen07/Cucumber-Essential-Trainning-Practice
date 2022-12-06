package com.thuduyen07.testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/features"},
        glue = {"com.thuduyen07.definitions"},
        plugin = {"pretty"}
)
public class ExampleRunner {
}
