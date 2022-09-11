package LC_3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public static  int lengthOfLongestSubstring(String s) {
        char[] strs = s.toCharArray();
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < strs.length; i++){
            Set<Character> set = new HashSet<>();
            set.add(strs[i]);
            int max = 1;
            int j = i + 1;
            while(j < strs.length && !set.contains(strs[j])){
                j++;
                set.add(strs[j]);
                max++;
            }
            res = Math.max(res,  max);
            set.clear();
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);
        String s = cin.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

}
