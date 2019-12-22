package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features ="src/test/resources/features/Login.features",
        glue = "com/vytrack/step_definations",
        dryRun = false,
//        tags =  "@store_manager or @driver or @sales_manager"
//        tags = "@driver or @VYT-123"
//        tags = "@login and not @driver"
        tags = "@wip"
)
public class CukesRunner {

}
