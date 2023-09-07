package com.web.app.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger LOGGER = LogManager.getLogger("[MainMethod]");

    public static void main(String[] args) {
        LOGGER.info("logger check");
        System.out.println("Hello world!");
    }
}