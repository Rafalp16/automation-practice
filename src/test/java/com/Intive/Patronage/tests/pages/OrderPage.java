package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    private WebDriver driver;

    @FindBy(how = How.CLASS_NAME, using = "standard-checkout")
    public WebElement checkoutButton;

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'button-medium')]/span")
    public WebElement confirmAddressOrder;

    @FindBy(how = How.ID, using = "cgv")
    public WebElement acceptTerms;

    @FindBy(how = How.CLASS_NAME, using = "fancybox-error")
    public WebElement errorTerms;

    @FindBy(how = How.CLASS_NAME, using = "bankwire")
    public WebElement paymentMethod1;

    @FindBy(how = How.CLASS_NAME, using = "cheque")
    public WebElement paymentMethod2;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    public WebElement alertSuccess;

    @FindBy(how = How.XPATH, using = "//p[contains(@class,'cheque-indent')]/strong")
    public WebElement completeOrderMessage;

    public OrderPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void isAlertMessageCorrect(String message, WebElement element) {
        String receivedMessage = element.getText();
        Assert.assertEquals(message, receivedMessage);
    }


}
