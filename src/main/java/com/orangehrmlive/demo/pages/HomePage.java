package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By verifyEmployeeInformationText = By.xpath("//h5[@class='oxd-text oxd-text--h5 oxd-table-filter-title']");

    By verifyLogo = By.xpath("//img[@alt='client brand banner']");

    By clickonUser = By.xpath("//span[@class='oxd-userdropdown-tab']");

    By mouseHoveronLogOut = By.xpath("//a[@href='/web/index.php/auth/logout']");

    public String getEmployeeInformationText (){
        return getTextFromElement(verifyEmployeeInformationText);
    }

    public String getLogo (){
        return getTextFromElement(verifyLogo);
    }

    public void clickOnUserProfileLogo (){
        clickOnElement(clickonUser);
    }
    public void mouseHoverOnLogOutnClick () {

        mouseHoverToElementAndClick(mouseHoveronLogOut);
    }
}
