package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestAutomationPage {

    public TestAutomationPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(xpath = "//a[normalize-space()='Contact us']")
    public WebElement Contact_BUTTON;

    @FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
    public WebElement GETINTOUCHFIELD;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement NAME_FIELD;

    @FindBy(xpath = "//input[@placeholder='Email']")
    public WebElement EMAILFIELD;

    @FindBy(xpath = "//input[@placeholder='Subject']")
    public WebElement SUBJECTFIELD;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement YOURMASSAGEFIELD;

    @FindBy(xpath = "//input[@name='upload_file']")
    public WebElement CHOOSENFILEFIELD;


    //input[@name='submit']
    @FindBy(xpath = "//input[@name='submit']")
    public WebElement SUBMITBUTTON;

    //div[@class='status alert alert-success']
    @FindBy(xpath = "//div[@class='status alert alert-success']")
    public WebElement SUCCESSMESSAGE;



}
