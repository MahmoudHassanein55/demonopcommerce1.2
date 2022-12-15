package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.resetPasswordPage;

public class resetPasswordStepDef
{
    resetPasswordPage reset = new resetPasswordPage();
    @Then("user click on my account")
    public void user_click_on_my_account()
    {
        reset.myAccountLink().click();
    }
    @When("user go to change password page")
    public void user_go_to_change_password_page()
    {
        reset.changePasswordPage();
    }
    @And("user enter oldPassword and newPassword")
    public void user_enter_valid_data()
    {
        reset.changePasswordSteps();
    }
    @And("click on change button")
    public void click_on_change_button()
    {
        reset.changePasswordButton();
    }
}
