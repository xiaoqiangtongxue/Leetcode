package LC_77;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static  List<List<Integer>> res  =  new ArrayList<>();
    static  List<Integer> path = new ArrayList<>();
    public  static  void dfs( int start, int n, int k){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i =start; i <= n - (k - path.size()) +1 ; i++){
            path.add(i);
            dfs(i + 1, n, k);
            path.remove(path.size() - 1);
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        dfs( 1, n, k);
        System.out.println(res.toString());
    }

}

