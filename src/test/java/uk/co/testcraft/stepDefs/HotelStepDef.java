package uk.co.testcraft.stepDefs;


import cucumber.api.Scenario;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.testcraft.pages.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class HotelStepDef  implements En {

    private WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    PHP_HomePage php_homePage = new PHP_HomePage(driver);
    Hotel hotel = new Hotel(driver);


    public HotelStepDef() {
        Given("^I will be on Home", () -> {
            php_homePage.goTo();
        });

        When("^I click check  in and out$", () -> {
            hotel.clickCheckOut();
            hotel.printAndClickDate();
        });


    }
}

