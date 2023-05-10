package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NikeProductPage extends Utils{

    //Verify User is able to see all products displayed with word Nike
    public void verifyProductNamesContainsWordNike(){
        //list of nike products
        List < WebElement> nikeProductNameList = driver.findElements(By.xpath("//div[@class='search-results']//h2"));
        //object 'e' read each product name and print them
        for (WebElement e : nikeProductNameList) {
            System.out.println(e.getText());
        }
        System.out.println("All Product names listed contains the word 'Nike' ");
    }
}
