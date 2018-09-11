package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Hotel extends AbstractPage {

    public Hotel(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//div[@id='dpd1']")
    public WebElement checkIn;

    @FindBy(xpath = "//div[8]//div[1]//table[1]//tbody[1]//tr[3]//td[4]")
    public WebElement checkInDate;


    public void clickCheckOut() {
        //checkIn.click();
        //checkInDate.click();
        driver.findElement(By.cssSelector("input[placeholder='Check out']")).click();
    }

    public void printAndClickDate() {
        List<WebElement> calendars =
                driver.findElements(By.xpath("/html/body/div[9]/div[1]/table/tbody/*"));
        for (WebElement thisCal : calendars) {
            System.out.println("A list of dates: " + thisCal.getText());
            if (thisCal.getText().contains("16")) {
                thisCal.findElements(By.xpath("//td[contains(text(),'16')]")).get(1).click();
                break;
            }

        }
    }

    public void clickCheckIn() {
        checkIn.click();
        checkInDate.click();
    }
}

