package com.web.app.tests;

import com.web.app.tests.base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static com.web.app.tests.config.ConfigUtil.getRGConfig;

public class ProfileTest extends BaseTest {

    @Test
    @Owner("Vadym Mykhailenko")
    @Description("Check User Profile Page")
    public void loginRG() {
        loginAction
                .clickLoginButton()
                .fillFramesAndTapLogin(getRGConfig().getUserEmail(), System.getProperty("user_pass"))
                .checkMainElement()
                .moveToProfilePage()
                .mainElementsOnPageCheck();
    }
}
