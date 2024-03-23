package StepDefinitiobns;

import Pages.UdemyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.Driver;

import java.time.Duration;

public class UdemySteps1 {


    UdemyPage udemyPage=new UdemyPage();


    WebDriver driver;

    @Given("go to UDEMY")
    public void go_to_udemy() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.udemy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Given("check the visibility of try it free")
    public void check_the_visibility_of_try_it_free() {

    }
    @Then("close the browser")
    public void close_the_browser() {
        driver.close();
    }
}
