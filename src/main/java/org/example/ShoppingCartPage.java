package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    static String expectedProductName = "Leica T Digital Camera (Mirrorless)";
    private By _actualProductNameInShoppingCart = By.xpath("//a[@class='product-name']");

    public void verifyProductNameInShoppingCartAndCompare(){

        //print product name in shopping cart after adding to cart
        String actualProduct_nameInShoppingCart = getTextFromElement(_actualProductNameInShoppingCart);
        System.out.println("Product name after adding in the shopping cart: " + actualProduct_nameInShoppingCart);
        Assert.assertEquals(actualProduct_nameInShoppingCart, expectedProductName, "Product name in Shopping cart is incorrect.");

    }
}
