package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FLIGHT extends AbstractPage {


    public FLIGHT(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.search_head:nth-child(3) div.container form:nth-child(1) div.trip-check:nth-child(9) div.go-text-right.form-horizontal:nth-child(3) div.col-md-2.form-group.go-right.col-xs-12 > select.form-control.fs12.class")
    public WebElement flightClass;

    @FindBy(css = "#body-section > div.search_head > div > form > div.trip-check > div.go-text-right.form-horizontal > div > select > option:nth-child(2)")
    public WebElement businessClass;

    @FindBy(css = " div:nth-child(5) div.search_head:nth-child(3) div.container form:nth-child(1) > div.bgfade.col-md-2.form-group.go-right.col-xs-6.focusDateInput:nth-child(3)")
    public WebElement departureDate;

    @FindBy(css = "body > div:nth-child(13) > div.datepicker-days > table > tbody > tr:nth-child(3) > td:nth-child(6)")
    public WebElement monthDay;

    private static final By PASSENGERS = By.xpath("//input[@placeholder='0']");
    private static final By ADULTS = By.xpath("//*[@id=\"manual_flightTravelers\"]/div/div/div[2]/section/div/div[1]/div[1]/select/option[2]");
    private static final By CONFIRM_PASSENGERS = By.cssSelector("#sumManualPassenger");
    private static final By SEARCH = By.cssSelector("#body-section > div.search_head > div > form > div.bgfade.col-md-1.col-xs-12.search-button > button");
    private static final By FLIGHT_SELECT = By.cssSelector("#bookbtn");
    public static final By FIRST = By.cssSelector("#guestform > div:nth-child(1) > div:nth-child(2) > input");
    private static final By LAST = By.cssSelector("#guestform > div:nth-child(1) > div:nth-child(3) > input");
    private static final By EMAIL1 = By.cssSelector("#guestform > div:nth-child(2) > div:nth-child(2) > input");
    private static final By CONFIRM_EMAIL1 = By.cssSelector("#guestform > div:nth-child(2) > div:nth-child(3) > input");
    private static final By MOBILE1 = By.cssSelector("#guestform > div:nth-child(3) > div.col-md-10.col-xs-10 > input");
    private static final By ADDRESS1 = By.cssSelector("#guestform > div:nth-child(4) > div.col-md-10.col-xs-10 > input");
    @FindBy(css = "[href='javascript\\:void\\(0\\)']")
    private WebElement country1;
    private static final By VALID_COUNTRY1 = By.cssSelector("#select2-drop > ul > li:nth-child(3)");
    private static final By BOOK = By.cssSelector("#body-section > div.container.booking > div > div > div > div.col-md-8.offset-0.go-right > div:nth-child(2) > div.form-group > button");

    public void flightClass() {
        flightClass.click();
        businessClass.click();
    }

    public void depDate() {
        departureDate.click();
        monthDay.click();
    }

    public void numberOfPassengers() {

        driver.findElement(PASSENGERS).click();
        wait.until(ExpectedConditions.elementToBeClickable(this.ADULTS));
        driver.findElement(ADULTS).click();
        driver.findElement(CONFIRM_PASSENGERS).click();
    }

    public void searchFlight() {
        driver.findElement(SEARCH).submit();
    }

    public void selectFlight() {
        driver.findElement(FLIGHT_SELECT).click();

    }

    public void fillForm(String name, String surname, String email, String mobile, String address) {
        driver.findElement(FIRST).sendKeys(name);
        driver.findElement(LAST).sendKeys(surname);
        driver.findElement(EMAIL1).sendKeys(email);
        driver.findElement(CONFIRM_EMAIL1).sendKeys(email);
        driver.findElement(MOBILE1).sendKeys(mobile);
        driver.findElement(ADDRESS1).sendKeys(address);
    }

    public void getCountry1() {
        country1.click();
        driver.findElement(VALID_COUNTRY1).click();

    }

    public void clickBook1 () {
        driver.findElement(BOOK).click();
    }



}
