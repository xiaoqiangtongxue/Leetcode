package LC_135;

import java.util.Arrays;

public class Solution {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        Arrays.fill(left, 1);
        int[] right = new int[len];
       Arrays.fill(right, 1);
        for(int i = 1; i < len; i++){
            if(ratings[i] > ratings[i - 1]){
                left[i] = left[i-1] + 1;
            }
        }
        for(int i = len - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                right[i] = right[i + 1] + 1;
            }
        }
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += Math.max(left[i] ,right[i]);
        }
        return sum;
    }
}
