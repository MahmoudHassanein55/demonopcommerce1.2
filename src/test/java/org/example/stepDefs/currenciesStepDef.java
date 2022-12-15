package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.currencies;

public class currenciesStepDef
{
    currencies currencie = new currencies();
    @Given("user select currencies")
    public void user_select_currencies()
    {
        currencie.selectcurrencie();
    }
}
