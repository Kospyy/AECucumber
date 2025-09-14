package po;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.firefox.*;
import utils.PropertiesReader;
import java.time.Duration;

public class DriverManager
{
    static WebDriver webDriver;
    String browser = (String) PropertiesReader.properties.get("browser");

    public DriverManager()
    {
        if(webDriver == null) {
            switch (browser) {
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

            webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void get(String url)
    {
        webDriver.get(url);
    }

    public void close()
    {
        webDriver.close();
    }
}