package com.Intive.Patronage.tests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

    private static String AUTHENTICATION_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    private WebDriver driver;

    @FindBy(how = How.ID, using = "email_create")
    public WebElement emailAddress;

    @FindBy(how = How.ID, using = "SubmitCreate")
    public WebElement submitEmail;

    @FindBy(how = How.CLASS_NAME, using = "alert-danger")
    public WebElement errorField;

    public AuthenticationPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnButton(WebElement element) { element.click(); }

    public void isAlertDisplayed(WebElement element) { element.isDisplayed(); }

    public void inputText(String text, WebElement element) {
        element.sendKeys(text);
    }

    public String generateEmailAddress() {
        long d = System.currentTimeMillis();
        String generatedEmailAddress = d + "@xyz.com";
        return generatedEmailAddress;
    }
}
