package com.backtracking.problem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_String_Permutations
{
    public static void main(String[] args)
    {
        permutation("abc","");
    }

    public static void permutation(String str, String s)
    {
        if(str.length()==0)
        {
            System.out.println(s);
            return;
        }

        for(int i = 0; i<str.length(); i++) //str = abc
        {
            char curr = str.charAt(i); //a;
            String left = str.substring(0,i); //""
            String right = str.substring(i+1); //bc
            String rem = left+right;

            permutation(rem,s+curr);
        }
    }
}
