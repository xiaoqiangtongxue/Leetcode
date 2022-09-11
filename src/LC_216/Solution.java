package LC_216;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static  List<List<Integer>> res  =  new ArrayList<>();
    static  List<Integer> path = new ArrayList<>();
    public static void dfs(int start, int n, int k, int sum){
        if(path.size() == k){
            if(sum == n){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i =start; i <= 9 - (k - path.size()) +1 && sum + i <= n ; i++){
            path.add(i);
            dfs(i + 1, n, k, sum + i);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        dfs( 1, n, k,0);
        System.out.println(res.toString());
    }

}

