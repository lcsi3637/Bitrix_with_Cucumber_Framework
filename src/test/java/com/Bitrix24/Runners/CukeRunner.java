package com.Bitrix24.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "src/test/java/com/Bitrix24/StepDifinations",
        dryRun = false,
        tags = "@win"


)


public class CukeRunner {
}
