package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Categories
{
    public void selectCategories()
    {
        Actions actions = new Actions(Hooks.driver);
        WebElement menuOption = Hooks.driver.findElement(By.xpath("//div[@class=\"header-menu\"]//a[@href=\"/computers\"]"));
        actions.moveToElement(menuOption).perform();
        WebElement subMenuOption = Hooks.driver.findElement(By.xpath("//ul[@class=\"sublist first-level\"] //a[@href=\"/desktops\"]"));
        actions.moveToElement(subMenuOption).perform();
        subMenuOption.click();
        //Hooks.driver.findElement(By.xpath("//ul[@class=\"first-level\"]//a[@href=\"/shoes\"]")).click();
        //Select selectCategories = new Select(Hooks.driver.findElement(By.cssSelector("a[href=\\\"/apparel\\\"]")));
        //selectCategories.selectByVisibleText("Shoes ");
       // WebElement Apparel = Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));

    }
}
