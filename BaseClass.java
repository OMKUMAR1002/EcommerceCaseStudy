package Framework.Pages;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utility.BrowserFactory;

public class BaseClass {

    public static WebDriver driver;

    @BeforeClass
    public void BrowserTest() {

        driver = BrowserFactory.BrowserOptions("chrome");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
    }

    @AfterClass
    public void tearDown() {
     driver.quit();
       
    }



}