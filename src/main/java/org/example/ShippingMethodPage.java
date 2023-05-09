package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils {
    private By _nextDayAir = By.xpath("//div[@id='checkout-shipping-method-load']/div[1]/div[1]/ul/li[2]/div/input");
    private By _continue = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public void clickOnNextDayAir(){
        clickOnElement(_nextDayAir);
    }

    public void clickContinue(){
        clickOnElement(_continue);
    }
}
