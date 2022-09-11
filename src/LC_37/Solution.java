package LC_37;

import java.util.Scanner;

class Solution {
    public void solveSudoku(char[][] board) {

        dfs(board, 0,0);

    }
    public   boolean dfs(char[][] board, int x, int y){
        if(y == 9){
            return  dfs(board, x + 1, 0);
        }
        if(x == 9){
            return true;
        }
        if(board[x][y] != '.'){
            return dfs(board, x, y + 1);
        }
        for(char i = '1'; i <= '9'; i++){
            if(!isvaild(board, i, x, y)){
                continue;
            }
            board[x][y] = i;
            if(dfs(board, x, y + 1)){
                return true;
            }
            board[x][y] = '.';
        }
        return false;
    }
    public boolean isvaild(char[][] board, char ch, int x, int y){
        for(int i = 0; i < 9; i++){
            if(board[x][i] == ch){
                return false;
            }
            if(board[i][y]  == ch){
                return false;
            }
            if(board[(x / 3) * 3  + i / 3][(y/3)* 3 + i % 3] == ch){
                return false;
            }
        }
        return true;
    }
}

