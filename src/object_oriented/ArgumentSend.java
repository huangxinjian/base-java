package object_oriented;

/**
 * @Author: huangxinjian
 * @Description:  参数传递：值传递、地址传递
 * @Date: Created in 13:59 2019/1/30
 * @Modified By:
 */

class Cat{

    String name ;

    public Cat(String name) {
        this.name = name;
    }
}

public class ArgumentSend {

    /*
    在java中，所有参数的传递都是值传递
                1. 基本类型：传递的是值的副本。即只是拷贝了一份值传递给参数，参数的任何修改不会影响到到原来的值
                2. 引用类型: 传递的是引用的地址，即参数和原来引用都指向了同一个地址，因此参数的修改会影响到原来的值
     */

    int age = 20;

    public static void main(String[] args) {
        ArgumentSend a = new ArgumentSend();
        Cat c = new Cat("猫猫");  //创建一个 cat 对象
        System.out.println(c.name+ "---" + a.age);  //第一次输出cat的name和age
        a.changeCatName(c,a.age);
        System.out.println(c.name+ "---" + a.age);
        /*
        猫猫---20
        狗狗---20
                通过结果可以看出，cat的name被修改了，而age并没有被修改
         */
    }

    public void changeCatName(Cat cat,int age){
        cat.name = "狗狗";
        age = 10;
    }

}
