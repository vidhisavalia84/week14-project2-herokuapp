package com.herokuapp.internet.testsuit;

import com.herokuapp.internet.pages.PasswordErrorMessagePage;
import com.herokuapp.internet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordErrorMessagePageTest extends BaseTest {

    PasswordErrorMessagePage object = new PasswordErrorMessagePage();

    @Test
    public void verifyThePasswordErrorMessage() {
        object.enterUserName("tomsmith");
        object.enterPassword("SuperSecretPassword");
        object.clickOnLoginButton();
        Assert.assertEquals(object.verifyMessage(), "Your password is invalid!\n" + "×");
    }


}
