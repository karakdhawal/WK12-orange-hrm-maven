package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test (priority = 1)
    public void verifyUserShouldLoginSuccessfully (){
        loginPage.loginToApplication("Admin", "admin123");
        homePage.getEmployeeInformationText();
    }
    @Test (priority = 2)
    public void verifyThatLogoDisplayOnHomePage (){
        loginPage.loginToApplication("Admin", "admin123");
        homePage.getLogo();
    }

    @Test (priority = 3)
    public void verifyUserShouldLogOutSuccessfully () throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        homePage.clickOnUserProfileLogo();
        Thread.sleep(1000);
        homePage.mouseHoverOnLogOutnClick();
        loginPage.getLoginText();
    }
}
