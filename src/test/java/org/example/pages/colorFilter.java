package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class colorFilter
{
    public void colorSelect()
    {
        Hooks.driver.findElement(By.id("attribute-option-15")).click();
    }
}
