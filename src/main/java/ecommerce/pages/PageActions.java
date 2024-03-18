package ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageActions {
    public void enterValue(WebDriver driver, By locator, String value) {
        WebElement element = driver.findElement(locator);
        element.sendKeys(value);
    }

    public void performClick(WebDriver driver,By locator) {
        WebElement login = driver.findElement(locator);
        login.click();
    }
}
