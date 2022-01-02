package com.cybertek.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt" //store failed scenario names into rerun.txt file
        },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false, //false=> run the test. true => check for missing steps
        tags = "@cloudtables"
)
public class CukesRunner {
}
