package utils;

import java.util.List;

public class Print
{
    public static void print(String s)
    {
        System.out.println(s);
    }
    public static void print(Integer i)
    {
        System.out.println(i);
    }
    public static void print(Double d)
    {
        System.out.println(d);
    }
    public static void print(Float f)
    {
        System.out.println(f);
    }
    public static void printSize(List list)
    {
        System.out.println(list.size());
    }

    public static <T> void printList(List<T> list)
    {
        for(T listItem : list)
        {
            System.out.println(listItem);
        }
    }
}