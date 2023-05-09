package org.example;

import org.openqa.selenium.By;

public class CreditCardPaymentPage extends Utils{
    private By _creditCardType = By.xpath("//select[@id='CreditCardType']");
    private By _cardholderName =By.xpath("//input[@id='CardholderName']");
    private By _cardNumber =By.xpath("//input[@id='CardNumber']");
    private By _expiryMonth = By.xpath("//select[@id='ExpireMonth']");
    private By _expiryYear = By.xpath("//select[@id='ExpireYear']");
    private By _cardCode = By.xpath("//input[@id='CardCode']");
    private By _continue =By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public void enterCreditCardDetails(){
        //select the card type
        selectByValue(_creditCardType,"visa");
        //Enter cardholder name
        typeText(_cardholderName,"Rita");
        //Enter Card Number
        typeText(_cardNumber,"4532406670886405");
        //Select expiry month
        selectByIndexValue(_expiryMonth,7);
        //index 7

        //Select expiry year
        selectByValue(_expiryYear,"2029");
        //value="2029"

        //Enter card code
        typeText(_cardCode,"970");
        //970

        //click on continue
        clickOnElement(_continue);

    }
}
