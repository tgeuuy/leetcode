package javaLearn.kaobei.demo3;

public class Demo2  implements Cloneable{
    String name;
    int age;
    Demo1 demo;
    @Override
    public String toString() {
        return "Demo2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", demo=" + demo +
                '}';
    }
    public Demo2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Demo2 demo2=(Demo2)super.clone();
        demo2.demo=(Demo1) demo2.demo.clone();
        return demo2;
    }

}
