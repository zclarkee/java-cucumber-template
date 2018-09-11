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
import uk.co.testcraft.pages.SignUP;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LogInStep implements En {


    private WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    PHP_HomePage php_homePage = new PHP_HomePage(driver);
    LogIn logIn = new LogIn(driver);

    public LogInStep() {


        Given("^I am on PHP", () -> {
            php_homePage.goTo();
        });

        When("^I click on Log in$", () -> {
            php_homePage.navigateToLogIn();

        });

        And("^Fill in the form", () -> {
            logIn.fillLogIN("randomrandom123@outlook.com", "passPass123");
            logIn.clickLogIn();
        });

        Then ("^Your Name will be displayed$", () -> {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"body-section\"]/div/div[1]/div/div[1]/h3")));
            Assert.assertTrue(driver.getTitle().contains("My Account"));

        });
    }
}
