package com.web.app.tests.base;

import com.codeborne.selenide.WebDriverRunner;
import com.web.app.tests.action.LoginAction;
import com.web.app.tests.webdriver.CreateWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public LoginAction loginAction;

    @BeforeMethod
    public void init() {
        loginAction = new LoginAction();
        CreateWebDriver.createWebDriver();
        System.setProperty("user_pass", System.getenv("user_pass"));
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        WebDriverRunner.closeWebDriver();
    }
}
