package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ConfirmOrderPage extends Utils{
    private By _billingAdresss = By.xpath("//div[@class='billing-info-wrap']");
    private By _shippingAddress = By.xpath("//div[@class='shipping-info-wrap']");
    private By _clickOnConfirm =By.xpath("//button[@class='button-1 confirm-order-next-step-button']");
    public void checkBillingAndShippingAddressAreSame() {

        //div[@class='billing-info']
        String b = getTextFromElement(_billingAdresss);
        System.out.println("Actual Billing Address displayed : " + b);
        String s = getTextFromElement(_shippingAddress);
        System.out.println("Actual Shipping Address displayed : " + s);

    }

    public void clickConfirm(){
        // click on confirm
        clickOnElement(_clickOnConfirm);
    }


}
