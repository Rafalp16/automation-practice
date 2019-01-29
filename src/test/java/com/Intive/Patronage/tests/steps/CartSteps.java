package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.CartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

public class CartSteps extends DriverFactory {

    CartPage cartPage = new CartPage(driver);

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() { cartPage.addToCartButton.click(); }

    @Then("^I see an confirmation alert$")
    public void iSeeAnConfirmationAlert() {
        cartPage.addToCartAlert.isDisplayed(); }

    @And("^I click on proceed to checkout button$")
    public void iClickOnProceedToCheckoutButton() { cartPage.checkoutButton.click(); }

    @Then("^I see an alert about empty cart$")
    public void iSeeAnAlertAboutEmptyCart() throws InterruptedException {
        cartPage.verifyIfResultsAreVisible();
        cartPage.isAlertMessageCorrect("Your shopping cart is empty.", cartPage.emptyCartAlert);
    }

    @And("^I remove every product in a cart$")
    public void iRemoveEveryProductInACart() throws InterruptedException {
        cartPage.removeProduct.click(); }
}
