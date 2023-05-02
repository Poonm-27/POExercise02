package org.example;


import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    private By _firstname = By.xpath("//input[@id='FirstName']");
    private By _lastname =By.xpath("//input[@id='LastName']");
    private By _emailId = By.xpath("//input[@id='Email']");
    private By _password = By.xpath("//input[@id='Password']");
    private By _confirmPassword = By.xpath("//input[@id='ConfirmPassword']");

    private By _submitButton = By.xpath("//button[@id='register-button']");

    public void enterRegistrationDetails(){
        //type firstname
        typeText(_firstname,"TestFirstName");

        //type lastname
        typeText(_lastname,"TestLastName");

        //type email address
        typeText(_emailId,"testJava12"+timestamp()+"@gmail.com");

        //type password
        typeText(_password,"abc567");

        //type confirm password
        typeText(_confirmPassword,"abc567");

        //click on submit button
        clickOnElement(_submitButton);

    }

    public void enterRegistrationDetailsforTest_Scenario_Refer_A_Product(){
        //type firstname
        typeText(_firstname,"TestFirstName");

        //type lastname
        typeText(_lastname,"TestLastName");

        //type email address
        typeText(_emailId,"testing12345@gmail.com");

        //type password
        typeText(_password,"xyz%100");

        //type confirm password
        typeText(_confirmPassword,"xyz%100");

        //click on submit button
        clickOnElement(_submitButton);

    }
}
