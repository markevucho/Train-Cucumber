package org.cucumber.spring;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = CloseContextListener.class)
public class SpringContextConfig {

    @Bean
    public WebDriver webDriver(){

        return new FirefoxDriver();
    }



}
