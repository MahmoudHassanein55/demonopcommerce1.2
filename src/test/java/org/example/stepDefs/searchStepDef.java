package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.searchBar;

public class searchStepDef
{
    searchBar search = new searchBar();
    @Given("user type in search")
    public void user_type_in_search()
    {
        search.searchSteps();
    }
    @And("user click on search button")
    public void user_click_on_search_button()
    {
        search.search_button_click();
    }
}
