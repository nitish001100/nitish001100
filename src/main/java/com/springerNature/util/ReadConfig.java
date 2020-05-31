package com.springerNature.util;

import com.springerNature.Runner;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
    public static Properties readConfig() throws IOException {
        Properties properties = new Properties();
        String propFileName = "config.properties";

        InputStream inputStream = Runner.class.getClassLoader().getResourceAsStream(propFileName);

        if (inputStream != null) {
            properties.load(inputStream);
        } else {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }
        return properties;
    }
}
