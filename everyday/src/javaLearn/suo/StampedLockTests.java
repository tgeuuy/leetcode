package javaLearn.suo;

import java.util.concurrent.locks.StampedLock;

public class StampedLockTests {

    private final StampedLock stampedLock = new StampedLock();

    private double x;
    private double y;

    public void move(double deltaX, double deltaY) {
        long stamp = stampedLock.writeLock();
        try {
            x += deltaX;
            y += deltaY;
        } finally {
            stampedLock.unlock(stamp);
        }
    }

    public double distanceFromOrigin() {
        long stamp = stampedLock.tryOptimisticRead();
        double currentX = x;
        double currentY = y;
        if (!stampedLock.validate(stamp)) { // 检查乐观读锁后是否有其他写锁发生
            stamp = stampedLock.readLock(); // 获取一个悲观读锁
            try {
                currentX = x;
                currentY = y;
            } finally {
                stampedLock.unlock(stamp);
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }

}
