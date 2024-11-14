package com.recursion.problem;

public class _22_Palindrome_String
{
    public static boolean checkPalindrome(String s)
    {
        return s.equals(reverseString(s));
    }

    public static String reverseString(String s)
    {
        if((s.length() == 1))
        {
            return s;
        }

        return reverseString(s.substring(1))+s.charAt(0);
    }

    // method 2 without reversing the string
    public static boolean isPalindrome(String s, int l, int r)
    {
        if(l>=r)
        {
            return true;
        }

        return (s.charAt(l) == s.charAt(r) && isPalindrome(s,l+1,r-1));
    }

    public static void main(String[] args)
    {
        String s = "radar";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
