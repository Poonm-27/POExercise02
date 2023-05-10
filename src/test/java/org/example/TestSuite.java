package org.example;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    /*create objects of all the classes on which required actions are performed and use those objects
    to call those here*/
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    AppleMacPro13InchPage appleMacPro13InchPage = new AppleMacPro13InchPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    CompareProductPage compareProductPage = new CompareProductPage();
    ElectronicsPage electronicsPage =new ElectronicsPage();
    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    LoginPage loginPage = new LoginPage();
    Build_Your_Own_ComputerPage buildYourOwnComputerPage = new Build_Your_Own_ComputerPage();
    NikeProductPage nikeProductPage = new NikeProductPage();
    CommentPageNopCommerceNewRelease commentPageNopCommerceNewRelease = new CommentPageNopCommerceNewRelease();
    NewCommentAddedPage newCommentAddedPage =new NewCommentAddedPage();
    Facebook_NopCommerce_Page facebookNopCommercePage=new Facebook_NopCommerce_Page();
    //SwitchMainProgram switchMainProgram = new SwitchMainProgram();
    CheckOutAsGuestPage checkOutAsGuestPage =new CheckOutAsGuestPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    ShippingMethodPage shippingMethodPage =new ShippingMethodPage();
    PaymentMethodPage paymentMethodPage=new PaymentMethodPage();
    CreditCardPaymentPage creditCardPaymentPage=new CreditCardPaymentPage();
    ConfirmOrderPage confirmOrderPage=new ConfirmOrderPage();
    CheckOutCompletedPage checkOutCompletedPage =new CheckOutCompletedPage();

    @Test
    //To verify user should be able to register successfully
    public void verifyUserShouldBeAbleToRegisterSuccessfully() {

        homePage.clickOnRegisterButton();
        //click on register button

        //fill registration details
        registerPage.enterRegistrationDetails();

        //verify user registered succesfully
        registerResultPage.verifyUserRegisteredSuccessfully();

    }

    @Test

    //To verify only registered user should be able to vote
    public void verifyUserShouldBeAbleToVote() {

        //click on Good
        homePage.clickOnGood();

        //click on vote
        homePage.clickOnVote();

        //user should see error message
        homePage.verifyUnregisteredUserSeeErrorMessage();
    }

    @Test

    //To verify only registered user should be able to email a friend
    public void verifyUserShouldBeAbleToEmail_A_Friend() {
        //click on Add To Cart Button of Apple Mac
        homePage.clickOnAddToCartButtonOfAppleMacPro13inch();

        //click on Email a friend button
        appleMacPro13InchPage.clickOnEmailAFriendButton();

        //type friend's email id
        //type your email id
        //type message
        //Name of the product being referred to the friend before send email
        //click send email button
        emailAFriendPage.enterDetailsAndSendMessage();

    }

    @Test
    //To verify user should be able to add two products in compare list and then clear list
    public void verifyUserShouldBeAbleToAdd_2_Products_inCompareListAndClear() {

        //click on add to compare button of HTC One
        homePage.clickOnHTCAddToCompareButton();

        //click on add to compare button of $25 Virtual Gift Card
        homePage.clickOn$25VirtualGiftCardAddToCompareButton();

        //click on product comparison link
        homePage.clickOnProductComparisonLink();

        //User should be able to see two products in compare list
        //click on clear list
        //print msg to compare
        compareProductPage.verifyUserShouldBeAbleToAddToProductsInCompareListAndClear();
    }


    @Test

    //To verify user should be able to see same products in shopping cart after adding them
    public void verifyUserShouldBeAbleToSeeSameProductAddedInShoppingCart() {

        //click on electronic page
        homePage.clickOnElectronics();

        //click on camera & photo on electronics page
        electronicsPage.clickOnCameraAndPhoto();

        //print to verify product name before add to cart
        cameraAndPhotoPage.VerifyProductNameBefrAddToCart_Leica();

        //click on add to cart
        cameraAndPhotoPage.clickOnAddToCartButton_LeicaMirrorless_DigitalCamera();

        //click on shopping cart
        cameraAndPhotoPage.clickOnShoppingCartLink();

        //print product name in shopping cart after adding to compare
        shoppingCartPage.verifyProductNameInShoppingCartAndCompare();
    }

    @Test

    //To verify that registered user should be able to refer a product to friend
    public void verifyRegisteredUserShouldBeAbleToReferProductToFriend()  {
        //click on Register button
        homePage.clickOnRegisterButton();

        //Enter Registration details
        //type firstname
        //type lastname
        //type email address
        //type password
        //type confirm password
        //click on submit button
        registerPage.enterRegistrationDetailsforTest_Scenario_Refer_A_Product();

        //click on login on homepage
        registerResultPage.clickOnLogin();

        //enter login credentials on login page
        //enter email id
        //enter password
        //click on LOGIN button
        loginPage.enterLoginCredentialsAndSubmit();

        //click on add to cart button of Build your own computer on homepage
        homePage.clickOnAddToCart_BuildYourOwnComputer();

        //click on email a friend on "Build your own computer" page
        buildYourOwnComputerPage.clickEmailAFriendButton();

        //enter email a friend details on email a friend page
        //enter email id of friend
        //enter your email id
        //enter personal message
        //click on send email
        emailAFriendPage.enterDetailsToSendEmailAndVerifyReferredProductNameAfterEmailSent();

    }

    @Test

    //To verify that registered user should be able to vote successfully
    public void verifyRegisteredUserShouldAbleToVoteSuccesfully()  {

        //click on Register button
        homePage.clickOnRegisterButton();

        //Enter Registration details
        //type firstname
        //type lastname
        //type email address
        //type password
        //type confirm password
        //click on submit button
        registerPage.enterRegistrationDetailsforTest_Scenario_Refer_A_Product();

        //click on login on homepage
        registerResultPage.clickOnLogin();

        //enter login credentials on login page
        //enter email id
        //enter password
        //click on LOGIN button
        loginPage.enterLoginCredentialsAndSubmit();

        //click on Good
        homePage.clickOnGood();

        //click on vote
        homePage.clickOnVote();

        //Print and verify the expected with actual vote confirmation message when Good is entered
        homePage.verifyConfirmationMsgWhenVoteIsClicked();
    }

    @Test
    public void verifyUserisAbleToPrintAllTheProductNames(){
        homePage.printOutProductTitles();
    }
    @Test
    public void verifyAbleToPrintCategoryNames(){
        homePage.printThreeCategory();
    }

    @Test

    //verify user should be able to get alert popup message when search button is clicked
    public void verifyUserAbleToAcceptOrClickOkWhenAlertMsgOccurs(){
        homePage.verifyAlertIsPopUpWhileClickingSearchButton();
    }

    @Test

    //To verify user should be able to select and verify the currency accordingly on homepage
    public void verifyUserIsAbleToSelectAndVerifyCurrencyAccordingly(){
        homePage.selectAndVerifyCurrency();
    }

    @Test

    //To verify user should be able to search given product successfully
    public void verifyUserShouldBeAbleToSearchForGivenProductSuccessfully(){
        //Type Nike in search text field
        homePage.enterTextInSearchTextfield();

        //click on Search button
        homePage.clickOnSearchButton();

        //verify the word Nike is present in all product names listed
        nikeProductPage.verifyProductNamesContainsWordNike();
    }

    @Test

    //To verify the comment message added appear at the last in the list of comments
    public void verifyCommentMsgAddedDisplayedAtTheEndOfCommentList(){

        //Go to nopCommerce-new-release on homepage and click on Details
        homePage.clickOnDetailsButton();

        //Enter all comment details
       commentPageNopCommerceNewRelease.enterCommentDetails();

        //Check whether my comment is added at the end of list of comments
        newCommentAddedPage.verifyCommentsAddedAtTheEndOfCommentList();
    }

    @Test

    /*Verify user is able to navigate to multiple windows and return back to
     main window(handle multiple windows)*/
    public void verifyUserShouldAbleToHandleMultipleWindows() {

        //click on facebook icon on homepage
        homePage.clickOnFB_icon();

        //switch to child window and verify facebook page
        facebookNopCommercePage.switchToChild();

        //verify message is coming after switching to homepage (main window)
        homePage.verifyWelcomeToOurStore();
    }

    @Test

    //Verify Guest user should be able to check out successfully
    public void guestUserShouldAbleToCheckOutSuccessfully() throws InterruptedException {
        //click Add to cart button of Build your own computer
        homePage.clickOnAddToCart_BuildYourOwnComputer();

        //select all specifications You want for your product
        buildYourOwnComputerPage.enter_Details_Befr_AddingToCart();

        //Go to shopping cart and assert .The specs you selected should appear in shopping cart page
        shoppingCartPage.verifyAndAssert_All_Product_Specifications();

        //click on check out
        shoppingCartPage.clickCheckOut();

        //click on Check Out as guest
        checkOutAsGuestPage.clickOnCheckOutAsGuest();

        //Enter all billing address details
        billingAddressPage.enterBillingAddressDetails();

        //Select Next Day Air on Shipping method page
        shippingMethodPage.clickOnNextDayAir();

        //click on continue button
        shippingMethodPage.clickContinue();

        //select credit card payment
        paymentMethodPage.selectCreditCard();

        //click continue
        paymentMethodPage.clickContinue();

        //Enter Credit card details
        creditCardPaymentPage.enterCreditCardDetails();

        //check and confirm order
        confirmOrderPage.checkBillingAndShippingAddressAreSame();
        confirmOrderPage.clickConfirm();

        //verify order completed successfully message
        checkOutCompletedPage.verifyOrderCompletedMsg();

    }

    @Test

    //Verify Alert popup when vote is clicked without selecting any option

    public void verifyUserClickOnVoteAndGetAlert(){

        //click on vote & accept Alert message
        homePage.verifyUserClickOnVoteAndAcceptAlert();
    }

}