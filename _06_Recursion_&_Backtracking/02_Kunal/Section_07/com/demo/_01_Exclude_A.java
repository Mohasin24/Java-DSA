package com.demo;

/*
Problem Statement :
Remove all the occurances of 'a' from the given string
 */
public class _01_Exclude_A
{
    public static void main(String[] args)
    {
        String s = "";
        removeA("baccad",s);
        System.out.println(removeA2("baccad"));
    }

    public static void removeA(String s,String result)
    {
        if (s.length()==0)
        {
            System.out.println(result);
            return;
        }

        char c = s.charAt(0);

        if(c!='a')
        {
            removeA(s.substring(1),result+c);
        }
        else
        {
            removeA(s.substring(1),result);
        }

    }

    public static String removeA2(String s)
    {
        if (s.length()==0)
        {
            return "";
        }

        char c = s.charAt(0);


        if(c!='a')
        {
            return c+removeA2(s.substring(1));
        }
        else
        {
            return removeA2(s.substring(1));
        }

    }
}
