package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;

public class searchBar
{
    public void searchSteps()
    {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("Build your own computer");
    }

    public void search_button_click()
    {
        Hooks.driver.findElement(By.className("search-box-button")).click();
    }

}
