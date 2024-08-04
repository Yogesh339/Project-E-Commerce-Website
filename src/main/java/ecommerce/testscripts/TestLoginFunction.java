package ecommerce.testscripts;

import ecommerce.pages.*;
import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestLoginFunction extends BaseClass {
    @Test
    public void verifyLogin() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        LoginPage login = new LoginPage(driver);

        login.loginApplication("standard_user", "secret_sauce");
        //Page Title Check
        HomePageSauce home = new HomePageSauce(driver);
        home.homePage();
        System.out.println(home.homePage());
        home.product();
        home.yourcart();
        home.checkout();

        CheckoutInfoSauce check = new CheckoutInfoSauce(driver);
        check.checkoutInfo();
        check.continueBtn();

        CheckoutOverviewSauce over = new CheckoutOverviewSauce(driver);
        over.overview();

        CheckoutCompleteSauce complete = new CheckoutCompleteSauce(driver);
        complete.checkoutdone();


    }

}
