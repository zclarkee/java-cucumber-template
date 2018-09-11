package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn extends AbstractPage {


    public LogIn(WebDriver driver) { super(driver); }

    public static final By EMAIL = By.name("username");
    private static final By PASSWORD = By.cssSelector("#loginfrm > div.panel.panel-default > div.wow.fadeIn.animated > div > div:nth-child(2) > input");
    private static final By CLICK_LOG_IN = By.cssSelector("#loginfrm > div.panel.panel-default > div.wow.fadeIn.animated > button");


    public void fillLogIN (String email, String password) {
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(PASSWORD).sendKeys(password);

    }

    public void clickLogIn() {
        driver.findElement(CLICK_LOG_IN).click();

    }



}
