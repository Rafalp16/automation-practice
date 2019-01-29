package com.Intive.Patronage.tests.steps;

import com.Intive.Patronage.tests.DriverFactory;
import com.Intive.Patronage.tests.pages.OrderPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OrderSteps extends DriverFactory {

    OrderPage orderPage = new OrderPage(driver);

    @And("^I click on proceed to checkout button on summary page$")
    public void iClickOnProceedToCheckoutButtonOnSummaryPage() { orderPage.checkoutButton.click(); }

    @And("^I click on proceed to checkout button on summary address page$")
    public void iClickOnProceedToCheckoutButtonOnSummaryAddressPage() { orderPage.confirmAddressOrder.click(); }

    @And("^I accept shipping terms of service$")
    public void iAcceptShippingTermsOfService() { orderPage.acceptTerms.click(); }

    @And("^I click on proceed to checkout button on shipping page$")
    public void iClickOnProceedToCheckoutButtonOnShippingPage() { orderPage.confirmAddressOrder.click(); }

    @Then("^I see that an error about accepting terms of service is visible$")
    public void iSeeThatAnErrorAboutAcceptingTermsOfServiceIsVisible() {
        orderPage.acceptTerms.isDisplayed();
        orderPage.isAlertMessageCorrect("You must agree to the terms of service before continuing.", orderPage.errorTerms);
    }

    @And("^I pick pay by bank wire method$")
    public void iPickPayByBankWireMethod() { orderPage.paymentMethod1.click(); }

    @And("^I pick pay by cheque method$")
    public void iPickPayByChequeMethod() { orderPage.paymentMethod2.click(); }

    @And("^I click on I confirm my order button$")
    public void iClickOnIConfirmMyOrderButton() { orderPage.confirmAddressOrder.click(); }

    @Then("^I see a message that my order is complete$")
    public void iSeeAMessageThatMyOrderIsComplete() {
        orderPage.completeOrderMessage.isDisplayed();
        orderPage.isAlertMessageCorrect("Your order on My Store is complete.", orderPage.completeOrderMessage);
    }

    @Then("^I see an alert that my order is complete$")
    public void iSeeAnAlertThatMyOrderIsComplete() {
        orderPage.alertSuccess.isDisplayed();
        orderPage.isAlertMessageCorrect("Your order on My Store is complete.", orderPage.alertSuccess);
    }
}
