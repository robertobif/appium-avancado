package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;
public class ScreenHome extends BaseScreen{

    @AndroidFindBy(accessibility = "adress-button")
    @iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"address-button\"]")
    public RemoteWebElement selecionEnd;

    @AndroidFindBy(accessibility = "adress-button")
    @iOSFindBy(accessibility = "Permitir")
    public RemoteWebElement popupPermitir;

    @AndroidFindBy(accessibility = "adress-button")
    @iOSFindBy(xpath = "(//XCUIElementTypeOther[@name=\"store-list-item\"])[1]")
    public RemoteWebElement restaurante;

}
