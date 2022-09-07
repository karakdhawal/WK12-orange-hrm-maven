package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsersTest extends TestBase {

    HomePage homePage = new HomePage();

    LoginPage loginPage = new LoginPage();

    AdminPage adminPage = new AdminPage();

    AddUserPage addUserPage = new AddUserPage();

    DashboardPage dashboardPage = new DashboardPage();

    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();

    @Test
    public void verifyUserShouldNavigateToLoginPage (){
        String actualText = loginPage.getLoginText();
        String expectedText = "Login";
        Assert.assertEquals(expectedText, actualText);
    }

    @Test (priority = 1)
    public void adminShouldAddUserSuccessfully() throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        adminPage.clickonAdminLink();
        viewSystemUsersPage.getSystemUsersText();
        adminPage.clickOnAddButton();
        addUserPage.getAddUserText();
        addUserPage.selectUserRole();
        addUserPage.employeeName();
        addUserPage.userName();
        addUserPage.selectStatus();
        addUserPage.password();
        addUserPage.confirmPassword();
        addUserPage.save();
        Thread.sleep(50000);
    //    viewSystemUsersPage.getsuccessfullySavedText();

    }

    @Test (priority = 2)
    public void searchTheUserCreatedAndVerify () throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        adminPage.clickonAdminLink();
        viewSystemUsersPage.getSystemUsersText();
        viewSystemUsersPage.enterUserName();
        //  viewSystemUsersPage.userNameForVerify();
        viewSystemUsersPage.selectUserRole();
        viewSystemUsersPage.selectStatus();
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.getVerifyRecordFoundText();
    }

    @Test (priority = 3)
    public void verifyThatAdminShouldDeleteTheUserSuccessFully () throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        adminPage.clickonAdminLink();
        viewSystemUsersPage.getSystemUsersText();
        viewSystemUsersPage.enterUserName();
        viewSystemUsersPage.selectUserRole();
        viewSystemUsersPage.selectStatus();
        viewSystemUsersPage.clickOnSearchButton();
        viewSystemUsersPage.getVerifyRecordFoundText();
        viewSystemUsersPage.clickOnCheckBox();
        viewSystemUsersPage.clickOnDeleteButton();
        viewSystemUsersPage.verifyPopUpDisplay();

        viewSystemUsersPage.clickOnYesButtonOnPop();
    }

    @Test (priority = 4)
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        loginPage.loginToApplication("Admin", "admin123");
        adminPage.clickonAdminLink();
        viewSystemUsersPage.getSystemUsersText();
        viewSystemUsersPage.enterUserName();
        viewSystemUsersPage.selectUserRole();
        viewSystemUsersPage.selectStatus();
        viewSystemUsersPage.clickOnSearchButton();


    }
}
