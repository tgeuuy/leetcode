package javaLearn.kaobei.demo3;



public class ShenKaoBei {

    public static void main(String[] args) {
        Demo2 demo2=new Demo2("xiaohuanzi",25);
       Demo1 demo1=new Demo1("congcong",25);
        demo2.demo=demo1;
        System.out.println(demo2);
        try {
           Demo2 tempDemo=(Demo2)demo2.clone();
            tempDemo.name="yuanyuan";
            tempDemo.age=18;
            tempDemo.demo.name="404";
            tempDemo.demo.age=18;
            System.out.println(demo2);
            System.out.println("________________");
            System.out.println(tempDemo);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
