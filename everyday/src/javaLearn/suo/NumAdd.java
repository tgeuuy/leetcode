package javaLearn.suo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumAdd implements Runnable {

    private int num;
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 0; i < 10000; i++) {
                num++;
            }
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        NumAdd na = new NumAdd();
        Thread t1 = new Thread(na);
        Thread t2 = new Thread(na);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(na.num);
    }
}
