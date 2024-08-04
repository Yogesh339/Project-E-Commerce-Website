package ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompleteSauce {
    WebDriver driver;

    public CheckoutCompleteSauce(WebDriver driver) {
        this.driver = driver;
    }

    public void checkoutdone() {
        WebElement message = driver.findElement(By.xpath("//h2[@class='complete-header']"));
        System.out.println("Message Printed is :" + message.getText());
    }
}
