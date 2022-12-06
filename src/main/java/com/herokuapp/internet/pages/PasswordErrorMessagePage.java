package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class PasswordErrorMessagePage extends Utility {
    By userName = By.id("username");
    By password = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");
    By actualText = By.id("flash");

    public void enterUserName(String userNameText) {
        sendTextToElement(userName, userNameText);

    }

    public void enterPassword(String passwordText) {
        sendTextToElement(password, passwordText);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String verifyMessage() {
        return getTextFromElement(actualText);
    }


}
