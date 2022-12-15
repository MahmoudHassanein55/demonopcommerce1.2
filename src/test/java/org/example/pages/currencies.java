package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class currencies
{
    public void selectcurrencie() {
        Select selectEuro = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        selectEuro.selectByVisibleText("US Dollar");
    }
}
