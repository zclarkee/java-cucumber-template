package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookFlights extends AbstractPage {

    public BookFlights(WebDriver driver) {
        super(driver);
    }

    public static final By NUMBER_OF_ADULTS = By.cssSelector("#selectedAdults");
    public static final By TOTAL_ADULTS = By.cssSelector("#selectedAdults > option:nth-child(1)");
    private static final By NUMBER_OF_CHILDREN = By.cssSelector("#selectedChild");
    private static final By TOTAL_CHILDREN = By.cssSelector("#selectedChild > option:nth-child(2)");
    private static final By CLICK_BOOK = By.cssSelector("#body-section > div:nth-child(7) > div.panel.panel-default > div.panel-body > div > form > div:nth-child(5) > button");
    public static final By FIRST_NAME = By.cssSelector("#guestform > div:nth-child(1) > div:nth-child(2) > input");
    private static final By LAST_NAME = By.cssSelector("#guestform > div:nth-child(1) > div:nth-child(3) > input");
    private static final By EMAIL = By.cssSelector("#guestform > div:nth-child(2) > div:nth-child(2) > input");
    private static final By CONFIRM_EMAIL = By.cssSelector("#guestform > div:nth-child(2) > div:nth-child(3) > input");
    private static final By MOBILE = By.cssSelector("#guestform > div:nth-child(3) > div.col-md-10.col-xs-10 > input");
    private static final By ADDRESS = By.cssSelector("#guestform > div:nth-child(4) > div.col-md-10.col-xs-10 > input");
    @FindBy(css = "[href='javascript\\:void\\(0\\)']")
    private WebElement country;
    private static final By VALID_COUNTRY = By.cssSelector("body:nth-child(2) div.select2-drop.select2-display-none.select2-with-searchbox.select2-drop-active:nth-child(14) ul.select2-results > li.select2-results-dept-0.select2-result.select2-result-selectable:nth-child(2)");
    private static final By GUESTONE_INFO = By.cssSelector("#bookingdetails > div:nth-child(18) > div.panel-body > div > div:nth-child(1) > div.col-md-4 > input");
    private static final By GUESTONE_PASS = By.cssSelector("#bookingdetails > div:nth-child(18) > div.panel-body > div > div:nth-child(1) > div.col-md-6 > input");
    private static final By GUESTONE_AGE = By.cssSelector("#bookingdetails > div:nth-child(18) > div.panel-body > div > div:nth-child(1) > div.col-md-2 > input");
    private static final By GUESTTWO_INFO = By.cssSelector("#bookingdetails > div:nth-child(18) > div.panel-body > div > div:nth-child(3) > div.col-md-4 > input");
    private static final By GUESTTWO_PASS = By.cssSelector("#bookingdetails > div:nth-child(18) > div.panel-body > div > div:nth-child(3) > div.col-md-6 > input");
    private static final By GUESTTWO_AGE = By.cssSelector("#bookingdetails > div:nth-child(18) > div.panel-body > div > div:nth-child(3) > div.col-md-2 > input");
    private static final By BOOK_NOW = By.cssSelector("#body-section > div.container.booking > div > div > div > div.col-md-8.offset-0.go-right > div:nth-child(2) > div.form-group > button");

    public void numberOfGuests() {
        driver.findElement(NUMBER_OF_ADULTS).click();
        driver.findElement(TOTAL_ADULTS).click();
        driver.findElement(NUMBER_OF_CHILDREN).click();
        driver.findElement(TOTAL_CHILDREN).click();
    }

    public void bookNowClick() {
        driver.findElement(CLICK_BOOK).click();

    }

    public void fillGuestForm(String name, String surname, String email, String mobile, String address) {
        driver.findElement(FIRST_NAME).sendKeys(name);
        driver.findElement(LAST_NAME).sendKeys(surname);
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(CONFIRM_EMAIL).sendKeys(email);
        driver.findElement(MOBILE).sendKeys(mobile);
        driver.findElement(ADDRESS).sendKeys(address);
    }

    public void getCountry() {
        country.click();
        driver.findElement(VALID_COUNTRY).click();

    }


    public void fillPassInfo(String info, String info2, String passport2, String passport, String age, String age2) {
        driver.findElement(GUESTONE_INFO).sendKeys(info);
        driver.findElement(GUESTONE_PASS).sendKeys(passport);
        driver.findElement(GUESTONE_AGE).sendKeys(age);
        driver.findElement(GUESTTWO_INFO).sendKeys(info2);
        driver.findElement(GUESTTWO_PASS).sendKeys(passport2);
        driver.findElement(GUESTTWO_AGE).sendKeys(age2);
    }

    public void clickBook () {
        driver.findElement(BOOK_NOW).click();
    }


}
