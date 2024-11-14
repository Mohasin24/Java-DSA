/*
Problem Statement :
String expression to int final value : "8-5+3*4/6" = 5
 */

package com.stacks_problems;

import java.util.Stack;

public class _08_Infix
{
    public static void main(String[] args)
    {
        _08_Solution sl = new _08_Solution();

        System.out.println(sl.calculate("9-5+3*4/6"));
    }
}

class _08_Solution
{
    private Stack<Integer> val = new Stack<>();
    private Stack<Character> op = new Stack<>();
    public int calculate(String s)
    {
        for(int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            if(c>=48 && c<=57)
            {
                val.push((int)c-48);
            }
            else if(op.isEmpty())
            {
                op.push(c);
            }
            else
            {
                if(c=='-' || c=='+')
                {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    switch (op.peek())
                    {
                        case '-' :
                            val.push(v1-v2);
                            break;
                        case '+' :
                            val.push(v1+v2);
                            break;
                        case '*' :
                            val.push(v1*v2);
                            break;
                        case '/' :
                            val.push(v1/v2);
                            break;
                    }
                    op.push(c);
                }
                else if(c=='*' || c=='/')
                {
                    if(op.peek() == '*' || op.peek() == '/')
                    {
                        int v2 = val.pop();
                        int v1 = val.pop();

                        switch (op.peek())
                        {
                            case '*' :
                                val.push(v1*v2);
                                break;
                            case '/' :
                                val.push(v1/v2);
                                break;
                        }

                        op.pop();

                    }

                    op.push(c);
                }
            }
        }

        while (val.size()>1)
        {
            int v2 = val.pop();
            int v1 = val.pop();

            switch (op.pop())
            {
                case '-' :
                    val.push(v1-v2);
                    break;
                case '+' :
                    val.push(v1+v2);
                    break;
                case '*' :
                    val.push(v1*v2);
                    break;
                case '/' :
                    val.push(v1/v2);
                    break;
            }
        }

        return val.pop();
    }
}

class PSW_Solution
{
    private Stack<Integer> val = new Stack<>();
    private Stack<Character> op = new Stack<>();

    public int calculate(String s)
    {
        for (int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            int num = (int) ch;

            if(num>=48 && num<=57)
            {
                val.push(num-48);
            }
            else if (op.isEmpty())
            {
                op.push(ch);
            }
            else
            {
                if(ch=='+' || ch=='-')
                {
                    int v2 = val.pop();
                    int v1 = val.pop();

                    if(op.peek()=='-')
                    {
                        val.push(v1-v2);
                    }
                    else if(op.peek()=='+')
                    {
                        val.push(v1+v2);
                    }
                    else if(op.peek()=='*')
                    {
                        val.push(v1*v2);
                    }
                    else if(op.peek()=='/')
                    {
                        val.push(v1/v2);
                    }

                    op.push(ch);

                }
                else if(ch=='*' || ch=='/')
                {
                    if(op.peek() == '*' || op.peek()=='/')
                    {
                        int v2 = val.pop();
                        int v1 = val.pop();

                        if(op.peek()=='*')
                        {
                            val.push(v1*v2);
                        }
                        else if(op.peek()=='/')
                        {
                            val.push(v1/v2);
                        }

                        op.pop();
                        op.push(ch);
                    }
                    else
                    {
                        op.push(ch);
                    }
                }
            }
        }

        while (val.size()>1)
        {
            int v2 = val.pop();
            int v1 = val.pop();

            if(op.peek()=='-')
            {
                val.push(v1-v2);
            }
            else if(op.peek()=='+')
            {
                val.push(v1+v2);
            }
            else if(op.peek()=='*')
            {
                val.push(v1*v2);
            }
            else if(op.peek()=='/')
            {
                val.push(v1/v2);
            }

            op.pop();
        }

        return val.pop();
    }
}
