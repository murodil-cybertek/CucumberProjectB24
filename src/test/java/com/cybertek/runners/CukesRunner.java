package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/report/cucumber-report.html"
        },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false,
        tags = "@lyft"
)
public class CukesRunner {
}
