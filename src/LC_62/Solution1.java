package LC_62;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();
        System.out.println(uniquePaths(m,n));
    }
    public static  int uniquePaths(int m, int n) {
       long ans = 1;
       for(int i = n, j = 1; j <m;++i, ++j ){
           ans =  ans * i/j;
       }
       return (int) ans;
    }
}
