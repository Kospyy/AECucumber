package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class SignupLoginPage
{
    private WebDriver webDriver;
    public final Integer NAME = 0;
    public final Integer EMAIL = 1;

    public SignupLoginPage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void completeForm(String name, String email)
    {
        webDriver.findElement(By.cssSelector("[data-qa='signup-name']")).sendKeys(name);
        webDriver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(email);
    }
}
