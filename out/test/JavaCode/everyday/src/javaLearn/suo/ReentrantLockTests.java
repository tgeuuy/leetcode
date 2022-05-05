package javaLearn.suo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTests {
    private final Lock lock = new ReentrantLock();
    private int count;

    /**
     * 使用lock
     */
    public void add1(int n) {
        lock.lock();
        try {
            count += n;
        } finally {
            lock.unlock();
        }
    }


    /**
     * 使用tryLock
     * 下方代码在尝试获取锁的时候，最多等待1秒。如果1秒后仍未获取到锁，tryLock()返回false，程序就可以做一些额外处理，而不是无限等待下去。
     * @param n
     */
    public void add2(int n) throws InterruptedException {
        if (lock.tryLock(1, TimeUnit.SECONDS)) {
            try {
                // 代码
            } finally {
                lock.unlock();
            }
        }
    }



}
