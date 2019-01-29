package com.Intive.Patronage.tests.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {

    private WebDriver driver;

    @FindBy(how = How.ID, using = "email")
    public WebElement emailAddressForgot;

    @FindBy(how = How.XPATH, using = "//p[contains(@class,'submit')]/button")
    public WebElement retrieveButton;

    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    public WebElement confirmationField;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement errorField;

    public ForgotPasswordPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnButton(WebElement element) { element.click(); }

    public void isAlertDisplayed(WebElement element) { element.isDisplayed(); }

    public void isAlertMessageCorrect(String message, WebElement element) {
        String receivedMessage = element.getText();
        Assert.assertEquals(message, receivedMessage);
    }

    public void inputText(String text, WebElement element) {
        element.sendKeys(text);
    }
}
