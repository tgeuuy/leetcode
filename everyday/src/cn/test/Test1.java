package cn.test;

public class Test1 {
    public static void main(String[] args) {
        int c = 5, b = 9;
        int d = c++;
        System.out.println(c);
        int e = ++c;
//        System.out.println(c++);
//        System.out.println(++b);
        System.out.println(d);
        System.out.println(e);
    }
}
