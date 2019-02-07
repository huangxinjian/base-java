package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description:  多态
 * @Date: Created in 16:54 2019/1/31
 * @Modified By:
 */
public class Polymorphic {

    /*
      多态的特点：
            1. 多态是方法的多态，而不是属性的多态（多态与属性无关）
            2. 多态有三个必要条件 --- （继承、方法重写、父类引用指向子类对象）
            3. 父类引用指向子类对象后，用该父类引用调用子类重写的方法，这就是多态，父类的方法出现了多种形态
         访问：
            1. 父类引用访问成员变量还是父类自身的成员变量，不能访问子类的成员变量，因为多态与属性无关
            2. 父类引用访问静态方法，还是自身的静态方法，因为静态方法与类相关，无法重写
            3. 构造方法：先调用父类，再调用子类

        父类引用指向子类对象，我们称为 向上转型，也叫自动类型转换
     */
    public static void main(String[] args) {
        Animal a1 = new Cat(); // 向上可以自动转型
        //传的具体是哪一个类就调用哪一个类的方法。大大提高了程序的可扩展性。
        animalCry(a1);
        Animal a2 = new Dog();
        animalCry(a2);//a2为编译类型，Dog对象才是运行时类型。

        //编写程序时，如果想调用运行时类型的方法，只能进行强制类型转换。
        // 否则通不过编译器的检查。
        Dog dog = (Dog)a2;//向下需要强制类型转换
        dog.seeDoor();

        // 报 ClassCastException 异常，类型转换异常，因此 c 实际上是 cat 类型，不能转为dog类型
        Animal c = new Cat();
        Dog d = (Dog)c;
        d.seeDoor();
    }

    // 有了多态，只需要让增加的这个类继承Animal类就可以了。
    static void animalCry(Animal a) {
        a.shout();
    }

    /* 如果没有多态，我们这里需要写很多重载的方法。
     * 每增加一种动物，就需要重载一种动物的喊叫方法。非常麻烦。
    static void animalCry(Dog d) {
        d.shout();
    }
    static void animalCry(Cat c) {
        c.shout();
    }*/

}

class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}
