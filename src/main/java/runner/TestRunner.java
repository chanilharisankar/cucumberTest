package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = "features",
        glue={"stepDefinations"},
        format={"json:target/Destination/cucumber.json"},
//        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
        plugin = {"progress"}
        )
public class TestRunner extends AbstractTestNGCucumberTests{

}
