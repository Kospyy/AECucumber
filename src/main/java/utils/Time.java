package utils;

public class Time
{
    public static void sleep(int secs)
    {
        try
        {
            Thread.sleep(secs * 1000);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}