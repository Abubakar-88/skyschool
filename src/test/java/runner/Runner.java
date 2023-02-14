package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/features"}, 
		glue = {"stepDefinitions"}, 
		tags = {"@Reg"},
        plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }
)
public class Runner {

}


//POM
//-Scenario Outline - with background
//-Properties
//-Excel
//-Tags
//-Allure
//-multiBrowser
//-Headless 
//-ParallelExecution
//-JSon
//
//
//
