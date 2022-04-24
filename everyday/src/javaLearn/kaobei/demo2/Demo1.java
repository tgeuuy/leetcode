package javaLearn.kaobei.demo2;

public class Demo1 implements Cloneable {

    String name;

    int age;

    public Demo1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Demo1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
