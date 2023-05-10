package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewCommentAddedPage extends Utils {
    private By _addedComment = By.cssSelector("div.comment");

    public void verifyCommentsAddedAtTheEndOfCommentList()
    {
            ArrayList<String> comments = new ArrayList<>();
            for(WebElement e:driver.findElements(_addedComment))
            {
                System.out.println(e.getText());
                comments.add(e.getText());
            }
            String lastComment = comments.get(comments.size() - 1);
            if(lastComment.equalsIgnoreCase(String.valueOf(comments)))
            {
                String expectedLastComment = lastComment;
                Assert.assertEquals(lastComment,expectedLastComment,"Last comment in the list is not matching");
            }
    }
}
