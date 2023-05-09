package org.example;

import org.openqa.selenium.By;

public class CommentPageNopCommerceNewRelease extends Utils {

    private By _actualCommentAddedConfirmationMsg =By.xpath("//div[@class='fieldset new-comment']/div[2]/div[1]");
    private By _actualCommentAddedAtEndOfCommentList =By.xpath("//div[@class='comment-list']/div[2]/div[4]");
    public void enterCommentDetails(){

        //Enter the Title
        typeText(By.cssSelector("input.enter-comment-title"),"Great Products");

        //Type the comment
        typeText(By.cssSelector("textarea.enter-comment-text"),"All products are outstanding");

        //click on New Comment
        clickOnElement(By.cssSelector("div.buttons button"));
    }
}
