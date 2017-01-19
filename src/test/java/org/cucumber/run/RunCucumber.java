package org.cucumber.run;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"},glue = "org.train.cucumber.stepdefs", features = "classpath:org/train/cucumber/features")
public class RunCucumber {

}
