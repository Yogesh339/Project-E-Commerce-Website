package ecommerce.testscripts;

import ecommerce.pages.LoginPage;
import org.testng.annotations.Test;

public class TestLoginFunction extends BaseClass {
    @Test
    public void verifyLogin() throws InterruptedException {

        LoginPage login = new LoginPage(driver);

        login.loginApplication("standard_user", "secret_sauce");


    }
}
