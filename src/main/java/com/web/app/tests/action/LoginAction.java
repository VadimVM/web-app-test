package com.web.app.tests.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.web.app.tests.constant.Constant.LoginPageConstants.*;

public class LoginAction {
    private static final Logger LOGGER = LogManager.getLogger(LoginAction.class.getSimpleName());

    public LoginAction checkFirstPage() {
        LOGGER.info("user check main element on first page");
        $("[alt=ResearchGate]").should(visible);
        $(".index-main__header").should(visible, text(FIRST_PAGE_HEADER));
        $(".index-main__join-btn").should(visible, text(MAIN_JOIN_BTN));
        $(".index-header__log-in").should(visible, text(LOGIN_LINK));
        $(".index-header__sign-up").should(visible, text(MAIN_JOIN_BTN));
        return this;
    }

    public LoginAction clickLoginButton() {
        LOGGER.info("click on Log in btn");
        $(".index-header__log-in").should(visible, text(LOGIN_LINK)).click();
        return this;
    }

    public UserPageAction fillFramesAndTapLogin(String userName, String userPass) {
        LOGGER.info("user fill data and click Login btn");
        $("#input-login").should(visible, enabled).val(userName);
        $("#input-password").should(visible, enabled).val(userPass);
        $("[data-testid='loginCta']").should(visible, text(LOGIN_LINK)).click();
        return new UserPageAction();
    }
}
