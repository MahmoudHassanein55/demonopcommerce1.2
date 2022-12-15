package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class shoppingcart
{
    public void shoppingCartSteps()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/htc-one-m8-android-l-50-lollipop");

    }
    public void add_button_click()
    {
        Hooks.driver.findElement(By.id("add-to-cart-button-18")).click();
    }
}
