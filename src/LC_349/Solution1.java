package LC_349;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            s1.add(nums1[i]);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int i = 0; i < nums2.length; i++){
            s2.add(nums2[i]);
        }
        Set<Integer> s = new HashSet<>();
        s.addAll(s1);
        s.retainAll(s2);
        int[] res = new int[s.size()];
        int index = 0;
        for(int t: s){
            res[index++] = t;
        }
        return res;
    }
}
