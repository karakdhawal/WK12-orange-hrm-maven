package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    By addUserText = By.xpath("//h6[@class= 'oxd-text oxd-text--h6 orangehrm-main-title']");

    By userRol = By.xpath("//div[@class='oxd-select-wrapper']//div[text()='Admin']");

  //  By sidePanel = By.xpath("//div[@class='oxd-sidepanel-body']/div[1]/div[1]/button[1]/i");
    By userRole = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By admin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Admin')]");

    By status = By.xpath("//div[@class='oxd-form-row']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By disable = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(),'Disabled')]");
    By user = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");


    By employeeNm = By.xpath("//input[@placeholder='Type for hints...']");

    By nam = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]");

    By userNm = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/input");

    By passWd = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[1]/div[1]/div[2]/input");

    By confirmPw = By.xpath("//div[@class='oxd-form-row user-password-row']/div[1]/div[2]/div[1]/div[2]/input");

    By sav = By.xpath("//button[@type='submit']");

    public String getAddUserText (){
        return getTextFromElement(addUserText);
    }

    public void selectUserRole (){
//        clickOnElement(sidePanel);
        mouseHoverToElementAndClick(userRole);
        clickOnElement(admin);
//        selectByContainsTextFromDropDown(userRol, "Admin");
        sendTextToElement(user, "Admin");
    }

    public void employeeName () throws InterruptedException {
        sendTextToElement(employeeNm, "G");
        Thread.sleep(3000);
        clickOnElement(nam);

    }

    public void userName (){
        sendTextToElement(userNm, "gautam");
    }
    public void selectStatus () throws InterruptedException {
        clickOnElement(status);
        Thread.sleep(1000);
        clickOnElement(disable);
    }
    public void password (){
        sendTextToElement(passWd, "Orange@123");
    }
    public void confirmPassword (){
        sendTextToElement(confirmPw, "Orange@123");
    }
    public void save (){
        clickOnElement(sav);
    }
}
