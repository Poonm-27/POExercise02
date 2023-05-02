package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils{
    private By _enterEmailId = By.xpath("//input[@id='Email']");
    private By _enterPassword = By.xpath("//input[@id='Password']");
    private By _clickLoginButton = By.xpath("(//div[@class='buttons']/button)[2]");

    public void enterLoginCredentialsAndSubmit(){
        //enter email id
        typeText(_enterEmailId,"testing12345@gmail.com");

        //enter password
        typeText(_enterPassword,"xyz%100");

        //click on LOGIN button
        clickOnElement(_clickLoginButton);
    }

}
