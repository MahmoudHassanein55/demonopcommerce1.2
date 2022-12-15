package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.shoppingcart;

public class shoppingCartStepDef
{
    shoppingcart cart = new shoppingcart();
    @Given("user go to the product page")
    public void user_go_to_the_product_page()
    {
        cart.shoppingCartSteps();
    }
    @And("user add the product")
    public void user_add_the_product()
    {
        cart.add_button_click();
    }
}
