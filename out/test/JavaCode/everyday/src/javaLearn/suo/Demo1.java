package javaLearn.suo;

public class Demo1 {
    public void f1() {
        synchronized (Demo1.class) {
            System.out.println("Hello World.");
        }
    }

    public synchronized void f2() {
        System.out.println("Hello World.");
    }

    public static void main(String[] args) {

    }
}
