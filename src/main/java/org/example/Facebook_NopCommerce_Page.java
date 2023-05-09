package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Facebook_NopCommerce_Page extends Utils {
    private By _clickOnCancelButton = By.cssSelector("div.x92rtbv i");
    private By _allowCookies =By.xpath("(//div[contains(@aria-label,'Allow all cookies')])[2]");

    public void switchToChild() {
        String MainWindow = driver.getWindowHandle();
        String mainWindowUrl = driver.getCurrentUrl();
        System.out.println("The current main window is: " + mainWindowUrl);

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                //verify url of new windw
                String expectedChildWindowURL = "https://www.facebook.com/nopCommerce";
                String currentUrl = driver.getCurrentUrl();
                System.out.println("The current child window is: " + currentUrl);
                Assert.assertEquals(currentUrl, expectedChildWindowURL, "Url is matching");
                clickOnElement(_allowCookies);
                clickOnElement(_clickOnCancelButton);

                if (driver.findElements(By.xpath("(//input[@dir='ltr'])[1]")).size() != 0) {
                    System.out.println("Element Email is Present");
                } else {
                    System.out.println("Element Email is Absent");
                }
                if (driver.findElements(By.xpath("//input[@placeholder='Password']")).size() != 0) {
                    System.out.println("Element Password is Present");
                } else {
                    System.out.println("Element Password is Absent");
                }

                if (driver.findElements(By.xpath("//div[@aria-label='Accessible login button']")).size() != 0) {
                    System.out.println("Element Login Button is Present");
                } else {
                    System.out.println("Element Login Button is Absent");
                }

                System.out.println("The verified elements are : ");
                String emailOrphone = driver.findElement(By.xpath("//input[@placeholder='Email or phone']")).getAttribute("placeholder");
                System.out.println(emailOrphone);
                String password = driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("placeholder");
                System.out.println(password);
                List<WebElement> webElementList = driver.findElements(By.xpath("//div[@class='x6s0dn4 x78zum5 x1s65kcs x1pi30zi x1e558r4']"));
                for (WebElement e : webElementList)
                    System.out.println(e.getText());

                driver.close();

            }
        }
        driver.switchTo().window(MainWindow);
    }
}

