package po;

import org.openqa.selenium.By;
import static utils.FileUtils.store;
import static utils.StringUtils.*;

public class SignupLoginPage extends DriverManager
{
    public final Integer NAME = 0;

    public void completeSignUpForm(String name)
    {
        String email = randomEmail();
        webDriver.findElement(By.cssSelector("[data-qa='signup-name']")).sendKeys(name);
        webDriver.findElement(By.cssSelector("[data-qa='signup-email']")).sendKeys(email);
        store(email);
    }
}
