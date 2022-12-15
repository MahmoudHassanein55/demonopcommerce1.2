package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class compareList
{
    public void compareliststep()
    {
        Hooks.driver.findElement(By.className("add-to-compare-list-button")).click();
    }
}
