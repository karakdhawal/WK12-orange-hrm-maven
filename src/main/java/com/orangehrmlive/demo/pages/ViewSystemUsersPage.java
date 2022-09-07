package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {

    By successfullySave = By.linkText("Successfully Saved");
    By systemUsersText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");

    By userNam = By.xpath("//div[@class='oxd-form-row']/div[1]/div[1]/div[1]/div[2]/input[1]");

    By userroleDownArrow = By.xpath("//div[@class='oxd-form-row']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By userrolAdmin = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(), 'Admin')]");

    By employeeNam = By.xpath("//input[@placeholder='Type for hints...']");
    By nam = By.xpath("//*[@class='oxd-autocomplete-wrapper']//*[contains(text(),'Goutam  Ganesh')]");

    By statusDownArrow = By.xpath("//div[@class='oxd-form-row']/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");

    By statudDisabl = By.xpath("//*[@class='oxd-select-wrapper']//*[contains(text(), 'Disabled')]");

    By searchButton = By.xpath("//button[@type='submit']");

    By verifyUser = By.xpath("//div[@class='orangehrm-paper-container']//div[2]/div[1]/span");
//    By verifyUser = By.xpath("//div[@class='oxd-table-card']/div[1]/div[2]/div[1]");

    By verifyUsergautam = By.xpath("//*[@class='oxd-table']//*[contains(text(),'goutam')]");

    By checkBox = By.xpath("//div[@class='oxd-table-body']/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]/i");

    By delete = By.xpath("//div[@class='oxd-table-body']/div[1]/div[1]/div[6]/div[1]/button[1]/i[1]");

    By popUpWindow = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--card-body']");

    By popUpYes = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");



    public String getSystemUsersText (){
        return getTextFromElement(systemUsersText);
    }

    public String getsuccessfullySavedText ( ){
        return getTextFromElement(successfullySave);
    }

    public void userNameForVerify (){
        sendTextToElement(userNam,"Goutam.Ganesh");
    }

    public void enterUserName (){
        sendTextToElement(userNam, "gautam");
    }

    public void selectUserRole () throws InterruptedException {
        clickOnElement(userroleDownArrow);
        Thread.sleep(1000);
        clickOnElement(userrolAdmin);
    }
    public void employeeName () throws InterruptedException {
        sendTextToElement(employeeNam, "g");
        Thread.sleep(1000);
        clickOnElement(nam);
    }
    public void selectStatus (){
        clickOnElement(statusDownArrow);
        clickOnElement(statudDisabl);
    }

    public void clickOnSearchButton (){
        clickOnElement(searchButton);
    }
    public String getVerifyRecordFoundText (){
        return getTextFromElement(verifyUser);
    }

    public void clickOnCheckBox (){
        clickOnElement(checkBox);
    }

    public void clickOnDeleteButton (){
        clickOnElement(delete);
    }
    public String verifyPopUpDisplay (){
        return getTextFromElement(popUpWindow);
    }
    public void clickOnYesButtonOnPop (){
        clickOnElement(popUpYes);
    }
}
