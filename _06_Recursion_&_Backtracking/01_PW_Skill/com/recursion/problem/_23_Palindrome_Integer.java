package com.recursion.problem;

public class _23_Palindrome_Integer
{
    public static void main(String[] args)
    {
        checkPalindrome(101);
    }

    public static void checkPalindrome(int num)
    {
        if(num == reverseHelper(num,0))
        {
            System.out.println("Number " +num + " is a palindrome number.");
        }
        else
        {
            System.out.println("Number " + num + " is not a palindrome number.");
        }
    }

    private static int reverseHelper(int num, int reversed)
    {
        if(num == 0)
        {
            return reversed;
        }

        reversed = reversed*10 + (num%10);

        return reverseHelper(num/10, reversed);
    }
}