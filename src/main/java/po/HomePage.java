package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;

import java.util.List;

public class HomePage extends DriverManager
{
    public final Integer ITEM = 0;
    By consentButton = By.className("fc-button-label");

    public void consent()
    {
        if (!webDriver.findElements(consentButton).isEmpty())
        {
            webDriver.findElement(consentButton).click();
        }
    }

    public void verifyLoggedIn(String person)
    {
        String username = "//b[text() = '" + person + "']";
        webDriver.findElement(By.xpath(username));
    }

    public void selectItem(String item)
    {
        String object = "//p[text() = '" + item + "']";
        webDriver.findElement(By.xpath(object)).click();
    }

    public void selectProduct(String product)
    {
        int index = Integer.parseInt(product);
        List<WebElement> products = webDriver.findElements(By.className("choose"));
        products.get(index-1).click();
    }

    public void selectQuantity(String value)
    {
        WebElement amount = webDriver.findElement(By.id("quantity"));
        amount.clear();
        amount.sendKeys(value);

        By cart = new ByChained(By.className("product-information"), By.tagName("button"));
        WebElement clickCart = webDriver.findElement(cart);
        clickCart.click();
    }

    public void clickCart()
    {
        By cart = new ByChained(By.className("text-center"), By.linkText("View Cart"));
        WebElement gotoCart = webDriver.findElement(cart);
        gotoCart.click();
    }
}
