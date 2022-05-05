package javaLearn.suo;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Person {
    private int age;
    private String name;

    public Person(final int age, final String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ThreadLocalTest1 {
    public static void main(String[] args) {
        ThreadLocal<Person> local = new ThreadLocal<>();
        Person p1 = new Person(23,"张三");
        Person p2 = new Person(45,"李四");
        Person p3 = new Person(76,"王五");
        Person p4 = new Person(98,"赵六");
        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        //创建一个线程池，初始化10个线程，最多15个线程，60SECONDS，多出的线程经过60s没活就回收，
        // 保持10个线程，new LinkedBlockingQueue() 用来放任务的集合
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(10,15,
                60, TimeUnit.SECONDS,new LinkedBlockingQueue<>());

        for (int i = 0; i < 4; i++) {
            Person p = list.get(i);
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    local.set(p);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" 的Person为："+ local.get() );

                }
            });

        }
        threadPool.shutdown();
    }

}
