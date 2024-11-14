package com.backtracking.problem;

/*
Problem Statement :
Consider an N*N chessboard. N Queen Problem is to accommodate N queens
on the N*N chessboard such that no 2 queens can attack each other.

X X Q X
Q X X X
X X X Q
X Q X X

 */

public class _07_N_Queens
{
    public static void main(String[] args)
    {
        int n = 4;

        char[][] board = new char[n][n];
        for(int i = 0; i<n;i++)
        {
            for (int j = 0; j<n; j++)
            {
               board[i][j]='X';
            }
        }

        display(board);

        nQueens(board,0);

    }

    public static void nQueens(char[][] board, int row)
    {
        if(row== board.length)
        {
            display(board);
            return;
        }
        for(int j = 0; j< board.length; j++)
        {
            if(isSafe(board,row,j))
            {
                board[row][j] = 'Q';
                nQueens(board,row+1);
                board[row][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col)
    {
        int i = row;
        int j = col;
        int n = board.length;

        //up
        while(i>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
        }

        i = row;
        j = col;

        // down
        while (i<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
        }

        i = row;
        j = col;

        //left
        while (j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            j--;
        }

        i = row;
        j = col;

        //right
        while (j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            j++;
        }

        i = row;
        j = col;

        //left up diagonal
        while (i>=0 && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j--;
        }

        i = row;
        j = col;

        //right up diagonal
        while (i>=0 && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i--;
            j++;
        }

        i = row;
        j = col;

        // left down diagonal
        while (i<n && j>=0)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j--;
        }

        i = row;
        j = col;

        //right down diagonal
        while (i<n && j<n)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void display(char[][] board)
    {
        int n = board.length;
        for(int i = 0; i<n;i++)
        {
            for (int j = 0; j<n; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
