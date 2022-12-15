package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class resetPasswordPage
{
    public WebElement myAccountLink()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }
    public void changePasswordPage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/customer/changepassword");
    }
    public void changePasswordSteps()
    {
        Hooks.driver.findElement(By.id("OldPassword")).sendKeys("password");
        Hooks.driver.findElement(By.id("NewPassword")).sendKeys("password1");
        Hooks.driver.findElement(By.id("ConfirmNewPassword")).sendKeys("password1");

    }
    public void changePasswordButton()
    {
        Hooks.driver.findElement(By.className("change-password-button")).click();
    }

}
