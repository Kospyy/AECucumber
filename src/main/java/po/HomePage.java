package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

import static org.junit.Assert.assertTrue;

public class HomePage
{
    private WebDriver webDriver;
    By consentButton = By.className("fc-button-label");

    public HomePage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void consent()
    {
        webDriver.findElement(consentButton).click();
    }
}
