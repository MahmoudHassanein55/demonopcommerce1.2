package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.Categories;

public class categoriesStepDef
{
    Categories categories = new Categories();
    @Given("user select Categories and select sub Categories")
    public void user_select_Categories_and_sub()
    {
        categories.selectCategories();
    }

}
