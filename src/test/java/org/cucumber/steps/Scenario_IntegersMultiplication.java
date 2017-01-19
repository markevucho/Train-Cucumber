package org.cucumber.steps;


import cucumber.api.java.en.And;
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

import java.util.List;

import static org.junit.Assert.*;

@ContextConfiguration(classes = SpringContextConfig.class)
public class Scenario_IntegersMultiplication {

    @Autowired
    private WebDriver driver;

    public Scenario_IntegersMultiplication(){}

    @Given("^go to input numbers page$")
    public void goToInputNumbersPage(){
        driver.get("http://localhost:8080/train/input");
    }

    @When("^enter (\\d+) and (\\d+)$")
    public void enterNumbers(int firstNumber, int secondNumber){

        WebElement firstInput=driver.findElement(By.name("first"));
        firstInput.sendKeys(String.valueOf(firstNumber));

        driver.findElement(By.name("second")).sendKeys(String.valueOf(secondNumber));

    }
    @And("^click \"Calculate\"$")
    public void clickCalculateButton(){

        driver.findElement(By.name("submit")).click();
    }

    @Then("^go to Result Page$")
    public void goToResultPage(){
        assertEquals("Result",driver.getTitle());
    }

    @And("^get result (\\d+)$")
    public void checkResult(int result){
        List<WebElement> tableRows=driver.findElement(By.tagName("table")).findElements(By.tagName("th"));

        assertEquals(String.valueOf(result),tableRows.get(1).getText());
    }

}
