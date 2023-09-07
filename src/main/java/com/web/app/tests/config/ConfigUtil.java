package com.web.app.tests.config;

import com.google.gson.Gson;
import com.web.app.tests.util.FileUtil;

import static com.web.app.tests.constant.Constant.CONFIG_JSON_PATH;

public class ConfigUtil {

    public static Config getRGConfig() {
        return new Gson().fromJson(FileUtil.readFileAsString(CONFIG_JSON_PATH.toString()), Config.class);
    }
}
