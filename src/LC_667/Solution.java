package LC_667;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {

    public static int[] constructArray(int n, int k) {
        int idx = 0;
        int[] nums = new int[n ];
        for(int i = 1; i < n-k; i++){
            nums[idx++] = i;
        }
        for(int i = n -k, j = n; i <=j; i++, j--){
            nums[idx++] = i;
            if(i != j){
                nums[idx++] = j;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        int[] temp = constructArray(n, k);
        for(int x:  temp){
            System.out.print(x + " ");
        }
    }
}
