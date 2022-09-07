package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginGroupingTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();
    AddUserPage addUserPage = new AddUserPage();

    @Test (groups = "regression")
    public void verifyUserShouldNavigateToLoginPage (){
        String actualText = loginPage.getLoginText();
        String expectedText = "Login";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test (groups = "sanity")
    public void verifyUserShouldLoginSuccessfully (){
        loginPage.loginToApplication("Admin", "admin123");
        homePage.getEmployeeInformationText();
    }
    @Test (groups = "smoke")
    public void verifyThatLogoDisplayOnHomePage (){
        loginPage.loginToApplication("Admin", "admin123");
        homePage.getLogo();
    }

//    @Test //(groups = {"smoke","sanity","regression"})
//    public void verifyUserShouldLogOutSuccessfully () throws InterruptedException {
//        loginPage.loginToApplication("Admin", "admin123");
//        homePage.clickOnUserProfileLogo();
//        Thread.sleep(1000);
//        homePage.mouseHoverOnLogOutnClick();
//        loginPage.getLoginText();
//    }
}
