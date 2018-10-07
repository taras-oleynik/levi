package com.ebay.step_definitions;

import static org.testng.AssertJUnit.assertEquals;

import com.ebay.pageobjects.HomePage;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class BlankStepDefs{
    HomePage homePage = new HomePage();



    @When("^I open finance website$")
    public void i_open_finance_website() throws Throwable {
        System.out.println(homePage.currencyUsdDif());

    }

    @Then("^I validate the difarance between buy and sale USD$")
    public void i_validate_the_difarance_between_buy_and_sale_USD() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I validate the difarance between buy and sale EUR$")
    public void i_validate_the_difarance_between_buy_and_sale_EUR() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^I validate the difarance between buy and sale RUB$")
    public void i_validate_the_difarance_between_buy_and_sale_RUB() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


}