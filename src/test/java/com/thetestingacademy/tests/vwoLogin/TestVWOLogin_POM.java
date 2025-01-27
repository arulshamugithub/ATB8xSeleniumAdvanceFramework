package com.thetestingacademy.tests.vwoLogin;

import com.thetestingacademy.pages.pageObjectModel.Loginpage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM {

    @Owner("ArulJK")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginNegativeVWO(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        Loginpage_POM loginpage_pom = new Loginpage_POM(driver);
        String error_msg = loginpage_pom.loginToVWOLoginInvalidCreds("admin@gmail.com", "123");
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");
        driver.quit();
    }




}
