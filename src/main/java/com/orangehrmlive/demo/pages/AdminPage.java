package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AdminPage extends Utility {
    By adminLink = By.xpath("//div[@class='oxd-layout-navigation']/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/span[1]");


    By addButton = By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary']");



    public void clickonAdminLink (){
        clickOnElement(adminLink);
    }


    public void clickOnAddButton (){
        clickOnElement(addButton);
    }


}
