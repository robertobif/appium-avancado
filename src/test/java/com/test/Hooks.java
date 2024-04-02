package com.test;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private static AppiumDriver<?> driver;
    public static String platform = "";

    public static AppiumDriver<?> validateDriver() throws MalformedURLException {

        platform = System.getProperty("plataforma");
        System.out.println("Sua plataforma é: " + platform);

        if (platform.equals("android")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "C:\\Users\\Usuário\\Downloads\\appium-com-cucumber\\apps\\novo\\app-release.apk");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

        } else if (platform.equals("ios")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "/Users/robertobif/Documents/Estudos/appium-avancado/apps/novo/qazandoqafood.app");
            capabilities.setCapability("deviceName", "iPhone 8 Plus");
            capabilities.setCapability("platformName", "IOS");
            capabilities.setCapability("platformVersion", "15.5");
            capabilities.setCapability("automationName", "XCUITest");
            driver = new IOSDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        } else if (platform.equals("devicefarm")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            // Set your access credentials
            capabilities.setCapability("browserstack.user", "seu user");
            capabilities.setCapability("browserstack.key", "sua key");

            // Set URL of the application under test
            capabilities.setCapability("app", "bs://44ff73dea22d9887fef5d025889871525df95b76");

            // Specify device and os_version for testing
            capabilities.setCapability("device", "Google Pixel 3");
            capabilities.setCapability("os_version", "9.0");

            driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
        } else if (platform.equals("devicefarm")) {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            // Set your access credentials
            capabilities.setCapability("browserstack.user", "seu user");
            capabilities.setCapability("browserstack.key", "sua key");

            // Set URL of the application under test
            capabilities.setCapability("app", "bs://44ff73dea22d9887fef5d025889871525df95b76");

            // Specify device and os_version for testing
            capabilities.setCapability("device", "Google Pixel 3");
            capabilities.setCapability("os_version", "9.0");

            driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
        } else {
            System.out.println("Plataforma não encontrada. Utilize android ou ios");
        }
        return driver;
    }

    public static AppiumDriver<?> getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Before
    public static void startProject() throws MalformedURLException {
        if (getDriver() != null) {
            getDriver().launchApp();
        } else {
            validateDriver();
        }
    }
}