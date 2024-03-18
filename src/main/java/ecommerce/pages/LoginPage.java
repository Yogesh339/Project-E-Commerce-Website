package ecommerce.pages;

import ecommerce.testscripts.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseClass {

    By usernameid = By.id("user-name");
    By passwordid = By.id("password");

    By btnlogin = By.id("login-button");

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginApplication(String userName, String password) throws InterruptedException {
        PageActions action = new PageActions();
        action.enterValue(driver, usernameid, "standard_user");
        action.enterValue(driver, passwordid, "secret_sauce");
        action.performClick(driver, btnlogin);
    }

}
