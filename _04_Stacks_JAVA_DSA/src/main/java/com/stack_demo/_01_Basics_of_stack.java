package com.stack_demo;

import java.util.Stack;
import  java.util.Scanner;
public class _01_Basics_of_stack
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");

        for(int i = 0; i<n; i++)
        {
            st.push(sc.nextInt());
        }

        System.out.println(st);
    }
}
