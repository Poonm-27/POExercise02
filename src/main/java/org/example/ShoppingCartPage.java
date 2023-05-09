package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    static String expectedProductName = "Leica T Digital Camera (Mirrorless)";
    private By _actualProductNameInShoppingCart = By.xpath("//a[@class='product-name']");
    private By _checkOut = By.xpath("//button[@id='checkout']");
    private By _termsOfService = By.cssSelector("div.terms-of-service input");

    public void verifyProductNameInShoppingCartAndCompare(){

        //print product name in shopping cart after adding to cart
        String actualProduct_nameInShoppingCart = getTextFromElement(_actualProductNameInShoppingCart);
        System.out.println("Product name after adding in the shopping cart: " + actualProduct_nameInShoppingCart);
        Assert.assertEquals(actualProduct_nameInShoppingCart, expectedProductName, "Product name in Shopping cart is incorrect.");

    }
    public void verifyAndAssert_All_Product_Specifications() throws InterruptedException {

        String expectedSpecification = "Processor: 2.2 GHz Intel Pentium Dual-Core E2200\nRAM: 8GB [+$60.00]\nHDD: 320 GB\nOS: Vista Premium [+$60.00]\nSoftware: Microsoft Office [+$50.00]\nSoftware: Acrobat Reader [+$10.00]\nSoftware: Total Commander [+$5.00]";

        String actualProduct = getTextFromElement(By.xpath("//a[@class='product-name']"));
        System.out.println("Actual Product is : "+actualProduct);

        String actualSpecification =getTextFromElement(By.xpath("(//div[@class='attributes'])[2]"));
        System.out.println("Actual specification added are :\n\n"+actualSpecification);
        System.out.println("\n");

        sleep(3000);

        System.out.println("Expected specification should be :\n\n"+expectedSpecification);
        System.out.println("\n");
        Assert.assertEquals(actualSpecification,expectedSpecification,"The specification are not matching");
    }
    public void clickCheckOut(){
        //Accept terms of service
        clickOnElement(_termsOfService);

        //click on check out button
        clickOnElement(_checkOut);
    }

}
