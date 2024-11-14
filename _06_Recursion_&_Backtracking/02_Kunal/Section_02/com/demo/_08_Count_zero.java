package com.demo;
/*
Count how many times zero is there in the given number
 */
public class _08_Count_zero
{
    public static void main(String[] args)
    {
        System.out.println(zeroCount(3005,0));
    }

//    public static int zeroCount(int n)
//    {
//        if(n==0)
//        {
//            return 0;
//        }
//        int rem = n%10;
//        int cnt = (rem==0?1:0) + zeroCount(n/10);
//
//        return cnt;
//    }

    public static int zeroCount(int n,int cnt)
    {
        if(n==0)
        {
            return cnt;
        }
        int rem = n%10;

        if(rem == 0)
        {
           return zeroCount(n/10, cnt+1);
        }
        else
        {
            return zeroCount(n/10,cnt);
        }

    }
}
