package LC_455;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();

        int[] g = new int[n];
        int[] s = new int[k];
        for(int i = 0; i < n; i++){
            g[i] = cin.nextInt();
        }
        for(int j = 0; j < k; j++){
            s[j] = cin.nextInt();
        }

        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i  = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length){
            if(g[i] <= s[j]){
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return count;
    }
}

