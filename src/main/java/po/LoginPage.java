package po;

import org.openqa.selenium.By;
import static utils.FileUtils.*;

public class LoginPage extends DriverManager
{

    public void completeLoginForm(String password)
    {
        webDriver.findElement(By.cssSelector("[data-qa='login-email']")).sendKeys(retrieve());
        webDriver.findElement(By.cssSelector("[data-qa='login-password']")).sendKeys(password);
    }
}
