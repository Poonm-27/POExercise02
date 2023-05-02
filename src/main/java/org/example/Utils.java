package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;

//class to access WebDriver from BasePage class
public class Utils extends BasePage{

    //All reusable methods to perform specific action.
    public static void clickOnElement(By by){

        driver.findElement(by).click();
    }

    public static void typeText(By by, String text){
        driver.findElement(by).sendKeys(text);

    }

    public static long timestamp(){
        Timestamp timestamp =new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();
    }

    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    public static void waitForElementToBeClickable(By by){
        //apply explicit wait of 20 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForElementToBeInvisible(By by){
        //apply explicit wait of 20 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }
    public static void waitForElementToBeVisible(By by){
        //apply explicit wait of 30 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
