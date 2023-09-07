package com.web.app.tests.constant;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Constant {
    public static final Path CONFIG_JSON_PATH = Paths.get("src", "main", "resources", "rg", "rg_config.json");


    public static class LoginPageConstants {
        public static final String FIRST_PAGE_HEADER = "Discover scientific knowledge and stay connected to the world of science";
        public static final String MAIN_JOIN_BTN = "Join for free";
        public static final String LOGIN_LINK = "Log in";
        public static final String APP_NAME = "ResearchGate";
    }

}
