package LC_17;

import java.util.*;

class Solution {
    static List<String> res = new ArrayList<>();
    static Map<Integer, String> mp = new HashMap<>();
    public static List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return res;
        }
        //   Map<Integer, String> mp = new HashMap<>();
        mp.put(2, "abc");
        mp.put(3, "def");
        mp.put(4, "ghi");
        mp.put(5, "jkl");
        mp.put(6, "mno");
        mp.put(7, "pqrs");
        mp.put(8, "tuv");
        mp.put(9, "wxyz");
        backSearch(digits, digits.length(), "", 0);
        return res;
    }
    static void backSearch(String digits, int length, String path, int i){
        if(path.length() == length){
            res.add(path);
            return ;
        }
        int index = digits.charAt(i) - '0';
        String s = mp.get(index);
        for(int j = 0; j < s.length(); j++){
            path += s.charAt(j);
            i += 1;
            backSearch(digits, length, path, i);
            i -= 1;
            path = path.substring(0, path.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        System.out.println(letterCombinations(s).toString());
    }
}