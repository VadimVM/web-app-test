package com.web.app.tests.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.web.app.tests.constant.Constant.LoginPageConstants.APP_NAME;

public class UserPageAction {

    private static final Logger LOGGER = LogManager.getLogger(UserPageAction.class.getSimpleName());

    public UserPageAction checkMainElement() {
        LOGGER.info("user check main element on his page");
        $("[data-testid='headerLoggedIn']").should(visible);
        $("[aria-label='%s']".formatted(APP_NAME)).should(visible);
        $("[aria-label='Profile']").should(visible);
        $(".c-content").should(visible);
        return this;
    }
}
