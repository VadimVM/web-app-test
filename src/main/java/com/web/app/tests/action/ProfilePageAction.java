package com.web.app.tests.action;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.appium.SelenideAppium.$x;

public class ProfilePageAction {

    @Step
    public ProfilePageAction mainElementsOnPageCheck(){
        $(".profile-header-wrapper").should(Condition.visible);
        $(".profile-menu").should(Condition.visible);
        $("[role='menubar']").should(Condition.visible);
        $x("//*[text()='Profile']").should(visible);
        return this;
    }
}
