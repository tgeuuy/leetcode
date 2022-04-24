package javaLearn.thread;

public class MyThread {


    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                System.out.println(Thread.currentThread().getState()+Thread.currentThread().getName());
            }
        },"t");
        t1.start();
        System.out.println(t1.getState());
    }
}
