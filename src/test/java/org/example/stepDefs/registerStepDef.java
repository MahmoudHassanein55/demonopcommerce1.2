package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class registerStepDef
{
    register register = new register();
    @Given("user go to register page")
    public void goToRegisterPage()
    {
        register.registerLink().click();
    }
    @When("user enter valid data")
    public void user_enter_valid_data()
    {
        register.registerSteps();
    }
    @And("user click on register button")
    public void user_click_on_register_button()
    {
        register.register_button_click();
    }
}
