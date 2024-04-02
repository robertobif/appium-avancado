package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenRestaurante extends BaseScreen{
    @AndroidFindBy(accessibility = "adress-button")
    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"add-item-buttom\"])[1]")
    public RemoteWebElement addItem;

    @AndroidFindBy(accessibility = "adress-button")
    @iOSFindBy(accessibility = "open-cart-button")
    public RemoteWebElement irAoCarrinho;

}
