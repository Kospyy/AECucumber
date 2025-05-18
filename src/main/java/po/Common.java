package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Common
{
    private WebDriver webDriver;

    public Common(WebDriver webDriver)
    {
        this.webDriver = webDriver;
    }

    public void titleVisible(String title)
    {
        webDriver.getTitle().equals(By.partialLinkText(title));
    }

    public void clickButton(String text)
    {
        String buttonText = "//button[text() = '" + text + "']";
        webDriver.findElement(By.xpath(buttonText)).click();
    }

    public void clickLink(String link)
    {
        String linkText = "//a[text() = '" + link + "']";
        webDriver.findElement(By.xpath(linkText)).click();
    }

    public void checkbox(String label)
    {
        String labelText = "//label[text() = '" + label + "']";
        webDriver.findElement(By.xpath(labelText)).click();
    }
}
