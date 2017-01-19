package org.cucumber.spring;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;


@Component
public class CloseContextListener implements ApplicationListener<ContextClosedEvent> {

    @Autowired
    private WebDriver webDriver;

    public void onApplicationEvent(ContextClosedEvent event){

        webDriver.close();
    }

}
