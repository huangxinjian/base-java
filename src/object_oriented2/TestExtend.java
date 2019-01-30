package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description: 测试继承extends
 * @Date: Created in 14:51 2019/1/30
 * @Modified By:
 */
public class TestExtend {

    /*
    继承的要点：
        1. java中类【class】只支持单继承，不支持多继承，但是支持多层继承，例如 B extends A， C extends B
        2. 接口【interface】可以多继承
        3. 被继承的类称为 父类、超类、基类
        4. 继承的称为 子类、派生类
        5. Object是所有类的父类
        6. 继承只能继承父类的非私有的成员变量和成员方法

    继承中成员变量的关系：
        1. 第一种：子类成员变量与父类成员变量不同名，则互相独立，互不影响
        2. 第二种：子类成员变量存在于父类成员变量同名，则在使用时，根据就近原则，以子类的为准，如果要访问父类的，可以用 super.变量名 来访问
     */
    public static void main(String[] args) {
        Student s = new Student("huangxinjian",174,"Java");
        s.rest();
        s.study();

        /*
        instanceof 关键字，左边是对象，右边是类
         */
        System.out.println(s instanceof Student);
    }
}

class Person {
    String name;
    int height;
    public void rest(){
        System.out.println("休息一会！");
    }
}
class Student extends Person {
    String major; //专业
    public void study(){
        System.out.println("在江口，学习Java");
    }
    public Student(String name,int height,String major) {
        //天然拥有父类的属性
        this.name = name;
        this.height = height;
        this.major = major;
    }
}