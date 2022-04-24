package javaLearn.suo;

import java.util.concurrent.Semaphore;

public class SemploeClass {

    private static Semaphore s1 = new Semaphore(1);
    private static Semaphore s2 = new Semaphore(1);
    private static Object ob = new Object();

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    if (i % 2 == 0) {
                        synchronized (ob){
                            ob.notify();
                            s1.acquire();
                            System.out.println(Thread.currentThread().getName() + "  " + i);
                            s2.release();
                            ob.wait();
                        }

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t1").start();

        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                try {
                    if (i % 2 == 1) {
                        synchronized (ob){
                            ob.notify();
                            s2.acquire();
                            System.out.println(Thread.currentThread().getName() + "  " + i);
                            s1.release();
                            ob.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "t2").start();
    }
}
