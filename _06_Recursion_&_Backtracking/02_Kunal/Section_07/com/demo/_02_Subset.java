package com.demo;

import java.util.ArrayList;
import java.util.List;

public class _02_Subset
{
    public static void main(String[] args)
    {
//        System.out.println(subset("","abc"));
//        printSubset("abc","");

        System.out.println(subset2("","abc"));
    }

    public static ArrayList<String> subset(String first, String sec)
    {
        ArrayList<String> list = new ArrayList<>();
        if(sec.length()==0)
        {
            list.add(first);
            return list;
        }

        char ch = sec.charAt(0);

        list.addAll(subset(first+ch,sec.substring(1)));
        list.addAll(subset(first,sec.substring(1)));

        ArrayList<String> ans = new ArrayList<>();
        ans.addAll(list);

        return ans;
    }

    public static ArrayList<String> subset2(String first, String sec)
    {

        if(sec.length()==0)
        {
            if(first.length()!=0)
            {
                return new ArrayList<>(List.of(first));
            }
            else
            {
                return new ArrayList<>();
            }
        }

        char ch = sec.charAt(0);

        ArrayList<String> left = subset2(first+ch,sec.substring(1));
        ArrayList<String> right = subset2(first,sec.substring(1));

        left.addAll(right);

        return left;
    }

    public static void printSubset(String up, String p)
    {
        if(up.isEmpty())
        {
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);

        printSubset(up.substring(1),p+ch);
        printSubset(up.substring(1),p);
    }
}
