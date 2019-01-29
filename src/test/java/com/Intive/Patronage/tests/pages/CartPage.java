package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "add_to_cart")
    public WebElement addToCartButton;

    @FindBy(how = How.CLASS_NAME, using = "layer_cart_product")
    public WebElement addToCartAlert;

    @FindBy(how = How.CLASS_NAME, using = "continue")
    public WebElement continueShoppingButton;

    @FindBy(how = How.CLASS_NAME, using = "button-medium")
    public WebElement checkoutButton;

    @FindBy(how = How.CLASS_NAME, using = "alert-warning")
    public WebElement emptyCartAlert;

    @FindBy(how = How.CLASS_NAME, using = "icon-trash")
    public WebElement removeProduct;

    public CartPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isAlertMessageCorrect(String message, WebElement element) {
        String receivedMessage = element.getText();
        Assert.assertEquals(message, receivedMessage);
    }

    public void verifyIfResultsAreVisible() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(emptyCartAlert));
    }
}
