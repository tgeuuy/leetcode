package javaLearn.kaobei.demo2;

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
        return super.clone();
    }

}
