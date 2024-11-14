package com.recursion.problem;

public class _21_Print_Reverse_String
{
//    public static void printReverse(String s, int idx)
//    {
//        if(idx == s.length()-1)
//        {
//            System.out.print(s.charAt(idx));
//            return;
//        }
//
//        printReverse(s, idx+1);
//        System.out.print(s.charAt(idx));
//    }

//    public static String printReverse(String s, int idx)
public static String printReverse(String s)
    {
//        if(idx == s.length()-1)
//        {
//
//            return ""+s.charAt(idx);
//        }
//
//        String smallAns = printReverse(s, idx+1);
//
//        return smallAns + s.charAt(idx);

        if(s.length() == 1)
        {
            return s;
        }

        return printReverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(printReverse("hello"));
    }
}
