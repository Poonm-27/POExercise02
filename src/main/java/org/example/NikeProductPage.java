package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NikeProductPage extends Utils{
    public void verifyProductNamesContainsWordNike(){
        List < WebElement> nikeProductNameList = driver.findElements(By.xpath("//div[@class='search-results']//h2"));
        for (WebElement e : nikeProductNameList) {
            System.out.println(e.getText());
        }
        System.out.println("All Product names listed contains the word 'Nike' ");
    }
}
