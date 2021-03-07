package com.VyTrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/VyTrack/step_definitions",
        tags = "@wip",
        dryRun = false,
        plugin = "html:target/cucumber-report.html"
)


public class CukesRunner {
}
