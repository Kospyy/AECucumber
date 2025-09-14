package po;

import org.openqa.selenium.By;

public class Common extends DriverManager
{
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

    public void sleep()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException ie)
        {
            throw new RuntimeException(ie);
        }
    }
}
