package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CheckOutCompletedPage extends Utils{
    private By _actualConfirmationMsg= By.xpath("//div[@class='page-body checkout-data']/div[1]/div[1]/strong");
    private By _orderNumber = By.cssSelector("div.order-number");
    public void verifyOrderCompletedMsg(){
        // assert actual message
        String actualMsg = getTextFromElement(_actualConfirmationMsg);
        System.out.println(actualMsg);
        Assert.assertEquals(actualMsg,"Your order has been successfully processed!");

        //print order number
        String orderNo = getTextFromElement(_orderNumber);
        System.out.println("Order Number: "+orderNo);
    }
}
