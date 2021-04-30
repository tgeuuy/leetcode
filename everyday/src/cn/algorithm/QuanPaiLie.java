package cn.algorithm;

/**
 * 输入：s1 = "great", s2 = "rgeat"
 * 输出：true
 */

public class QuanPaiLie {


    private static int[] a = {1, 2, 3};


    public static void main(String[] args) {
        String s1 = "great";
        String s2 = "rgeat";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
//        System.out.println(check(ch1, ch2));
        dfs(0, 0);

    }

//    private static boolean check(char[] ch1, char[] ch2) {
//
//    }


    private static void dfs(int u, int state) {
        if (u == 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (((state >> i) & 1) == 0) {
                a[u] = i + 1;
                dfs(u + 1, state | (1 << i));
            }
        }
    }
}
