package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

    public static WebDriver BrowserOptions(String browser) {

        WebDriver driver = null;

        if(browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
        }

        ConfigReader config = new ConfigReader();

        driver.get(config.getAppURL());

        return driver;
    }
}