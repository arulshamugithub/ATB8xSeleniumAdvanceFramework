package com.thetestingacademy.pages.pageObjectModel;

import com.thetestingacademy.base.CommonToAllPage;
import com.thetestingacademy.utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage_POM extends CommonToAllPage {

    WebDriver driver;

    public Loginpage_POM(WebDriver driver){
     this.driver = driver;

    }

   //page locators
    private By username = By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");


   //page actions

   public String loginToVWOLoginInvalidCreds(String user, String pwd){
     driver.get(PropertiesReader.readKey("url"));
     enterInput(username,user);
     enterInput(password,pwd);
     clickElement(signButton);
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);

       }
       String error_message_text = driver.findElement(error_message).getText();
       return error_message_text;
   }

    public void loginToVWOLoginCreds(String user, String pwd){
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signButton).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }

    }



}
