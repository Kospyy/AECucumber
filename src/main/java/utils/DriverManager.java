package utils;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class DriverManager
{
    private WebDriver webDriver;
    String browser;

    public DriverManager()
    {
        browser = (String)PropertiesReader.properties.get("browser");

        switch (browser)
        {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless");
                webDriver = new ChromeDriver(options);
                break;
            case "firefox":
                FirefoxOptions FFoptions = new FirefoxOptions();
                FFoptions.addArguments("--headless");
                webDriver = new FirefoxDriver(FFoptions);
                break;
            case "edge":
                EdgeOptions Eoptions = new EdgeOptions();
                Eoptions.addArguments("--headless");
                webDriver = new EdgeDriver(Eoptions);
                break;
            default:
                throw new InvalidArgumentException("This does not exist");
        }

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void get(String url)
    {
        webDriver.get(url);
    }

    public void quit()
    {
        webDriver.quit();
    }
}