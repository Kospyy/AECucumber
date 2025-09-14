package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils
{
    static File file = new File("C:\\Users\\tyler.MSI\\IdeaProjects\\AECucumber\\src\\main\\resources\\Storage.txt");

    public static void store(String value)
    {
        try
        {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(value);
            fileWriter.close();
        }
        catch (IOException ioe)
        {
            System.out.println("An error occurred:" + ioe);
        }
    }

    public static String retrieve()
    {
        String value = "";
        try
        {
            Scanner scanner = new Scanner(file);
            value = scanner.nextLine();
            scanner.close();
        }
        catch (IOException ioe)
        {
            System.out.println("An error occurred:" + ioe);
        }
        return value;
    }
}
