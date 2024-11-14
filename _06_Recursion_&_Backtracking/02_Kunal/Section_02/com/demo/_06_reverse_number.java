package com.demo;

/*
Reverse the given number
 */
public class _06_reverse_number
{
    static int num = 0;

    public static void main(String[] args) {
        System.out.println(reverse(189));
    }

    public static int reverse(int n)
    {
        if (n == 0)
        {
            return 0;
        }

       num = num*10 + n%10;
       reverse(n/10);

       return num;
    }
}
