package uk.co.testcraft.stepDefs;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.co.testcraft.pages.PHP_HomePage;
import uk.co.testcraft.pages.SignUP;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SignUpStep implements En {


    private WebDriver driver = new ChromeDriver();
    PHP_HomePage php_homePage = new PHP_HomePage(driver);
    SignUP signUP = new SignUP(driver);


    public SignUpStep() {


        Given("^I'm on https://www.phptravels.net/$", () -> {
            php_homePage.goTo();
        });

        When("^Click on the 'Sign Up'  button located under 'My Account'$", () -> {
            php_homePage.navigateToSignUP();

        });

        And("^fill in the form with valid details.$", () -> {
            signUP.fillOutForm("Billy", "Jackson", "07900409711", "randomrandom123@outlook.com", "passPass123");
            signUP.clickSubmit();
        });
    }
}
