package org.example;

import org.openqa.selenium.By;

public class CheckOutAsGuestPage extends Utils{
    private By _checkOutAsGuest = By.xpath("//div[@class='customer-blocks']/div[1]/div[3]/button[1]");

    public void clickOnCheckOutAsGuest(){

        clickOnElement(_checkOutAsGuest);
    }
}
