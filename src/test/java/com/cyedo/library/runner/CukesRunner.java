package com.cyedo.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin ={ "pretty",//
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},//another way to get report, the new one ,also we have dependency:reporting - plugin

        features = "src/test/resources/features",
        glue = "com/cyedo/library/step_definitions",
        dryRun = false,
        tags = "@student or @librarian"
)




public class CukesRunner {

}
