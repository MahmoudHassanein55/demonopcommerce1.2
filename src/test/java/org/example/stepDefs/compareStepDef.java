package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.compareList;

public class compareStepDef
{
    compareList comlist = new compareList();
    @Given("user add to compare")
    public void user_add_to_compare()
    {
        comlist.compareliststep();
    }
}
