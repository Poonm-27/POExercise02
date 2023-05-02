package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends Utils{
   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    static String expectedCommunityPollVoteErrorMsg = "Registered users should vote";
    static String expectedVoteConfirmationMsg = "Thanks for voting" ;
    private By _registerButton = By.xpath("//a[@class='ico-register']");

    //private By _registerButton = By.className("ico-register");
    //a[@class='ico-register']

   // private By _clickGood = By.id("pollanswers-2");
   //private By _clickGood = By.xpath("//ul[@class='poll-options']/li[2]/input");
   private By _clickGood = By.xpath("//input[@id='pollanswers-2']");

    //private By _clickGood = By.xpath("//label[text()='Good']");

    //private By _clickVote = By.id("vote-poll-1");

    private By _clickVote = By.xpath("//div[@class='poll']/div[1]/button");
    private By _errorMsgForUnregisteredUser = By.xpath("//div[@class='poll-vote-error']");

    //private By _errorMsgForUnregisteredUser = By.id("block-poll-vote-error-1");
    private By _clickAddToCartButton = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/button[1]");
    private By _clickOnHTCAddToCompareButton =By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _clickOnVirtualGiftCardAddToCompareButton =By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _waitUntilProductComparisonLink =By.xpath("//p[@class='content']");
    private By _clickOnProductComparisonLink =By.xpath("//a[text()='product comparison']");

    //private By _clickOnProductComparisonLink =By.linkText("product comparison");
    private By _clickOnElectronics = By.xpath("(//a[@title='Show products in category Electronics'])[1]");
    private By _clickOnAddToCart_BuildYourOwnComputer =By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

    private By _waitUntilVisibleVoteConfirmationMsg = By.xpath("//span[@class='poll-total-votes']");


    public void clickOnRegisterButton() {

        clickOnElement(_registerButton);
    }

    public void clickOnGood(){

        clickOnElement(_clickGood);
    }
    public void clickOnVote(){

        //waitForElementToBeClickable(_clickVote);

        clickOnElement(_clickVote);
    }
    public void verifyUnregisteredUserSeeErrorMessage(){

        //apply explicit wait of 30 seconds
        waitForElementToBeClickable(_errorMsgForUnregisteredUser);

        //print message
        String actualVoteEligibilityErrorMsg = getTextFromElement(_errorMsgForUnregisteredUser);
        System.out.println("Actual Poll vote error message : "+actualVoteEligibilityErrorMsg);

        //compare
        Assert.assertEquals(actualVoteEligibilityErrorMsg,expectedCommunityPollVoteErrorMsg,"You are not registered user to vote");

    }
    public void clickOnAddToCartButtonOfAppleMacPro13inch(){

        //click on Add To Cart Button of Apple Mac
        clickOnElement(_clickAddToCartButton);
    }

    public void clickOnHTCAddToCompareButton(){
        //click on add to compare button of HTC One
        clickOnElement(_clickOnHTCAddToCompareButton);
        waitForElementToBeInvisible(_waitUntilProductComparisonLink);
    }
    public void clickOn$25VirtualGiftCardAddToCompareButton(){
        //click on add to compare button of $25 Virtual Gift Card
        clickOnElement(_clickOnVirtualGiftCardAddToCompareButton);
        waitForElementToBeClickable(_waitUntilProductComparisonLink);
    }
    public void clickOnProductComparisonLink(){
        //click on product comparison link
        clickOnElement(_clickOnProductComparisonLink);
    }

    //TestCase - 5
    public void clickOnElectronics(){
        //click on electronics
        clickOnElement(_clickOnElectronics);
    }

    public void clickOnAddToCart_BuildYourOwnComputer(){
        //click on add to cart button of Build your own computer
        clickOnElement(_clickOnAddToCart_BuildYourOwnComputer);
    }
    public void verifyConfirmationMsgWhenVoteIsClicked(){

        waitForElementToBeVisible(_waitUntilVisibleVoteConfirmationMsg);

        //Print and verify the expected with actual vote confirmation message when Good is entered
        String actualVoteFeedbackMsg = getTextFromElement(_waitUntilVisibleVoteConfirmationMsg);
        System.out.println("Actual confirmation message : "+actualVoteFeedbackMsg);
        Assert.assertEquals(actualVoteFeedbackMsg,expectedVoteConfirmationMsg,"Vote Confirmation Message is not correct");

    }
}
