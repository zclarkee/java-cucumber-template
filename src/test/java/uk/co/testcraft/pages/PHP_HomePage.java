package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Driver;
import java.util.List;


public class PHP_HomePage extends AbstractPage {


    public PHP_HomePage(WebDriver driver) { super(driver); }

    public String URL = "https://www.phptravels.net";

    @FindBy(css = "#collapse [class='lightcaret mt-2 go-left']")
    private WebElement myAccountButton;

    @FindBy(css = "#collapse #li_myaccount li:nth-of-type(2) .go-text-right")
    private WebElement signUpButton;

    @FindBy(css = "#collapse #li_myaccount li:nth-of-type(1) .go-text-right")
    private WebElement myLogInButton;

    @FindBy(css = "#body-section > div:nth-child(8) > div.vc_row.wpb_row.vc_inner.vc_row-fluid.vc_column-gap-30 > div:nth-child(1) > div > div > div > div > div.hotel-right > a")
    private WebElement featuredTour;

    @FindBy(css =  "nav.navbar.navbar-default:nth-child(4) div.container div.collapse.navbar-collapse ul.nav.navbar-nav:nth-child(1) li.main-lnk:nth-child(3) > a.loader")
    private WebElement flights;

    @FindBy(css = "#collapse > ul:nth-child(1) > li:nth-child(2) > a")
    private WebElement hotel;

    public final void goTo() {
        driver.get(URL);
        this.driver.get(URL);
        driver.manage().window().maximize();
    }

    public void navigateToSignUP() {
        wait.until(ExpectedConditions.elementToBeClickable(this.myAccountButton));
        myAccountButton.click();
        signUpButton.click();

    }

    public final void navigateToFeaturedTour() {
        wait.until(ExpectedConditions.elementToBeClickable(this.featuredTour));
        featuredTour.click();
    }

    public void navigateToLogIn() {
        wait.until(ExpectedConditions.elementToBeClickable(this.myAccountButton));
        myAccountButton.click();
        myLogInButton.click();

    }
    public void navigateToFlights() {
        flights.click();
    }

    public void navigateToHotel() { hotel.click(); }

    public String getCurrentURL() {
        String currentURL = driver.getCurrentUrl();
        return currentURL;
    }





}
