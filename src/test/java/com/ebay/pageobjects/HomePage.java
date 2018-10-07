package com.ebay.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends AbstractPage {


    @FindBy(xpath = "//div[@class='widget-currency_bank']//tbody/tr[1]/td[1]/span/span[1]")
    private WebElement stringSaleUsd;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//td[2]/span[1]/span[1])[1]")
    private WebElement stringBuyUsd;


    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//tr[2]/td/span/span[1])[1]")
    private WebElement stringSaleEur;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//td[2]/span[1]/span[1])[2]")
    private WebElement stringBuyEur;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//tr[3]//span[1]/span[1])[1]")
    private WebElement stringSaleRub;

    @FindBy(xpath = "(//div[@class='widget-currency_bank']//tbody//tr[3]//span)[5]")
    private WebElement stringBuyRub;

    private double saleUsd = Double.parseDouble(stringSaleUsd.getText());
    private double buyUsd = Double.parseDouble(stringBuyUsd.getText());

    public double currencyUsdDif() {
        double usdDiff = buyUsd - saleUsd;

        return usdDiff;
    }

}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	