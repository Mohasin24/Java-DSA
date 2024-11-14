package com.backtracking.problem;

/*
Problem Statement :
A maze is an N*N binary matrix of blocks where the upper left block is known as the Source block, and the lower
rightmost block is known as the Destination block. If we consider the maze, then maze[0][0] is the source, and
maze[N-1][N-1] is the destination. Our main task is to reach the destination from the source. We have considered a
rat as a character that can move either forward or downwards or upward or backward.

In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1. A rat can move
only in the active blocks.
 */

public class _05_Rat_In_A_Maze_2_Optimised
{
    public static void main(String[] args)
    {
        int row = 3;
        int col = 4;

        int[][] maze = {
                {1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}
        };

        mazePrint(0,0,row-1,col-1,"",maze);
    }

    public static void mazePrint(int sr, int sc,int er, int ec, String totalWays, int[][] maze)
    {
        if(sr<0 || sc<0 || sr>er || sc>ec) return;

        if(sr==er && sc==ec)
        {
            System.out.println(totalWays);
            return;
        }

        if(maze[sr][sc]==0 || maze[sr][sc]==-1) return;
        maze[sr][sc] = -1;

        // go down
        mazePrint(sr+1,sc,er,ec,totalWays+"D",maze);

        // go right
        mazePrint(sr,sc+1,er,ec,totalWays+"R",maze);

        // go left
        mazePrint(sr,sc-1,er,ec,totalWays+"L",maze);

        //go up
        mazePrint(sr-1,sc,er,ec,totalWays+"U",maze);

        maze[sr][sc] = 1;

    }
}
