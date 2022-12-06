package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userName = By.id("username");
    By password = By.id("password");
    By loginButton = By.xpath("//i[contains(text(),'Login')]");

    By secureArea = By.xpath("//h2[contains(text(),'Secure Area')]");

    public void enterUserName(String text) {
        sendTextToElement(userName, text);
    }

    public void enterPassword(String text) {
        sendTextToElement(password, text);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
    public String verifyMessageText(){
        return getTextFromElement(secureArea);
    }
}
