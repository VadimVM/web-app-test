package com.web.app.tests.util;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileUtil {
    private static final Logger LOGGER = LogManager.getLogger("FileUtil");

    public static String readFileAsString(final String pathName) {

        try {
            return FileUtils.readFileToString(new File(pathName), Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
