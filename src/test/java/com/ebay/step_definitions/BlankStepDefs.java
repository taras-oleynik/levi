package com.ebay.step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import com.ebay.pageobjects.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class BlankStepDefs{
    HomePage homePage = new HomePage();



    @When("^I open finance website$")
    public void i_open_finance_website() throws Throwable {
assertEquals("Курс валют и конвертер валют: курс доллара, курс евро и курс рубля в обменниках украинских банков",homePage.getTitle());


    }
    @Then("^I validate sale price is greater than buy for USD$")
    public void i_validate_sale_price_is_greater_than_buy_for_USD() throws Throwable {
        assertEquals(homePage.getSaleUsd()>homePage.getBuyUsd(),true);


    }

    @Then("^I validate sale price is greater than buy for EUR$")
    public void i_validate_sale_price_is_greater_than_buy_for_EUR() throws Throwable {
        assertEquals(homePage.getSaleEur()>homePage.getBuyEur(),true);

    }

    @Then("^I validate sale price is greater than buy for RUB$")
    public void i_validate_sale_price_is_greater_than_buy_for_RUB() throws Throwable {
        assertEquals(homePage.getSaleRub()>homePage.getBuyRub(),true);

    }



}