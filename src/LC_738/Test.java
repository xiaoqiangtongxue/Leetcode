package LC_738;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner  cin = new Scanner(System.in);
        int n = cin.nextInt();
        Solution s = new Solution();
        int res = s.monotoneIncreasingDigits(n);
        System.out.println(res);
    }
}
