package org.example;

import org.openqa.selenium.By;

public class ElectronicsPage extends Utils{
    private By _clickOnCameraAndPhoto = By.xpath("//img[@title='Show products in category Camera & photo']");
    public void clickOnCameraAndPhoto(){
        //click on camera & photo
        clickOnElement(_clickOnCameraAndPhoto);
    }
}
