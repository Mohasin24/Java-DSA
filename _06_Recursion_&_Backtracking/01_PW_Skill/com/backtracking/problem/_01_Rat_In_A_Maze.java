package com.backtracking.problem;

public class _01_Rat_In_A_Maze
{
    public static void main(String[] args)
    {
        int rows = 4;
        int col = 6;
        int ways = maze(1,1,rows,col);

        System.out.println(ways);
        mazePrint(1,1,rows,col,"");
    }

    public static int maze(int sr, int sc,int er, int ec)
    {
        if(sr>er || sc>ec)
        {
            return 0;
        }

        if(sr==er && sc==ec)
        {
            return 1;
        }

        int rightWays = maze(sr,sc+1,er,ec);
        int downWays = maze(sr+1,sc,er,ec);
        int totalWays = rightWays + downWays;

        return  totalWays;
    }

    public static void mazePrint(int sr, int sc,int er, int ec, String totalWays)
    {
        if(sr>er || sc>ec)
        {
            return;
        }

        if(sr==er && sc==ec)
        {
            System.out.println(totalWays);
            return;
        }

        mazePrint(sr,sc+1,er,ec,totalWays+"R");
        mazePrint(sr+1,sc,er,ec, totalWays+"D");

    }
}
