package uk.co.testcraft.stepDefs;


import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.testcraft.pages.LogIn;
import uk.co.testcraft.pages.PHP_HomePage;
import uk.co.testcraft.pages.FLIGHT;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FlightSteps implements En {

    private WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    PHP_HomePage php_homePage = new PHP_HomePage(driver);
    FLIGHT flight = new FLIGHT(driver);


    public FlightSteps() {


        Given("^The homepage is visible", () -> {
            php_homePage.goTo();
        });

        When("^I select book flights$", () -> {
            php_homePage.navigateToFlights();

        });

        And("^I select departure date$", () -> {
            flight.depDate();
        });

        And("^I select the class and passenger numbers", () -> {
            flight.flightClass();
            flight.numberOfPassengers();
            flight.searchFlight();
            flight.selectFlight();
        });

        And("^I fill in form$", () -> {
            flight.fillForm("Bill", "Billy", "billbilly@hotmail.co.uk", "07900409711", "billbilly@hotmail.com");
            flight.getCountry1();
            flight.clickBook1();

        });

        Then("^Unpaid Invoice will be displayed$", () -> {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[3]")));
            Assert.assertTrue(driver.getTitle().contains("Invoice"));

        });




    }
}
