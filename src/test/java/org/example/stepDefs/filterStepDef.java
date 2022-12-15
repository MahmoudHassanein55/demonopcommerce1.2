package org.example.stepDefs;

import io.cucumber.java.en.And;
import org.example.pages.colorFilter;

public class filterStepDef
{
    colorFilter colorF = new colorFilter();
    @And("user click on color")
    public void user_click_on_color()
    {
        colorF.colorSelect();
    }
}
