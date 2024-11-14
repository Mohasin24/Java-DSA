package com.demo;

public class _05_prod_of_digits
{
    public static void main(String[] args) {
        System.out.println(digitProd(5289055));
    }

    public static int digitProd(int n)
    {
        if (n%10==n)
        {
            return n;
        }
        int rem = n%10;

        int result = rem*digitProd(n/10);

        return result;
    }
}
