package org.example;

import org.openqa.selenium.By;


//class AppleMacPro13InchPage will inherit the Utils class
public class AppleMacPro13InchPage extends Utils {

    //locator of email a friend button by xpath
    private By _clickEmailAFriendButton = By.xpath("//div[@class='email-a-friend']/button");

    public void clickOnEmailAFriendButton(){
        //click on Email a friend button on AppleMacBookPro 13 inch page
        clickOnElement(_clickEmailAFriendButton);
    }
}
