package org.opencartqa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/org/opencartqa/features/"},
        glue = {"org/opencartqa/steps"},
        tags = "@Regression",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class RegressionSuiteRunnerTest {

}
