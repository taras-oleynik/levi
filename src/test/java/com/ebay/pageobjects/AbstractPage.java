package com.ebay.pageobjects;

import org.openqa.selenium.support.PageFactory;

import static com.ebay.servise.WebDriverFactory.getDriver;

public abstract class AbstractPage {
	public AbstractPage() {
		PageFactory.initElements(getDriver(), this);
	}

}
