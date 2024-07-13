package LC_54;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer>  res =   new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;   //列，代表每一维有多少个数
        int top = 0;
        int down = matrix.length - 1;       //行，代表多少维度
        while(true){
            //模拟从左到右，行不变，列变
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            if(++top > down) break;

            //模拟从上到下，列不变，行变
            for(int i = top; i <= down; i++){
                res.add(matrix[i][right]);
            }
            if(--right < left) break;

            //模拟从右到左， 行不变，列变
            for(int i = right; i >= left; i--){
                res.add(matrix[down][i]);
            }
            if(--down < top) break;

            //模拟从下到上，列不变，行变
            for(int i = down; i >= top; i--){
                res.add(matrix[i][left]);
            }
            if(++left > right) break;
        }
        return res;
    }
}
