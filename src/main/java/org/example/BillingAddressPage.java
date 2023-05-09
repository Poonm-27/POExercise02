package org.example;

import org.openqa.selenium.By;

public class BillingAddressPage extends Utils{
    private By _firstname =By.xpath("//input[@id='BillingNewAddress_FirstName']");
    private By _lastname = By.xpath("//input[@id='BillingNewAddress_LastName']");
    private By _email = By.xpath("//input[@id='BillingNewAddress_Email']");
    private By _countryDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    private By _stateDropdown =By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    private By _city =By.xpath("//input[@id='BillingNewAddress_City']");
    private By _address1 =By.xpath("//input[@id='BillingNewAddress_Address1']");
    private By _zipPostalCode =By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private By _phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private By _continue =By.xpath("(//button[@class='button-1 new-address-next-step-button'])[1]");

    public void enterBillingAddressDetails(){
        typeText(_firstname, "Rita");
        typeText(_lastname, "Thakur");
        typeText(_email, "test4321@gmail.com");
        selectByDisplayedText(_countryDropdown,"United Kingdom");
        selectByDisplayedText(_stateDropdown,"Other");
        typeText(_city,"London");
        typeText(_address1,"56h Grant Road");
        typeText(_zipPostalCode,"ZTT11A");
        typeText(_phoneNumber,"9854123456");
        clickOnElement(_continue);




    }
}
