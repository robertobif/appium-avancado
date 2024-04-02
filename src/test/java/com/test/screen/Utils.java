package com.test.screen;

import com.test.Hooks;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;

import static com.test.Hooks.getDriver;

public class Utils {

    public void validateTxt(RemoteWebElement element, String txt) {
        String texto = element.getText();
        assert texto.equals(txt);
    }

    public void scrollToTextAndroid(String txt) {
        try {
            ((AndroidDriver)getDriver()).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + txt + "\").instance(0))");
        } catch (Exception e) {
            throw new NoSuchElementException("Não encontrado" + e);
        }
    }

    public void scrollIos(RemoteWebElement elemento) {
        HashMap scrollObjects = new HashMap();
        scrollObjects.put("element", elemento);
        scrollObjects.put("direction", "up");
        Hooks.getDriver().executeScript("mobile: swipe", scrollObjects);
    }
}