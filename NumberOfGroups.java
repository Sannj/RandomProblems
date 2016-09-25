package RandomProblems;

import java.util.ArrayList;

/**
 * Created by sanjanabadam on 9/24/16.
 */


public class NumberOfGroups {

    public static void main(String[] args) {
        NumberOfGroups sl = new NumberOfGroups();
        ArrayList<String> a = new ArrayList<>();
        a.add("x");
        //a.add("oooxooo");
        //a.add("ooxxoxo");
        //a.add("oxoooxo");
        System.out.println(sl.black(a));
    }

    int csize;
    int rsize;
    public int black(ArrayList<String> a) {
        csize = a.get(0).length();
        rsize = a.size();
        char[][] mat = new char[rsize][csize];
        boolean[][] visited = new boolean[rsize][csize];
        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                mat[i][j] = Character.toLowerCase(a.get(i).charAt(j));
            }
        }

        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                visited[i][j] = false;
            }
        }

        int count = 0;
        for(int i = 0; i < rsize; i++){
            for(int j = 0; j < csize; j++){
                if(mat[i][j] == 'x' && visited[i][j] != true){
                    visited = DFS(mat, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }
    public boolean[][] DFS(char[][] mat, int i, int j, boolean[][] visited){
        if(i>= 0 && i < rsize && j>=0 && j < csize && visited[i][j] != true && mat[i][j] == 'x' ){
            visited[i][j] = true;

            if(i == 0){
                if(j == 0){
                    visited = DFS(mat, i+1, j, visited);
                    visited = DFS(mat, i, j+1, visited);
                }
                else if(j == csize-1){
                    visited = DFS(mat, i+1, j, visited);
                    visited = DFS(mat, i, j-1, visited);
                }
                else{
                    visited = DFS(mat, i, j-1, visited);
                    visited = DFS(mat, i+1, j, visited);
                    visited = DFS(mat, i, j+1, visited);
                }
            }
            else if(i == rsize -1){
                if(j == 0){
                    visited = DFS(mat, i-1, j, visited);
                    visited = DFS(mat, i, j+1, visited);
                }
                else if(j == csize-1){
                    visited = DFS(mat, i-1, j, visited);
                    visited = DFS(mat, i, j-1, visited);
                }
                else{
                    visited = DFS(mat, i, j-1, visited);
                    visited = DFS(mat, i-1, j, visited);
                    visited = DFS(mat, i, j+1, visited);
                }
            }
            else if(j == 0){
                visited = DFS(mat, i-1, j, visited);
                visited = DFS(mat, i, j+1, visited);
                visited = DFS(mat, i+1, j, visited);
            }
            else if(j == csize-1){
                visited = DFS(mat, i-1, j, visited);
                visited = DFS(mat, i, j-1, visited);
                visited = DFS(mat, i+1, j, visited);
            }
            else{
                visited = DFS(mat, i-1, j, visited);
                visited = DFS(mat, i, j-1, visited);
                visited = DFS(mat, i, j+1, visited);
                visited = DFS(mat, i+1, j, visited);

            }
        }
        return visited;
    }
}