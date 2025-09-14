package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class StringUtils
{
    public static String randomString(int length)
    {
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }

    public static String randomEmail()
    {
        return randomString(10) + "@gmail.com";
    }
}
