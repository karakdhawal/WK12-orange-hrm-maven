package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By loginText = By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']");
    By usernameField = By.xpath("//input[@name='username']");
    By passwordField = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@type='submit']");


    public String getLoginText (){
        return getTextFromElement(loginText);
    }

    public void enterUserName (String username){
        sendTextToElement(usernameField, username);
    }

    public void enterPassWord (String pass){
        sendTextToElement(passwordField, pass);
    }
    public void clickOnLoginButton (){
        clickOnElement(loginButton);
    }



    public void loginToApplication (String username, String pass){
        enterUserName(username);
        enterPassWord(pass);
        clickOnLoginButton();
    }

    
}
