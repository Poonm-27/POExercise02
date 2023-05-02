package org.example;

import org.openqa.selenium.By;

public class CameraAndPhotoPage extends Utils{

    private By _actualLeicaProductName = By.xpath("//div[@class='products-wrapper']//a[text()='Leica T Mirrorless Digital Camera']");
    private By _clickOnAddToCart_LeicaTMirrorlessDigitalCamera = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]");
    private By _clickOnShoppingCarLink = By.xpath("//span[@class='cart-label']");

    public void VerifyProductNameBefrAddToCart_Leica() {

        //print to verify product name before add to cart
        String name = getTextFromElement(_actualLeicaProductName);
        System.out.println("Product name before adding to cart :" + name);
    }

    public void clickOnAddToCartButton_LeicaMirrorless_DigitalCamera() {

        //click on add to cart
        clickOnElement(_clickOnAddToCart_LeicaTMirrorlessDigitalCamera);
    }
    public void clickOnShoppingCartLink(){

        //click on shopping cart
        clickOnElement(_clickOnShoppingCarLink);
    }
}
