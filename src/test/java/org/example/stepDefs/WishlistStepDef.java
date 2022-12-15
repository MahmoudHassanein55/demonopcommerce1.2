package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.wishlist;

public class WishlistStepDef
{
    wishlist wList = new wishlist();
    @Given("user add to wishlist")
    public void user_add_to_wishlist()
    {
        wList.wishlistSteps();
    }
}
