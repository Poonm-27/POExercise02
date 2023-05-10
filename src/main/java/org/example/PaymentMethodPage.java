package org.example;

import org.openqa.selenium.By;

public class PaymentMethodPage extends Utils{
    private By _creditCardPayment = By.xpath("(//div[@class='payment-details']//label)[2]");
    private By _clickContinue = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    public void selectCreditCard(){
        //select credit card payment
        clickOnElement(_creditCardPayment);
    }
    public void clickContinue(){
        //click continue
        clickOnElement(_clickContinue);
    }
}

