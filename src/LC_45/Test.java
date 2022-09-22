package LC_45;

import LC_45.Solution1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] s = cin.nextLine().split(",");
        int[] nums = Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();
        Solution1 solve = new Solution1();
        System.out.println(solve.jump(nums));
    }
}
