package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader
{
    public static Properties properties = new Properties();
    static
    {
        try
        {
            properties.load(new FileInputStream("C:\\Users\\tyler.MSI\\IdeaProjects\\Cucumber\\src\\main\\resources\\runtime.properties"));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
    static String getProperty(String key)
    {
        return (String)properties.get(key);
    }
}

//C:\Users\tyler.MSI\IdeaProjects\AI-Conversation\src\main\resources\nlp.properties