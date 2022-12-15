package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPage
{
    public WebElement loginLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public void loginSteps()
    {
        Hooks.driver.findElement(By.id("Email")).clear();
        Hooks.driver.findElement(By.id("Email")).sendKeys("example.email@gmail.com");
        Hooks.driver.findElement(By.id("Password")).clear();
        Hooks.driver.findElement(By.id("Password")).sendKeys("password");
    }

    public void login_button_click()
    {
        Hooks.driver.findElement(By.className("login-button")).click();
    }
}
