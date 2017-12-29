package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(features = "features",
        glue={"stepDefinations"},
//        format = {"pretty", "html:target/Destination"},
        format={"json:target/Destination/cucumber.json"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
        )
public class TestRunner extends AbstractTestNGCucumberTests{

}
