package com.justforsuccess.journalApp;
//You are given a matrix mat[][] of size n*m containing english alphabets and a string word.
//Check if the word exists on the mat[][] or not. The word can be constructed by using letters
//from adjacent cells, either horizontally or vertically. The same cell cannot be used more than once.

public class test {

    static boolean dfs(char[][] mat, String word, int row, int col, int ind, boolean[][] visited) {
        // options we have to lookup
        // left right up down

        if(ind == word.length()) return true;

        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || visited[row][col] == true || mat[row][col] != word.charAt(ind)) {
            return false;
        }

        visited[row][col] = true;

        if (dfs(mat, word, row, col - 1, ind + 1, visited) || // left
            dfs(mat, word, row, col + 1, ind + 1, visited) || // right
            dfs(mat, word, row - 1, col, ind + 1, visited) || // up
            dfs(mat, word, row + 1, col, ind + 1, visited)) { //down
            return true;
        }

        visited[row][col] = false;

        return false;
    }

    static boolean isExist(char[][] mat, String word) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == word.charAt(0)) {
                    if(dfs(mat, word, i, j, 0, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        char[][] mat = new char[m][n];
        mat[0][0] = 'T';
        mat[0][1] = 'E';
        mat[0][2] = 'E';

        mat[1][0] = 'S';
        mat[1][1] = 'G';
        mat[1][2] = 'K';

        mat[2][0] = 'T';
        mat[2][1] = 'E';
        mat[2][2] = 'L';

//        for(int i = 0; i<m; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

        String word = "GEEK";
        System.out.println(isExist(mat, word));
    }
}
