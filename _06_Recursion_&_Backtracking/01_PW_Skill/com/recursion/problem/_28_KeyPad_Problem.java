package com.recursion.problem;

import java.util.ArrayList;
import java.util.List;

public class _28_KeyPad_Problem
{
    public static void combination(String dig, String[] kp,ArrayList<String> list, String res)
    {
        if(dig.length()==0)
        {
            if(!res.equals(""))
            {
                list.add(res);
            }

            return;
        }

        int currIdx = dig.charAt(0) - '0';
        String curr = kp[currIdx];

        for(int i = 0; i<curr.length(); i++)
        {
            combination(dig.substring(1),kp,list,res+curr.charAt(i));
        }
    }

    public static List<String> letterCombinations(String digits)
    {
        ArrayList<String> list = new ArrayList<>();

        String[] kp = {"","","abc","def","ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        combination(digits,kp,list,"");

        return list;
    }

    public static void main(String[] args)
    {
        System.out.println(letterCombinations(""));
    }
}
