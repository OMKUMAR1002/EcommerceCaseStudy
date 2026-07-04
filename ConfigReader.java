package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties pro;

    public ConfigReader() {

        try {

            File src = new File("./Configuration/config.properties");

            FileInputStream fis = new FileInputStream(src);

            pro = new Properties();

            pro.load(fis);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public String getAppURL() {

        return pro.getProperty("AppUrl");
    }

    public String getBrowser() {

        return pro.getProperty("Browser");
    }
}