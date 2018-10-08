package com.ebay.pageobjects;


import com.ebay.servise.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.ebay.servise.WebDriverFactory.getDriver;


public class HomePage extends AbstractPage {


    @FindBy(xpath = "//div[@class='widget-currency_bank']//tbody/tr[1]/td[1]/span/span[1]")
    private WebElement stringBuyUsd;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//td[2]/span[1]/span[1])[1]")
    private WebElement stringSaleUsd;


    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//tr[2]/td/span/span[1])[1]")
    private WebElement stringBuyEur;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//td[2]/span[1]/span[1])[2]")
    private WebElement stringSaleEur;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//tr[3]//span[1]/span[1])[1]")
    private WebElement stringBuyRub;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//tr[3]//span)[5]")
    private WebElement stringSaleRub;

    private double saleUsd = Double.parseDouble(stringSaleUsd.getText());
    private double buyUsd = Double.parseDouble(stringBuyUsd.getText());

    private double saleEur = Double.parseDouble(stringSaleEur.getText());
    private double buyEur = Double.parseDouble(stringBuyEur.getText());

    private double saleRub = Double.parseDouble(stringSaleRub.getText());
    private double buyRub = Double.parseDouble(stringBuyRub.getText());




    public double currencyUsdDif() {
        double usdDiff = saleUsd - buyUsd;
        Math.round(usdDiff);
        return usdDiff;
    }

    public double currencyEurDif() {
        double eurDiff = saleEur - buyEur;
        Math.round(eurDiff);
        return eurDiff;
    }

    public double currencyRubDif() {
        double rubDiff = saleRub - buyRub;
        Math.round(rubDiff);
        return rubDiff;
    }

    public String getTitle() {
        return getDriver().getTitle();

    }
    public double getSaleUsd() {
        return saleUsd;
    }

    public double getBuyUsd() {
        return buyUsd;
    }

    public double getSaleEur() {
        return saleEur;
    }

    public double getBuyEur() {
        return buyEur;
    }

    public double getSaleRub() {
        return saleRub;
    }

    public double getBuyRub() {
        return buyRub;
    }
}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	