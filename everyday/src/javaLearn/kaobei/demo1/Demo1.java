package javaLearn.kaobei.demo1;

public class Demo1 {

    public String name ;
    public int age;

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
}
