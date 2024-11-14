package com.concepts;

public class _01_number_passing
{
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n)
    {
        if(n==0)
        {
            return;
        }

        System.out.println(n);

        // print(n--); // will give stack overflow error as here number is first passed and then decremented as it is
        // post decrement

        // correct way here is to use --n i.e. pre decrement means first decrement and then use
        print(--n);
    }
}
