package LC_55;

import LC_55.Solution;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] s = cin.nextLine().split(",");
        int[] nums = Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();
        Solution solve = new Solution();
        System.out.println(solve.canJump(nums));
    }
}
