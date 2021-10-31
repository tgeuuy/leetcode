package cn.test;

public class Test1 {

    public static final int M = 7;
    public final int MDAD = 4;

    public static void main(String[] args) {
        int c = 5, b = 9;
        int d = c++;
        System.out.println(c);
        int e = ++c;
//        System.out.println(c++);
//        System.out.println(++b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(M);
    }
}
