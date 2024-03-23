package StepDefinitiobns;

import Pages.UdemyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.time.Duration;

public class UdemySteps2 {

    UdemyPage udemyPage=new UdemyPage();

    WebDriver driver;

    @Given("go to UDEMY2")
    public void go_to_udemy2() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        if(udemyPage.checkitbutton.isDisplayed()){
//                udemyPage.checkitbutton.click();
//        }
    }

    @Given("type testing")
    public void type_testing() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(udemyPage.REJECT_BUTTON));
        udemyPage.REJECT_BUTTON.click();
        wait.until(ExpectedConditions.visibilityOf(udemyPage.search_input));
        udemyPage.search_input.sendKeys("Messi"+Keys.ENTER);

    }

    @Then("close the browser2")
    public void close_the_browser2() {
        driver.close();
    }
}
