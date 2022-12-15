package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.tag;

public class tagsStepDef
{
    tag t =new tag();
    @Given("user go to shoes page")
    public void user_go_to_shoes_page()
    {
        t.pageLink();
    }
    @And("user click on a tag")
    public void user_click_on_a_tag()
    {
        t.tag_click();
    }
}
