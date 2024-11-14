package com.demo;
/*
Check palindrome
 */
public class _07_Palindrome
{
    static int num  = 0;
    public static void main(String[] args)
    {
        System.out.println(checkPalindrome(121));
    }

    public static boolean checkPalindrome(int n)
    {
            return reverse(n)==n;
    }

    public static int reverse(int n)
    {
        if (n==0)
        {
            return 0;
        }
        num = num*10 + n%10;
        reverse(n/10);
        return num;
    }
}
