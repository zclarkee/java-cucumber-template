package uk.co.testcraft.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;


public class SignUP extends AbstractPage{


    public SignUP(WebDriver driver) { super(driver); }

    @FindBy(css = "#headersignupform > div:nth-child(3) > input")
    private WebElement First_Name;


    public static final By FIRST_NAME = By.cssSelector("#headersignupform > div:nth-child(3) > input");
    private static final By LAST_NAME = By.cssSelector("#headersignupform > div:nth-child(4) > input");
    private static final By MOBILE = By.cssSelector("#headersignupform > div:nth-child(5) > input");
    private static final By EMAIL = By.cssSelector("#headersignupform > div:nth-child(6) > input");
    private static final By PASSWORD = By.cssSelector("#headersignupform > div:nth-child(7) > input");
    private static final By CONFIRM_PASSWORD = By.cssSelector("#headersignupform > div:nth-child(8) > input");
    private static final By CLICK_SUBMIT = By.xpath("/html[1]/body[1]/div[4]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[9]/button[1]");


    public void fillOutForm (String firstname, String secondname, String number, String email, String pass) {
        driver.findElement(FIRST_NAME).sendKeys(firstname);
        driver.findElement(LAST_NAME).sendKeys(secondname);
        driver.findElement(MOBILE).sendKeys(number);
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(PASSWORD).sendKeys(pass);
        driver.findElement(CONFIRM_PASSWORD).sendKeys(pass);

    }
    public void clickSubmit(){
        driver.findElement(CLICK_SUBMIT).click();
    }



}
