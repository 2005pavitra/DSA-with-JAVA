package Problems_Practice.Recursion;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NQueen {
    public static List<List<String>> solveQueens(int n){
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        /**
         * for(char[] row : board){
         *     java.util.Arrays.fill(row, '.');
         * }
         */

        solve(board, 0, ans);
        return ans;
    }

    private static void solve(char[][] board, int row, List<List<String>> ans){
        if(row == board.length){
            ans.add(construct(board));
            return ;
        }

        for(int j = 0; j< board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                solve(board, row+1, ans);
                board[row][j] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col ){
        //vertical up
        for(int i = row-1; i>= 0; i--){
            if(board[i][col] == 'Q') return false;
        }

        //diag left up
        for(int i = row-1, j = col-1; i>= 0 && j>= 0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }


        //diag right up
        for(int i = row-1, j = col+1; i>= 0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row: board){
            res.add(new String(row));
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();


            int n = sc.nextInt();
//            List<List<String>> ans = solveQueens(n);
//
//            System.out.println(ans);

            List<List<String>> ans = solveQueens(n);

            for(List<String> board : ans){
                for(String row : board){
                    System.out.println(row);
                }
                System.out.println();
            }

    }

}
