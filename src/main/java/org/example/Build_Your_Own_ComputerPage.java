package org.example;

import org.openqa.selenium.By;

public class Build_Your_Own_ComputerPage extends Utils{
    private By _clickEmailAFriend = By.xpath("//div[@class='email-a-friend']/button");
    private By _selectProccessor =By.xpath("//dd[@id='product_attribute_input_1']//select");
    private By _selectRAM = By.xpath("//dd[@id='product_attribute_input_2']//select");
    private By _selectHDD = By.xpath("(//dd[@id='product_attribute_input_3']//label)[1]");
    private By _selectOS = By.xpath("(//dd[@id='product_attribute_input_4']//label)[2]");
    private By _checkMicrosoftOffice =By.xpath("(//dd[@id='product_attribute_input_5']/ul/li/input)[1]");
    private By _checkAdobeReader =By.xpath("(//dd[@id='product_attribute_input_5']//label)[2]");
    //private By _checkAdobeReader =By.linkText(" Acrobat Reader [+$10.00]");

    private By _checkTotalCommander = By.xpath("(//dd[@id='product_attribute_input_5']//label)[3]");
    private By _clickAddTOCart = By.xpath("//button[@id='add-to-cart-button-1']");
    private By _clickShoppingCartLink = By.cssSelector("div.bar-notification a");
    public void clickEmailAFriendButton(){
        //click on email a friend
        clickOnElement(_clickEmailAFriend);
    }

    public void enter_Details_Befr_AddingToCart()  {
        //enter processor
        selectByDisplayedText(_selectProccessor,"2.2 GHz Intel Pentium Dual-Core E2200");

        //select RAM
        selectByValue(_selectRAM, "5");

        //select HDD 320 GB
        clickOnElement(_selectHDD);

        //select OS Vista Premium
        clickOnElement(_selectOS);

        //check Acrobat Reader software
        clickOnElement(_checkAdobeReader);

        //apply explicit wait
        waitForElementToBeClickable(_checkAdobeReader);

        //check Total Commander software
        clickOnElement(_checkTotalCommander);

        waitForElementToBeClickable(_checkTotalCommander);

        //click on Add to cart button
        clickOnElement(_clickAddTOCart);

        //click on Shopping cart link
        clickOnElement(_clickShoppingCartLink);

    }

}
