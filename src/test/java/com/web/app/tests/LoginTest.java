package com.web.app.tests;

import com.web.app.tests.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static com.web.app.tests.config.ConfigUtil.getRGConfig;

public class LoginTest extends BaseTest {

    @Test
    @Owner("Vadym Mykhailenko")
    @Description("Check login to researchGate")
    public void loginRG() {
        loginAction
                .checkFirstPage()
                .clickLoginButton()
                .fillFramesAndTapLogin(getRGConfig().getUserEmail(), System.getProperty("user_pass"))
                .checkMainElement();
    }
}
