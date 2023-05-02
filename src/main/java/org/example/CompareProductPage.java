package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductPage extends Utils{

    //variable declaration and initialisation (expected message stored in a variable "expectedmsg")
    static String expectedmsg = "Items not present in the compare list";

    //locators for web elements
    private By _productNameVirtualGiftCard = By.xpath("//table[@class='compare-products-table']/tbody/tr[3]/td[2]/a");
    private By _productNameHTC = By.xpath("//table[@class='compare-products-table']/tbody/tr[3]/td[3]/a");
    private By _clickOnClearList = By.xpath("//div[@class='page-body']/a");
    private By _actualMessageNoProductInCompareList =By.xpath("//div[@class='no-data']");


    public void verifyUserShouldBeAbleToAddToProductsInCompareListAndClear(){

        //User should be able to see two products in compare list
        String actualVirtual£25ProductName = getTextFromElement(_productNameVirtualGiftCard);
        String actualHTCProductName = getTextFromElement(_productNameHTC);
        System.out.println("Virtual product: "+actualVirtual£25ProductName);
        System.out.println("HTC product: "+actualHTCProductName);

        //click on clear list
        clickOnElement(_clickOnClearList);

        //print msg to compare
        String actualMessageWhenNoProductsInCompareList = getTextFromElement(_actualMessageNoProductInCompareList);
        System.out.println("Actual message after clear products from compare list= "+actualMessageWhenNoProductsInCompareList);
        Assert.assertEquals(actualMessageWhenNoProductsInCompareList,expectedmsg,"Message displayed is incorrect");

    }
}
