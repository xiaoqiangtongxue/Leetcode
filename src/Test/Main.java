package Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        String s = str.substring(1, 3);
        System.out.println(s);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);
        str = sb.toString();
        System.out.println(str);
    }
}
