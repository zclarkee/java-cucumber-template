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
import uk.co.testcraft.pages.FLIGHT;
import uk.co.testcraft.pages.LogIn;
import uk.co.testcraft.pages.PHP_HomePage;
import uk.co.testcraft.pages.BookFlights;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BookStepDef  implements En {

    private WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    PHP_HomePage php_homePage = new PHP_HomePage(driver);
    BookFlights bookFlights = new BookFlights(driver);


    public BookStepDef() {


        Given("^I am on Home", () -> {
            php_homePage.goTo();
        });

        When("^I select book now$", () -> {
            php_homePage.navigateToFeaturedTour();

        });

        And("^select a number of adults and children", () -> {
            bookFlights.numberOfGuests();
            bookFlights.bookNowClick();
        });

        And("^I fill in guest form$", () -> {
            bookFlights.fillGuestForm("Bill", "Billy", "billbilly@hotmail.co.uk", "07900409711", "billbilly@hotmail.com");
            bookFlights.getCountry();

        });

        And("^I will fill in passport details$", () -> {
            bookFlights.fillPassInfo("Jose", "Leo", "2929292321dw", "99e29jdj", "23", "7");
            bookFlights.clickBook();
        });

        Then("Invoice will be displayed", () -> {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[3]")));
            Assert.assertTrue(driver.getTitle().contains("Invoice"));
        });


    }
}




