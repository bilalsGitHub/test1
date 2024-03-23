package StepDefinitiobns;

import Pages.TestAutomationPage;
import Pages.UdemyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.time.Duration;

public class TestAutomationSteps06 {


    TestAutomationPage udemyPage=new TestAutomationPage();

    WebDriver driver;

    @Given("go to that page {string}")
    public void go_to_that_page(String string) {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(string);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("click on the  contact us button")
    public void click_on_the_contact_us_button() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(udemyPage.Contact_BUTTON));
        udemyPage.Contact_BUTTON.click();
    }
    @When("verify get in touch visible")
    public void verify_get_in_touch_visible() {
        Assert.assertTrue(udemyPage.GETINTOUCHFIELD.isDisplayed());
    }
    @When("fill all fields")
    public void fill_all_fields() {
        udemyPage.NAME_FIELD.sendKeys("Bilal");
        udemyPage.EMAILFIELD.sendKeys("asdasd@gmail.com");
        udemyPage.SUBJECTFIELD.sendKeys("asdasd@gmail.com");
        udemyPage.YOURMASSAGEFIELD.sendKeys("ASDKLFJHAKSJDFHKAJSDHFGKJASDF");
    }

    @When("I submit the contact form")
    public void i_submit_the_contact_form() {
        udemyPage.SUBMITBUTTON.click();
        driver.switchTo().alert().accept();
    }
    @Then("I should see a success message")
    public void i_should_see_a_success_message() {
        Assert.assertTrue( udemyPage.SUCCESSMESSAGE.isDisplayed());
    }
    @Then("close the browser3")
    public void close_the_browser() {
        driver.close();
    }


}
