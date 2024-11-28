package step_definations;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import class_files.W3School;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinationImage {
    WebDriver driver;
    W3School w3school;

    @SuppressWarnings("deprecation")
    @Given("I open the W3School website")
    public void i_open_the_imgbb_website() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        w3school = new W3School(driver);
    }

    @Then("I upload image from local")
    public void click_start_button() throws AWTException, InterruptedException{
        w3school.upload_image();
    }
}
