package com.KSTT.cosmos.autotests.core;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
/**
 * Created by arzhanov on 04.12.15.
 */
public class CosmosPage extends PageObject{
    WebDriver driver;

    @FindBy(xpath = "//body[contains(@class,'unsupportedBrowsers')]")
    private WebElementFacade warningUnsupportedBrowsers;

    public boolean isBrowserSupported() {
        return !warningUnsupportedBrowsers.isCurrentlyEnabled();
    }
}
