package LC_1306;

import LC_1306.Solution1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String[] s = cin.nextLine().split(",");
        int[] nums = Arrays.asList(s).stream().mapToInt(Integer::parseInt).toArray();
        int start = cin.nextInt();
        Solution1 solve = new Solution1();
        Solution2 solve2 = new Solution2();
        System.out.println(solve.canReach(nums,  start));
        System.out.println(solve2.canReach(nums,  start));
    }
}
