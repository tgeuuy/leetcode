package javaLearn.suo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTests {
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private Queue<String> queue = new LinkedList<>();

    public void addTask(String s) {
        lock.lock();
        try {
            queue.add(s);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String getTask() throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                condition.await();
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }



    }

    // 另外与tryLock类似，await可以在等待指定时间后，如果还没有被其他线程通过signal()或signalAll()唤醒，可以自己醒来：
//    if (condition.await(1, TimeUnit.SECONDS)) {
//        // 被其他线程唤醒
//    } else {
//        // 指定时间内没有被其他线程唤醒
//    }

}
