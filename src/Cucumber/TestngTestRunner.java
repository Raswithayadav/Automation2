package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/Cucumber",glue="website.Stepdefinitions",
monochrome=true,plugin= {"html:target/cucumber.html"})
public class TestngTestRunner extends AbstractTestNGCucumberTests {

}
