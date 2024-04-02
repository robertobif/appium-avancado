package com.test.screen;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.remote.RemoteWebElement;

public class ScreenPedido extends BaseScreen{

    @AndroidFindBy(accessibility = "order-sucess-txt")
    @iOSFindBy(accessibility = "order-sucess-txt")
    public RemoteWebElement txtPedidoRealizado;

}
