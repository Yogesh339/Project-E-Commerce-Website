package ecommerce.testscripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
    WebDriver driver;

    @BeforeMethod

    public void inItBrowser() {


        WebDriverManager.chromedriver().setup();
        // 1. Open Chrome Browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Enter URL
        driver.get("https://www.saucedemo.com/");

    }

    @AfterMethod
    public void exitBrowser() {
        driver.close();
    }
}
