package com.thetestingacademy.tests.vwoLogin;

import com.thetestingacademy.base.CommonToAllTest;
import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.pages.pageObjectModel.Loginpage_POM;
import com.thetestingacademy.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestVWOLogin_POM extends CommonToAllTest {

    @Owner("ArulJK")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginNegativeVWO(){

        Loginpage_POM loginpage_pom = new Loginpage_POM(DriverManager.getDriver());
        String error_msg = loginpage_pom.loginToVWOLoginInvalidCreds(PropertiesReader.readKey("invalid_username"), PropertiesReader.readKey("invalid_password"));
        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg, PropertiesReader.readKey("error_message"));

    }




}
