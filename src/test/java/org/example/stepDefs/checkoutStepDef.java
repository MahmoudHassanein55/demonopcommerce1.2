package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.checkoutPage;

public class checkoutStepDef
{
    checkoutPage check = new checkoutPage();
    @Given("user go to product page")
    public void user_go_to_product_page()
    {
        check.productPageLink();
    }
    @When("user add a product to cart")
    public void user_add_a_product_to_cart() throws InterruptedException {
        check.productToCart();
    }
    @And("user go to cart page")
    public void cart_page() throws InterruptedException {
        check.cartPageLink();
    }
    @Then("user click on checkout")
    public void user_click_on_checkout()
    {
        check.checkout_Click();
    }
}
