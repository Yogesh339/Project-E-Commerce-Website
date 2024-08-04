package ecommerce.pages;

import ecommerce.testscripts.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageSauce extends BaseClass {
    WebDriver driver;
    By pageheading = By.xpath("//div[text()='Swag Labs']");

    public HomePageSauce(WebDriver dr) {
        this.driver = dr;
    }

    public boolean homePage() {
        WebElement pageTitle = driver.findElement(pageheading);
        return pageTitle.isDisplayed();
    }

    public void product() {
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
    }
    public void yourcart(){
        WebElement cart=driver.findElement(By.xpath("//span[@class='title']"));
        System.out.println("Cart Page is visible: "+cart.isDisplayed());
    }
    public void checkout(){
       driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }
}
