package cn.acwing.AC_21;

/**
 * @Author tgeuuy
 * @Date 2021/11/18 9:49
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int res = Fibonacci(2);
        System.out.println("res=" + res);
    }


    public static int Fibonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 3; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;

        }
        return c;

    }
}
