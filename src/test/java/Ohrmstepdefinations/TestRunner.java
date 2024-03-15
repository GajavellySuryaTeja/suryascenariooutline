package Ohrmstepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\Ohrmfeaturefile",
glue="Ohrmstepdefinations",
dryRun = false,
monochrome = true)

public class TestRunner {

}
