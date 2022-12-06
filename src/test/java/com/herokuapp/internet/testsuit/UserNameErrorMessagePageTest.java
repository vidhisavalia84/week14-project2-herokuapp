package com.herokuapp.internet.testsuit;

import com.herokuapp.internet.pages.UserNameErrorMessagePage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserNameErrorMessagePageTest extends BaseTest {
    UserNameErrorMessagePage object=new UserNameErrorMessagePage();

    @Test
    public void verifyTheErrorMessage(){
        object.enterUserName("tomsmith1");
        object.enterPassword("SuperSecretPassword!");
        object.clickOnLoginButton();
        Assert.assertEquals(object.getActualMessage(),"Your username is invalid!\n" + "×");
    }


}
