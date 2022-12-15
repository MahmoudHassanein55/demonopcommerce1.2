package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class register
{
    public WebElement registerLink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    public void registerSteps()
    {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("mahmoud");
        Hooks.driver.findElement(By.id("LastName")).sendKeys("hassan");
        Select selectDay = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        selectDay.selectByValue("27");
        Select selectMonth = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        selectMonth.selectByValue("10");
        Select selectYear = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        selectYear.selectByValue("1996");
        Hooks.driver.findElement(By.id("Email")).sendKeys("example.email@gmail.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("password");
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("password");
    }

    public void register_button_click()
    {
        Hooks.driver.findElement(By.id("register-button")).click();
    }

}
