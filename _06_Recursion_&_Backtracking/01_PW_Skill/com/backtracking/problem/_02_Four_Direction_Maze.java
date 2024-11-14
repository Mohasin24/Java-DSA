package com.backtracking.problem;

public class _02_Four_Direction_Maze
{
    public static void main(String[] args)
    {
        int row = 3;
        int col = 3;

        boolean[][] isVisited = new boolean[row][col];

        printMaze(0,0,row-1,col-1,"",isVisited);

    }

    public static void printMaze(int sr, int sc, int er, int ec, String ways, boolean[][] isVisited)
    {
        if(sr<0 || sc<0)
        {
            return;
        }

        if(sr>er || sc>ec)
        {
            return;
        }

        if(isVisited[sr][sc])
        {
            return;
        }

        if (sr==er && sc==ec)
        {
            System.out.println(ways);
            return;
        }

        isVisited[sr][sc] = true;

        //go down
        printMaze(sr+1, sc,  er,  ec,  ways+"D",  isVisited);

        //go right
        printMaze(sr, sc+1,  er,  ec,  ways+"R",  isVisited);

        //go left
        printMaze(sr, sc,  er,  ec-1,  ways+"L",  isVisited);

        //go up
        printMaze(sr-1, sc,  er,  ec,  ways+"U",  isVisited);

        isVisited[sr][sc] = false;
    }
}
