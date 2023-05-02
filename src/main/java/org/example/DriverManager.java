package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


//class DriverManager have access to all reusable methods of Utils class
public class DriverManager extends Utils {

    /*method with no return type and no parameter and while running testcase
    testNG will apply all the below code to the application at the beginning*/

    public static void openBrowser(){
        //Create the new instance of the Chrome driver and open Chrome browser
        driver = new ChromeDriver();
        //open demonopcommerce.com
        driver.get("https://demo.nopcommerce.com/");
        //maximize window
        driver.manage().window().maximize();
        //add implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //while finishing execution the below code will close the browser

    public static void closeBrowser(){
        //close the browser
        driver.close();
    }
}
