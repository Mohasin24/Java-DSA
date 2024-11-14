package com.recursion.problem;

/*
From given string remove all the ocurrances of 'a'
 */
public class _20_String_remove_ocurranec
{
    public static String remove(String s, int idx)
    {
        if(idx >= s.length())
        {
            return "";
        }

        String iRet = remove(s,idx+1);

        if(s.charAt(idx) != 'a')
        {
            return s.charAt(idx) + iRet;
        }
        else
        {
            return iRet;
        }
    }

    public static void main(String[] args)
    {
        System.out.println(remove("agjxpaaapa",0));
    }
}
