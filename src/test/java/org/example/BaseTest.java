package org.example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils{
    //create instance of class DriverManager
    DriverManager driverManager = new DriverManager();
    @BeforeMethod
    public void setUp(){
        driverManager.openBrowser(); //call openBrowser method of DriverManger Class
    }

    @AfterMethod
    public void tearDown(){
        driverManager.closeBrowser(); //call closeBrowser method of DriverManger Class
    }
}
