package com.Bitrix24.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "\"html:target/cucumber-report.html\"",
        features = "src\\test\\resources",
        dryRun = true,
        tags = "@win",
        glue = "com\\Bitrix24\\StepDifinations"


)


public class CukeRunner {
}
