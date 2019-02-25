package object_oriented2;

/**
 * @Author: huangxinjian
 * @Description:  测试 final 关键字
 * @Date: Created in 11:19 2019/2/7
 * @Modified By:
 */
public class TestFinal {

    /*
    final 可以用来修饰 类、变量、方法

         成员变量： final 修饰成员变量，不需要立即初始化，但必须在构造函数中进行初始化
         局部变量： 需要立即初始化才能使用
          被final修饰的变量称为常量，一经初始化，无法修改

          final修饰的方法不能被重写，但是可以被重载

          final修饰的类不能被继承


        final表示这个变量只能被赋值一次，一旦被赋值之后，就不能够被更改了。

        如果经常希望某个常量可以在一个类中的多个方法使用，可以把这个常量称为 类常量，可以使用关键字 static final 修饰。
            注意：类常量的定义位于 成员变量的位置

     */
    public static void main(String[] args) {

    }
}
