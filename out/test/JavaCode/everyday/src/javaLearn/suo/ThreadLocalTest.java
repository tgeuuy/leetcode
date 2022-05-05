package javaLearn.suo;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadLocalTest {

    public static void main(String[] args) throws InterruptedException{
        ThreadLocal<Integer> local = new ThreadLocal<>();

        //创建一个线程池，初始化10个线程，最多15个线程，60SECONDS，多出的线程经过60s没活就回收，
        // 保持10个线程，new LinkedBlockingQueue() 用来放任务的集合
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10,15,
                60, TimeUnit.SECONDS,new LinkedBlockingQueue<>());

        for (int i = 0; i < 10; i++) {
            int I = i + 1;
            //执行一次为一个线程，执行十次共10个线程
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    local.set(I);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" 的Integer值为："+ local.get() );
                }
            });

        }
        threadPool.shutdown();
    }

}
