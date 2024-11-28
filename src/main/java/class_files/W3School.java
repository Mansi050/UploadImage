package class_files;

import java.time.Duration;
import java.awt.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class W3School {
    WebDriver driver;

    @FindBy(xpath = "//*[@id='myFile']")
    WebElement fileInput;

    public W3School(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize the elements
    }

    public void upload_image() throws AWTException, InterruptedException {
        fileInput.sendKeys("/Users/mansiag/Assignment_Folder/Assignment_uploadimage/UploadImage/src/main/resources/image/image.jpeg");
    }
    
}
