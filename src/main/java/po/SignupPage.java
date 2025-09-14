package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SignupPage extends DriverManager
{
    public final Integer TITLE = 0;
    public final Integer PASSWORD = 1;
    public final Integer DOB = 2;
    private final By PASSWORD_FIELD = By.id("password");
    private final By DAY = By.id("days");
    private final By MONTH = By.id("months");
    private final By YEAR = By.id("years");
    public final Integer FIRSTNAME = 0;
    public final Integer LASTNAME = 1;
    public final Integer COMPANY = 2;
    public final Integer ADDRESS = 3;
    public final Integer ADDRESS2 = 4;
    public final Integer COUNTRY = 5;
    public final Integer STATE = 6;
    public final Integer CITY = 7;
    public final Integer ZIPCODE = 8;
    public final Integer MOBILENUMBER = 9;
    private final By FIRST_NAME_ID = By.id("first_name");
    private final By LAST_NAME_ID = By.id("last_name");
    private final By COMPANY_ID = By.id("company");
    private final By ADDRESS_ID = By.id("address1");
    private final By ADDRESS2_ID = By.id("address2");
    private final By COUNTRY_ID = By.id("country");
    private final By STATE_ID = By.id("state");
    private final By CITY_ID = By.id("city");
    private final By ZIPCODE_ID = By.id("zipcode");
    private final By MOBILENUMBER_ID = By.id("mobile_number");



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

    public void addressInformationForm(List<String> addressInfo)
    {
        webDriver.findElement(FIRST_NAME_ID).sendKeys(addressInfo.get(FIRSTNAME));
        webDriver.findElement(LAST_NAME_ID).sendKeys(addressInfo.get(LASTNAME));
        webDriver.findElement(COMPANY_ID).sendKeys(addressInfo.get(COMPANY));
        webDriver.findElement(ADDRESS_ID).sendKeys(addressInfo.get(ADDRESS));
        webDriver.findElement(ADDRESS2_ID).sendKeys(addressInfo.get(ADDRESS2));
        webDriver.findElement(COUNTRY_ID).sendKeys(addressInfo.get(COUNTRY));
        webDriver.findElement(STATE_ID).sendKeys(addressInfo.get(STATE));
        webDriver.findElement(CITY_ID).sendKeys(addressInfo.get(CITY));
        webDriver.findElement(ZIPCODE_ID).sendKeys(addressInfo.get(ZIPCODE));
        webDriver.findElement(MOBILENUMBER_ID).sendKeys(addressInfo.get(MOBILENUMBER));
    }
}
