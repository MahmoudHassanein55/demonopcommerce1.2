package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class wishlist
{
    public void wishlistSteps()
    {
        Hooks.driver.findElement(By.className("add-to-wishlist-button")).click();
    }
}
