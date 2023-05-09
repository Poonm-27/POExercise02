package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.lang.model.element.Element;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.List;
import java.util.Set;

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

    public static void selectByDisplayedText(By by,String text){
        Select birthDay = new Select(driver.findElement(by));
        birthDay.selectByVisibleText(text);
    }

    public static void selectByValue(By by,String text){
        Select birthMonth = new Select(driver.findElement(by));
        birthMonth.selectByValue(text);
    }
    public static void selectByIndexValue(By by,int num){
        Select birthYear =new Select(driver.findElement(by));
        birthYear.selectByIndex(num);
    }

    public static void alertPopUps_Assert_And_Accept(String text){
        //switch to alert
        Alert alert = driver.switchTo().alert();
        //verify alert message
        Assert.assertEquals(alert.getText(),text);
        //click on ok
        alert.accept();
    }
    public static void alertPopUps_Assert_And_Dismiss(String text){
        //switch to alert
        Alert alert = driver.switchTo().alert();
        //verify alert message
        Assert.assertEquals(alert.getText(),text);
        //click on ok
        alert.dismiss();
    }

    public static void alertPopUps_Assert_And_SendKeys(String text, String text2){
        //switch to alert
        Alert alert = driver.switchTo().alert();
        //verify alert message
        Assert.assertEquals(alert.getText(),text);
        //Enter specific text needed
        alert.sendKeys(text2);
    }

    public static void alertPopUps_getText(){
        driver.switchTo().alert().getText();
    }

    public static void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public static void list_of_items(By by){

        List<WebElement> list = driver.findElements(by);
        for (WebElement e : list) {
            System.out.println(e.getText());
        }
    }

}




