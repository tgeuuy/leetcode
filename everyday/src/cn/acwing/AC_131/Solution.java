package cn.acwing.AC_131;

import java.util.Scanner;

/**
 * @Author tgeuuy
 * @Date 2021/11/5 9:59
 * @Version 1.0
 */
public class Solution {
    public static int N = 100005;

    public static void main(String[] args) {

        int[] nums = new int[N];
        Scanner sc = new Scanner(System.in);


        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) break;
            int[] a = new int[N];
            int[] l = new int[N];
            int[] r = new int[N];
            int[] q = new int[N];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            a[0] = a[n + 1] = -1;
        }

    }
}
