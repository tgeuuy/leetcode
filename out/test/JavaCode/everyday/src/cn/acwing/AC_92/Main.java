package cn.acwing.AC_92;

import java.util.Scanner;

public class Main {
    public static boolean[] st = new boolean[20];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(1);
    }

    public static void dfs(int u) {

        if (u > n) {
            for (int i = 1; i <= n; i++) {
                if (st[i]) {
                    System.out.print(i + " ");
                }

            }
            System.out.println();
            return;
        }


        st[u] = true;
        dfs(u + 1);
        st[u] = false;
        dfs(u + 1);
    }
}
