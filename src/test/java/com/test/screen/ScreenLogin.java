package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;

public class ScreenLogin extends BaseScreen {

    @AndroidFindBy(accessibility = "email")
    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@name=\"email\"]")
    public RemoteWebElement campoEmail;

    @AndroidFindBy(accessibility = "password")
    @iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@name=\"password\"]")
    public RemoteWebElement campoSenha;

    @AndroidFindBy(accessibility = "login-button")
    @iOSFindBy(accessibility = "login-button")
    public RemoteWebElement botaoLogin;
}