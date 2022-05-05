package javaLearn.suo;

import java.util.concurrent.locks.ReentrantLock;

public class T1 {
    static int num = 23;
    static ReentrantLock lock = new ReentrantLock(true);

    public static void main(String[] args) {
        new Thread(T1::tt, "文化路").start();
        new Thread(T1::tt, "瑞达路").start();
        new Thread(T1::tt, "红旗路").start();
    }

    static void tt() {
        String na = Thread.currentThread().getName();

        while (num > 1) {
            lock.lock();
            num--;
            System.out.printf("%s:%d%n", na, num);
            if (num < 1) {
                break;
            }
            lock.unlock();
        }
    }


}
