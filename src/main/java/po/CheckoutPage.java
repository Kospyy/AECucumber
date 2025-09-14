package po;

import org.openqa.selenium.By;

import java.util.List;

public class CheckoutPage extends DriverManager
{
    public final Integer CARDNAME = 0;
    public final Integer CARDNUMBER = 1;
    public final Integer CVC = 2;
    public final Integer EXMONTH = 3;
    public final Integer EXYEAR = 4;
    private final By CARD_NAME_ID = By.cssSelector("[data-qa='name-on-card']");
    private final By CARD_NUMBER_ID = By.cssSelector("[data-qa='card-number']");
    private final By CVC_ID = By.cssSelector("[data-qa='cvc']");
    private final By EXMONTH_ID = By.cssSelector("[data-qa='expiry-month']");
    private final By EXYEAR_ID = By.cssSelector("[data-qa='expiry-year']");

    public void paymentInformationForm(List<String> paymentInfo)
    {
        webDriver.findElement(CARD_NAME_ID).sendKeys(paymentInfo.get(CARDNAME));
        webDriver.findElement(CARD_NUMBER_ID).sendKeys(paymentInfo.get(CARDNUMBER));
        webDriver.findElement(CVC_ID).sendKeys(paymentInfo.get(CVC));
        webDriver.findElement(EXMONTH_ID).sendKeys(paymentInfo.get(EXMONTH));
        webDriver.findElement(EXYEAR_ID).sendKeys(paymentInfo.get(EXYEAR));
    }
}
