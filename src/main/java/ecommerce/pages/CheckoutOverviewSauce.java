package ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewSauce {
    WebDriver driver;

    public CheckoutOverviewSauce(WebDriver driver) {
        this.driver=driver;
    }

    public void overview(){
        driver.findElement(By.xpath("//button[@id='finish']")).click();
    }
}
