package javaLearn.kaobei.demo1;

import javaLearn.kaobei.demo1.Demo1;

public class YinYongKaoBei {


    // 引用拷贝，拷贝的是对象地址，两个不同对象指向同一个地址
    // tempDemo 和 demo1 对象都指向了demo1 的地址，tempDemo 同时修改了两个对象的内容。

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1("zhangsan", 25);
        System.out.println(demo1);
        Demo1 tempDemo = demo1;
        tempDemo.name = "lisi";
        tempDemo.age = 18;
        System.out.println(tempDemo);
        System.out.println(demo1);
    }


}
