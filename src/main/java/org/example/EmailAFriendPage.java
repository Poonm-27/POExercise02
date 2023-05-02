package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Utils {
    static String expectedEmail_a_friendErrorMsg = "Email a friend is allowed only for registered user";
    static String expectedProductNameAfterSendingEmail = "Build your own computer with Peripherals";

   // private By _enterFriendEmailId = By.xpath("//input[@id='FriendEmail");
   private By _enterFriendEmailId = By.xpath("//input[@class='friend-email']");
    private By _enterYourEmailId = By.xpath("//input[@id='YourEmailAddress']");
    private By _enterMessage = By.xpath("//textarea[@id='PersonalMessage']");

    private By _enterPersonalMsg_BuildYourOwnComputer = By.xpath("//div[@class='form-fields']/div[3]/textarea");
    private By _productNameBeforeSendingEmail = By.xpath("//div[@class='page-body']/div[1]/h2/a");
    private By _clickSendEmailButton = By.xpath("//button[@class='button-1 send-email-a-friend-button']");
    private By _errorMessageForUnregisteredUsers =By.xpath("//div[@class='message-error validation-summary-errors']");
    private By _actualProductNameReferredAfterEmailSent = By.xpath("//a[@class='product']");

    public void enterDetailsAndSendMessage() {


        //type friend's email id
        typeText(_enterFriendEmailId, "testFriend@gmail.com");

        //type your email id
        typeText(_enterYourEmailId, "testUnique@gmail.com");

        //type message
        typeText(_enterMessage, "Apple Mac Product is very useful");

        //Name of the product being referred to the friend before send email
        String productNameBeforeSendEmail = getTextFromElement(_productNameBeforeSendingEmail);
        System.out.println("Product name before sending email to friend : " + productNameBeforeSendEmail);

        //click send email button
        clickOnElement(_clickSendEmailButton);

        //capture error message
        String actualErrorMessage = getTextFromElement(_errorMessageForUnregisteredUsers);
        System.out.println("Actual message:" + actualErrorMessage);
        Assert.assertEquals(actualErrorMessage, expectedEmail_a_friendErrorMsg, "Please Register yourself.");
    }

    public void enterDetailsToSendEmailAndVerifyReferredProductNameAfterEmailSent(){

        //type friend's email id
        typeText(_enterFriendEmailId, "testFriend@gmail.com");

        //type your email id
        typeText(_enterYourEmailId, " ");

        //type message
        typeText(_enterPersonalMsg_BuildYourOwnComputer,"Have a look at this product You can Build your own computer");

        //Name of the product being referred to the friend before send email
        String productNameBeforeSendEmail = getTextFromElement(_productNameBeforeSendingEmail);
        System.out.println("Product name before sending email to friend : " + productNameBeforeSendEmail);

        //click send email button
        clickOnElement(_clickSendEmailButton);

        //Name of the product referred to the friend after email has been sent
        String productNameAfterEmail = getTextFromElement(_actualProductNameReferredAfterEmailSent);
        System.out.println("Product name shown after sending email (Confirmation Message): "+productNameAfterEmail);
        Assert.assertEquals(productNameAfterEmail,expectedProductNameAfterSendingEmail,"Product name referred is incorrect");


    }
    ////a[@class='product']
}
