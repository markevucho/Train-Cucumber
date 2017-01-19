package org.cucumber.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.train.cucumber.spring.SpringContextConfig;


import static org.junit.Assert.*;

@ContextConfiguration(classes = SpringContextConfig.class)
public class Scenario_GoToInputNumbersPage {

    @Autowired
    private WebDriver driver;

    public Scenario_GoToInputNumbersPage(){}

    @Given("^open Home Page of Primitive Calculator$")
    public void openHomePage(){
        driver.get("http://localhost:8080/train");
    }

    @When("^click on \"Go to input numbers page\"$")
    public void goToInputNumbersPage(){
        WebElement button=driver.findElement(By.id("submit"));
        button.click();

    }

    @Then("^get Primitive Calculator input numbers page$")
    public void getInputPage(){
        String title=driver.getTitle();
        assertEquals("Input Page",title);
    }

}
