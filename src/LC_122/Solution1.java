package LC_122;

public class Solution1 {
    public int maxProfit(int[] prices) {
       int n = prices.length;
       int sum = 0;
       for(int i = 1; i < n; i++){
           int val =  prices[i] - prices[i - 1];
           if(val > 0){
               sum += val;
           }
       }
       return  sum;
    }
}
