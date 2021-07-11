package com.selenium.testrunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "Features" }, 
		glue = { "com.selenium.stepdef" },
		plugin = { "pretty","html:target/cucumber-report/CalculatorReport.html","json:target/cucumber.json"}, 
		monochrome = true,
		tags= "@Addition or @Multiplication"

)



public class TestRunner {

}
