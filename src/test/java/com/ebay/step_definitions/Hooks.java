package com.ebay.step_definitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;


import static com.ebay.servise.WebDriverFactory.getDriver;
import static com.ebay.servise.WebDriverFactory.setDriverToNull;


public class Hooks {


    @Before

    public void openBrowser() {
        getDriver().get("https://finance.i.ua/");
        getDriver().manage().deleteAllCookies();
    }

    @After
    public void closeBrowser() {
        getDriver().quit();
        setDriverToNull();
    }

    /**
     * Embed a screenshot in test report if test is marked as failed
     */


}