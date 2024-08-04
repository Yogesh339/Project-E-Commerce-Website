package ecommerce.pages;

import ecommerce.testscripts.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInfoSauce extends BaseClass {
    WebDriver driver;

    public CheckoutInfoSauce(WebDriver dr) {
        this.driver = dr;
    }

    public void checkoutInfo() {
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Justin");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Parker");
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("123456");
    }
    public void continueBtn(){
        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }
}
