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
        //Create/declare list of strings
            ArrayList<String> comments = new ArrayList<>();

            //object e will read each string element and print them through xpath given
            for(WebElement e:driver.findElements(_addedComment))
            {
                System.out.println(e.getText());
                comments.add(e.getText());
            }
            // Comment added at the end of the array i.e. (array_size -1)
            String lastComment = comments.get(comments.size() - 1);

            //checks whether last comment added is equal to the actual comment xpath given
            if(lastComment.equalsIgnoreCase(String.valueOf(comments)))
            {
                String expectedLastComment = lastComment;
                //verify whether expected and actual are same or not
                Assert.assertEquals(lastComment,expectedLastComment,"Last comment in the list is not matching");
            }
    }
}
