package com.recursion.problem;

public class _11_GCD
{
    public static void main(String[] args)
    {
        _11_Solution sl = new _11_Solution();

        //Brute force
        System.out.println(sl.gcd1(12,16));

        //Optimised long division
        System.out.println(sl.gcd2(7,11));
    }
}

class _11_Solution
{
    // Brute force method
    public int gcd1(int x, int y)
    {
        for(int i = Math.min(x,y); i>0; i--)
        {
            if(x%i == 0 && y%i==0)
            {
                return i;
            }
        }

        return 1;
    }

    //long division method
    public int gcd2(int x, int y)
    {
        while (x%y != 0)
        {
            int rem = x%y;

            x = y;
            y = rem;
        }

        return y;
    }
}
