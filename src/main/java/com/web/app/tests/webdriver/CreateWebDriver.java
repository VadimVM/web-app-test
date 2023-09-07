package com.web.app.tests.webdriver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.web.app.tests.config.ConfigUtil.getRGConfig;

public class CreateWebDriver {
    private static final Logger LOGGER = LogManager.getLogger("[CreateWebDriver]");


    public static void createWebDriver() {

        Configuration.browser = String.format("com.web.app.tests.webdriver.%s",
                System.getProperty("web_driver", "LocalWebDriverProvider"));
        Selenide.open(getRGConfig().getApplicationUrl());
        Configuration.timeout = 30000;
        Configuration.pollingInterval = 10;
        Configuration.reportsFolder = "test-result/reports";
        LOGGER.info("new browser started and {} opened", getRGConfig().getApplicationUrl());

    }
}
