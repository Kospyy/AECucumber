package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignupPage
{
    private WebDriver webDriver;
    public final Integer TITLE = 0;
    public final Integer PASSWORD = 1;
    public final Integer DOB = 2;
    private final By PASSWORD_FIELD = By.id("password");
    private final By DAY = By.id("days");
    private final By MONTH = By.id("months");
    private final By YEAR = By.id("years");

    public SignupPage(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void completeForm(String title, String password, String dateOfBirth)
    {
        webDriver.findElement(By.cssSelector("[value='" + title + "']")).click();
        webDriver.findElement(PASSWORD_FIELD).sendKeys(password);

        //this is the shorter way to achieve this, using the select element whilst still using an index instead of a string
        String chosenDay = dateOfBirth.substring(0,2);
        int dayIndex = Integer.parseInt(chosenDay);
        Select selectDay= new Select(webDriver.findElement(DAY));
        selectDay.selectByIndex(dayIndex);

        //this is the longer way to achieve this by opening up the drop-down and selecting the month out of the list that appears
        WebElement months = webDriver.findElement(MONTH);
        months.click();
        List<WebElement> monthOptions = months.findElements(By.tagName("option"));
        String chosenMonth = dateOfBirth.substring(3,5);
        int monthIndex = Integer.parseInt(chosenMonth);
        monthOptions.get(monthIndex).click();

        //this is the shortest way to achieve this, using the select element and choosing the value using a string
        String chosenYear = dateOfBirth.substring(6,10);
        Select selectYear = new Select(webDriver.findElement(YEAR));
        selectYear.selectByValue(chosenYear);


    }
}
