package com.thetestingacademy.base;

import org.openqa.selenium.By;

import static com.thetestingacademy.driver.DriverManager.getDriver;

public class CommonToAllPage {

    public CommonToAllPage(){

    }
    public void clickElement(By by){
        getDriver().findElement(by).click();

    }

    public void enterInput(By by, String key){
        getDriver().findElement(by).sendKeys(key);
    }
     public void getText(By by){
        getDriver().findElement(by).getText();
     }



}
