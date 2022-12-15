package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.loginPage;

public class loginStepDef
{

    loginPage login = new loginPage();
    @Given("user go to login page")
    public void goLoginPage()
    {
        login.loginLink().click();
    }
    @When("user enter valid email and password")
    public void user_enter_valid_email_and_password()
    {
        login.loginSteps();
    }
    @And("user click on login button")
    public void user_click_on_login_button()
    {
        login.login_button_click();
    }
}
