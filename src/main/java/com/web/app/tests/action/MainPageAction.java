package com.web.app.tests.action;

import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.appium.SelenideAppium.$x;
import static com.web.app.tests.constant.Constant.LoginPageConstants.APP_NAME;

public class MainPageAction {

    private static final Logger LOGGER = LogManager.getLogger(MainPageAction.class.getSimpleName());

    @Step
    public MainPageAction checkMainElement() {
        LOGGER.info("user check main element on his page");
        $("[data-testid='headerLoggedIn']").should(visible);
        $("[aria-label='%s']".formatted(APP_NAME)).should(visible);
        $("[aria-label='Profile']").should(visible);
        $(".c-content").should(visible);
        return this;
    }

    @Step
    public ProfilePageAction moveToProfilePage() {
        $("[aria-label='Profile']").should(visible).click();
        $$("[role='menuitem']").should(CollectionCondition.sizeGreaterThan(0));
        $x("//*[text()='Your profile']").should(visible).click();
        return new ProfilePageAction();
    }
}
