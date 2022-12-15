package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class tag
{
    public void pageLink()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/shoes");
    }
    public void tag_click()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/book\"]")).click();
    }
}
