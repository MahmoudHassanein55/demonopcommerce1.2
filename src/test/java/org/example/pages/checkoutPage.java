package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class checkoutPage
{
    public void productPageLink()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop");
    }
    public void productToCart() throws InterruptedException {
        Hooks.driver.findElement(By.id("add-to-cart-button-18")).click();
        Thread.sleep(5000);
    }
    public void cartPageLink() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/cart");

    }
    public void checkout_Click()
    {
        Hooks.driver.findElement(By.id("termsofservice")).click();
        Hooks.driver.findElement(By.id("checkout")).click();
        Hooks.driver.findElement(By.id("Email")).sendKeys("example.email@gmail.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("password");
        Hooks.driver.findElement(By.className("login-button")).click();
    }
}
