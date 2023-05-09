package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {
    static String expectedCommunityPollVoteErrorMsg = "Registered users should vote";
    static String expectedVoteConfirmationMsg = "Thanks for voting";

    private By _clickSearchWithoutEntering = By.xpath("//button[@class='button-1 search-box-button']");
    private By _registerButton = By.xpath("//a[@class='ico-register']");
    private By _clickGood = By.xpath("//input[@id='pollanswers-2']");
    private By _clickVote = By.xpath("//div[@class='poll']/div[1]/button");
    private By _errorMsgForUnregisteredUser = By.xpath("//div[@class='poll-vote-error']");
    private By _clickAddToCartButton = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _clickOnHTCAddToCompareButton = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _clickOnVirtualGiftCardAddToCompareButton = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _waitUntilProductComparisonLink = By.xpath("//p[@class='content']");
    private By _clickOnProductComparisonLink = By.xpath("//a[text()='product comparison']");
    private By _clickOnElectronics = By.xpath("(//a[@title='Show products in category Electronics'])[1]");
    private By _clickOnAddToCart_BuildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private By _waitUntilVisibleVoteConfirmationMsg = By.xpath("//span[@class='poll-total-votes']");
    private By _textInSearchTextfield = By.cssSelector("div.search-box input");
    private By _clickOnSearchButton = By.cssSelector("div.search-box button");
    private By _clickOnDetailsButton = By.xpath("//div[@class='news-items']/div[2]/div[3]/a");
    private By _clickOnFacebookIcon = By.cssSelector("li.facebook");
    private By _verifyMessageAfterSwitchingMainWindow = By.cssSelector("div.topic-block-title h2");
    private By _priceInDollars = By.cssSelector("div.product-grid span");
    private By _priceInEuro = By.cssSelector("div.product-grid span");


    public void clickOnRegisterButton() {

        clickOnElement(_registerButton);
    }

    public void clickOnGood() {

        clickOnElement(_clickGood);
    }

    public void clickOnVote() {

        //waitForElementToBeClickable(_clickVote);

        clickOnElement(_clickVote);
    }

    public void verifyUnregisteredUserSeeErrorMessage() {

        //apply explicit wait of 30 seconds
        waitForElementToBeClickable(_errorMsgForUnregisteredUser);

        //print message
        String actualVoteEligibilityErrorMsg = getTextFromElement(_errorMsgForUnregisteredUser);
        System.out.println("Actual Poll vote error message : " + actualVoteEligibilityErrorMsg);

        //compare
        Assert.assertEquals(actualVoteEligibilityErrorMsg, expectedCommunityPollVoteErrorMsg, "You are not registered user to vote");

    }

    public void clickOnAddToCartButtonOfAppleMacPro13inch() {

        //click on Add To Cart Button of Apple Mac
        clickOnElement(_clickAddToCartButton);
    }

    public void clickOnHTCAddToCompareButton() {
        //click on add to compare button of HTC One
        clickOnElement(_clickOnHTCAddToCompareButton);
        waitForElementToBeInvisible(_waitUntilProductComparisonLink);
    }

    public void clickOn$25VirtualGiftCardAddToCompareButton() {
        //click on add to compare button of $25 Virtual Gift Card
        clickOnElement(_clickOnVirtualGiftCardAddToCompareButton);
        waitForElementToBeClickable(_waitUntilProductComparisonLink);
    }

    public void clickOnProductComparisonLink() {
        //click on product comparison link
        clickOnElement(_clickOnProductComparisonLink);
    }

    //TestCase - 5
    public void clickOnElectronics() {
        //click on electronics
        clickOnElement(_clickOnElectronics);
    }

    public void clickOnAddToCart_BuildYourOwnComputer() {
        //click on add to cart button of Build your own computer
        clickOnElement(_clickOnAddToCart_BuildYourOwnComputer);
    }

    public void verifyConfirmationMsgWhenVoteIsClicked() {

        waitForElementToBeVisible(_waitUntilVisibleVoteConfirmationMsg);

        //Print and verify the expected with actual vote confirmation message when Good is entered
        String actualVoteFeedbackMsg = getTextFromElement(_waitUntilVisibleVoteConfirmationMsg);
        System.out.println("Actual confirmation message : " + actualVoteFeedbackMsg);
        Assert.assertEquals(actualVoteFeedbackMsg, expectedVoteConfirmationMsg, "Vote Confirmation Message is not correct");

    }

    public void printOutProductTitles() {
        // driver.findElements(By.cssSelector("div.product-grid h2"));
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));

        for (WebElement e : productList) {
            System.out.println(e.getText());
        }
    }

    public void printThreeCategory() {
        List<WebElement> categoryList = driver.findElements(By.cssSelector("div.category-grid h2"));
        for (WebElement e : categoryList) {
            System.out.println(e.getText());
        }
    }

    public void verifyAlertIsPopUpWhileClickingSearchButton() {
        //click on search button
        clickOnElement(_clickSearchWithoutEntering);
        //create object for alert
        Alert alert = driver.switchTo().alert();
        //compare actual with expected
        Assert.assertEquals(alert.getText(), "Please enter any product name");
        //click on OK
        alert.accept();
    }

    public void selectAndVerifyCurrency() {
        //click on currency dropdown
        selectByDisplayedText(By.cssSelector("div.currency-selector select"), "US Dollar");
        // verify and print all product prices in dollars when US Dollar is selected
        list_of_items(_priceInDollars);

        //click on currency dropdown
        selectByIndexValue(By.cssSelector("div.currency-selector select"), 1);
        // verify and print all product prices in euro when Euro is selected
        list_of_items(_priceInEuro);
    }

    public void enterTextInSearchTextfield() {
        //enter Nike in search box
        typeText(_textInSearchTextfield, "Nike");
    }

    public void clickOnSearchButton() {
        //click on search button
        clickOnElement(_clickOnSearchButton);
    }

    public void clickOnDetailsButton() {
        //click on Details button
        clickOnElement(_clickOnDetailsButton);
    }


    public void clickOnFB_icon() {
        //click on facebook icon
        clickOnElement(_clickOnFacebookIcon);
    }

    public void verifyWelcomeToOurStore(){
        String expectedMsgAfterSwitchToMainWindow= "Welcome";
        //verify Welcome to our store message
        String message = getTextFromElement(_verifyMessageAfterSwitchingMainWindow);
        System.out.println("Message on homepage after switching: "+message);
        Assert.assertEquals(message,expectedMsgAfterSwitchToMainWindow,"The Message is incorrect");
    }

    public void verifyUserClickOnVoteAndAcceptAlert(){
        //click on vote
        clickOnElement(_clickVote);

        //verify and accept alert
        alertPopUps_Assert_And_Accept("Please select an answer");
    }

}
